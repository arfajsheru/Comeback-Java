import java.util.Scanner;

class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println("Your number is prime number");
        } else {
            System.out.println("Your number is not prime number");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
