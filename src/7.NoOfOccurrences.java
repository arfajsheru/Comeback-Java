import java.util.Scanner;

class NoOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter your element "+ (i + 1)+": ");
            myArr[i] = sc.nextInt();
        }
        System.out.print("Enter your number you want to find: ");
        int number = sc.nextInt();
        int occurrences = occ(myArr, number);
        System.out.println("Number of occurrences is: "+ occurrences);
    }

    public static int occ(int[] myArray, int number){
        int occ = 0;
        for(int num: myArray){
            if(number == num){
                occ++;
            }
        }
        return occ;
    }
}
