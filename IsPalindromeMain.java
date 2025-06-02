package PalindromeArray;

import static PalindromeArray.PalindormeCheckMethod.isPalindrome;

public class IsPalindromeMain {
    public static void main(String[] args) {
        int[] MyArray = UtilityArray.MyArray();

        boolean isPalindrome=PalindormeCheckMethod.isPalindrome(MyArray);

        if (isPalindrome(MyArray)) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is not palindrome");
        }
    }
}
