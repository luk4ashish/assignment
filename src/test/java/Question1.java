import java.util.Scanner;

public class Question1 {


    public static String checkOddEven(int num){
        String result=null;
        if ( num % 2 == 0 )
               result="even";
            else
                result="Odd";

     return result;
    }

    public static void identifyPalindrome(int len,int alphalen, int digLen,int spclLen){

        if (Question1.checkOddEven(len).equalsIgnoreCase("even")){
            if(Question1.checkOddEven(alphalen).equalsIgnoreCase("even")){
                if (Question1.checkOddEven(spclLen).equalsIgnoreCase("even")|| spclLen==0)
                    if (Question1.checkOddEven(spclLen).equalsIgnoreCase("even") || spclLen == 0)
                        System.out.println("Valid palindrome");


            }
            else {
                if(alphalen==0){
                    System.out.println("valid Palindrome");

                }
                System.out.println("Invalid palindrome");
            }
        }
        else if (Question1.checkOddEven(len).equalsIgnoreCase("Odd")){
            if(Question1.checkOddEven(alphalen).equalsIgnoreCase("even") || alphalen!=0){
                System.out.println("Valid Palindrome");

            }
            else {
                if(alphalen==0){
                    System.out.println("valid Palindrome");

                    }
                }
                System.out.println("Not a valid Palindrome");
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
        Question1.identifyPalindrome(a, alpha, digits, sp);
    }
    else {
        System.out.println("total sum doesn't match with "+a);
    }
}
}
