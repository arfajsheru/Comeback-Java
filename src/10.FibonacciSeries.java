import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            System.out.print(fibonacci(i) + ", ");
        }
    }

    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        return fibonacci(num - 2) + fibonacci(num - 1);
    }
}
