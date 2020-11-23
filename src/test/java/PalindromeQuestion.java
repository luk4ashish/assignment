import java.util.Scanner;

public class PalindromeQuestion {


    public static String checkOddEven(int num){
        String result=null;
        if ( num % 2 == 0 )
               result="even";
            else
                result="Odd";

     return result;
    }

    public static void identifyPalindrome(int len,int alphalen, int digLen,int spclLen){

        if (PalindromeQuestion.checkOddEven(len).equalsIgnoreCase("even")||alphalen==0) {
            if (PalindromeQuestion.checkOddEven(alphalen).equalsIgnoreCase("even")) {
                if (PalindromeQuestion.checkOddEven(spclLen).equalsIgnoreCase("even") || spclLen == 0)
                    if (PalindromeQuestion.checkOddEven(spclLen).equalsIgnoreCase("even") || spclLen == 0)
                        System.out.println("Valid palindrome");
                        PalinromeFromation.generatePalindrome(len,alphalen,digLen,spclLen);
            } else {
                System.out.println("Invalid palindrome");
            }
        }

        else if (PalindromeQuestion.checkOddEven(len).equalsIgnoreCase("Odd")){
            if(PalindromeQuestion.checkOddEven(alphalen).equalsIgnoreCase("even") || alphalen==0){
                if(PalindromeQuestion.checkOddEven(digLen).equalsIgnoreCase("even")||digLen==0) {
                    System.out.println("Valid Palindrome");
                    PalinromeFromation.generatePalindrome(len,alphalen,digLen,spclLen);
                }
                else if(PalindromeQuestion.checkOddEven(digLen).equalsIgnoreCase("odd")){
                    if(PalindromeQuestion.checkOddEven(spclLen).equalsIgnoreCase("even")||spclLen==0){
                        System.out.println("Valid Palindrome");
                        PalinromeFromation.generatePalindrome(len,alphalen,digLen,spclLen);
                    }
                   //6 System.out.println("Invalid Palindrome");
                }
            }
            else if(PalindromeQuestion.checkOddEven(alphalen).equalsIgnoreCase("Odd")){
                if(PalindromeQuestion.checkOddEven(digLen).equalsIgnoreCase("even")||digLen==0){
                    if(PalindromeQuestion.checkOddEven(spclLen).equalsIgnoreCase("even")||spclLen==0){
                        System.out.println("Valid Palindrome");
                        PalinromeFromation.generatePalindrome(len,alphalen,digLen,spclLen);
                    }
                }
                else {
                    System.out.println("Invalid Palindrome");
                }
            }

        }

    }




public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter length:");
    int a= sc.nextInt();
    System.out.println("Enter Number of alphabets should be less than " +a);
    int alpha = sc.nextInt();
    System.out.println("Enter Number of digits should be less than "+alpha+" or 0");
    int digits = sc.nextInt();
    System.out.println("Enter Number of special characters should be less than "+digits+ " or 0");
    int sp = sc.nextInt();
    int total=alpha+digits+sp;
    if(total==a) {
        PalindromeQuestion.identifyPalindrome(a, alpha, digits, sp);
    }
    else {
        System.out.println("total sum doesn't match with "+a);
    }
}
}
