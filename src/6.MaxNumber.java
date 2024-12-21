import java.util.Scanner;

class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter your element "+ (i + 1)+": ");
            myArr[i] = sc.nextInt();
        }

        int Max = Integer.MIN_VALUE;
        for(int num: myArr){
            if(Max < num){
                Max = num;
            }
        }
        System.out.println("Maximum number is: "+ Max);
    }
}
