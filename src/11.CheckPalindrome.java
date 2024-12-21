import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter your palindrome number: ");
//        int num = sc.nextInt();
//        if(isPalindrome(num, num)){
//            System.out.printf("%d is palindrome number", num);
//        }else {
//            System.out.printf("%d is not palindrome number", num);
//        }

        int number = (int) Math.round((Math.random() * 50) + 1 );

        System.out.println(number);
    }

    public static boolean isPalindrome(int original, int num){
        if(num == 0){
            return original == 0;
        }
        int reverse = reverse(num,0);
        System.out.println(reverse);
        return original == reverse;
    }

    public static  int reverse(int number, int reverse){
        if(number == 0){
            return reverse;
        }
        System.out.println(reverse);
        return reverse(number / 10,reverse * 10 + number % 10);
    }
}


/*121 / 10 = 12, 12 / 10 = 1, 1 / 10 = 0,
0 * 10 + 1 = 1, 1 * 10 + 2 = 12, 12 * 10 + 1 = 121*/



