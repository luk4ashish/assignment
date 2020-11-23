import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PalinromeFromation {

    public static void generatePalindrome (int size,int strLen,int numLen,int spcLen) {
        String capitalCaseLetters = "A";
        String specialCharacters = "@";
        String numbers = "1";
        PalinromeFromation f = new PalinromeFromation();
        List<String> stringArray = new ArrayList<String>();
        List<String> integerArray = new ArrayList<String>();
        List<String> spclCharacterArray = new ArrayList<String>();
        List<String> palindrome = new ArrayList<String>();
        if (PalindromeQuestion.checkOddEven(size).equalsIgnoreCase("Odd") &&
                (PalindromeQuestion.checkOddEven(strLen).equalsIgnoreCase("Even") || strLen == 0)
                    && (PalindromeQuestion.checkOddEven(numLen).equalsIgnoreCase("Even") || numLen == 0)
                    && PalindromeQuestion.checkOddEven(spcLen).equalsIgnoreCase("Odd")) {
                        for (int i = 0; i < strLen / 2; i++) {
                            stringArray.add(capitalCaseLetters);
                        }
                        for (int j = 0; j < numLen / 2; j++) {
                            integerArray.add(numbers);
                        }
                        for (int k = 0; k <spcLen; k++) {
                            spclCharacterArray.add(specialCharacters);
                        }
                palindrome.add( stringArray.toString()+integerArray.toString()+spclCharacterArray.toString()+integerArray.toString()+stringArray.toString());
                System.out.println("Palindrome: "+palindrome.toString());
        }
        if (PalindromeQuestion.checkOddEven(size).equalsIgnoreCase("Odd") &&
                (PalindromeQuestion.checkOddEven(strLen).equalsIgnoreCase("Even") || strLen == 0)
                && (PalindromeQuestion.checkOddEven(numLen).equalsIgnoreCase("Odd"))
                && PalindromeQuestion.checkOddEven(spcLen).equalsIgnoreCase("Even")||spcLen==0) {
            for (int i = 0; i < strLen / 2; i++) {
                stringArray.add(capitalCaseLetters);
            }
            for (int j = 0; j < numLen; j++) {
                integerArray.add(numbers);
            }
            for (int k = 0; k <spcLen/2; k++) {
                spclCharacterArray.add(specialCharacters);
            }
            palindrome.add( stringArray.toString()+spclCharacterArray.toString()+integerArray.toString()
                    +spclCharacterArray.toString()+stringArray.toString());
            System.out.println("Palindrome: "+palindrome.toString());
        }
        if (PalindromeQuestion.checkOddEven(size).equalsIgnoreCase("Odd") &&
                (PalindromeQuestion.checkOddEven(strLen).equalsIgnoreCase("Odd") || strLen == 0)
                && (PalindromeQuestion.checkOddEven(numLen).equalsIgnoreCase("Even"))
                && PalindromeQuestion.checkOddEven(spcLen).equalsIgnoreCase("Even")||spcLen==0) {
            for (int i = 0; i < strLen; i++) {
                stringArray.add(capitalCaseLetters);
            }
            for (int j = 0; j < numLen/2; j++) {
                integerArray.add(numbers);
            }
            for (int k = 0; k <spcLen/2; k++) {
                spclCharacterArray.add(specialCharacters);
            }
            palindrome.add(integerArray.toString()+spclCharacterArray.toString()+stringArray.toString()
                    +spclCharacterArray.toString()+integerArray.toString() );
            System.out.println("Palindrome: "+palindrome.toString());
        }

        if (PalindromeQuestion.checkOddEven(size).equalsIgnoreCase("Even") &&
                (PalindromeQuestion.checkOddEven(strLen).equalsIgnoreCase("Even") || strLen == 0)
                && (PalindromeQuestion.checkOddEven(numLen).equalsIgnoreCase("Even") || numLen == 0)
                && PalindromeQuestion.checkOddEven(spcLen).equalsIgnoreCase("Even")|| numLen == 0) {


            for (int i = 0; i < strLen / 2; i++) {
                stringArray.add(capitalCaseLetters);
            }
            for (int j = 0; j < numLen / 2; j++) {
                integerArray.add(numbers);
            }
            for (int k = 0; k <spcLen/2; k++) {
                spclCharacterArray.add(specialCharacters);
            }
            palindrome.add(stringArray.toString()+integerArray.toString()+spclCharacterArray.toString()
                    +spclCharacterArray.toString()+integerArray.toString()+stringArray.toString());

            System.out.println("Palindrome: "+palindrome.toString());
        }
    }
}
