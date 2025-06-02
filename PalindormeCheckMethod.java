package PalindromeArray;

public class PalindormeCheckMethod {

    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
