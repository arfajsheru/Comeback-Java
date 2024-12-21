import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number, guess = 10;
            do{
                System.out.print("Please enter your number: ");
                number = sc.nextInt();
            } while(number != guess);
            System.out.println("You have the successfully guess the number");

    }

}
