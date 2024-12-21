import java.util.Scanner;

class MinimumTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your first number: ");
//        int num1 = sc.nextInt();
//        System.out.print("Now, Enter your second number: ");
//        int num2 = sc.nextInt()
//        int min = ternary.min(num1, num2);
//        System.out.println("Minimum number is: " + min);


        System.out.print("Please enter your number to check number is even or odd: ");
        int number = sc.nextInt();
        String evenAndOdd = evenAndOdd(number);
        System.out.println("Given number is: "+ evenAndOdd);

    }

    public static int min(int num1, int num2){
        return num1 > num2 ? num2 : num1;
    }

    public static String evenAndOdd(int num){
        return num % 2 == 0 ? "Even" : "Odd";
    }

}
