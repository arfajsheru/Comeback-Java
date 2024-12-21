import java.util.Scanner;

class EvenNumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your limit: ");
        int limit = sc.nextInt();
        if(limit <= 0){
            System.out.println("Please enter your positive number");
            return;
        }
        System.out.print("Even numbers up to " + limit + ": ");
        for(int i = 1; i <= limit; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i+", ");
        }
    }
}
