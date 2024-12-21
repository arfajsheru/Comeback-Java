import java.util.Scanner;

class SumPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to sum (enter 0 to stop) \n");

        int sum = 0;
        while(true){
            System.out.print("Please enter you number: ");
            int number = sc.nextInt();
            if(number == 0 ){
                break;
            }
            if(number < 0) {
                continue;
            }
            sum += number;
        }
        System.out.println("Your positive number sum is: "+ sum);
    }
}
