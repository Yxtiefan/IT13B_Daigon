public class Palindrome {
    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";
        
        System.out.println(word1 + " is " + (isPalindrome(word1) ? "a palindrome." : "not a palindrome."));
        System.out.println(word2 + " is " + (isPalindrome(word2) ? "a palindrome." : "not a palindrome."));
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}