public class ExerciseOne {
    public static void main(String args[]) {
      ExerciseOne ex01 = new ExerciseOne();

      System.out.println(ex01.reverseString("hello world"));
      System.out.println(ex01.reverseString("Dad"));
      System.out.println(ex01.reverseString("Bsuiness School"));
      
      // Uncomment the following statements after finishing Exercise Four
    //   System.out.println(ex01.isStringPalindrome("hello world"));
    //   System.out.println(ex01.isStringPalindrome("Dad"));
    //   System.out.println(ex01.isStringPalindrome("radar"));
    }
    
    // Exercise One
    private String reverseString(String word) {
        
        String revword = "";
        for (int i = word.length()-1;i >= 0;i--){
            revword = revword + word.charAt(i);
        }
        return revword;
    }
    
    // Exercise Four
    private boolean isStringPalindrome(String word) {
        // Complete this method to deermine if the given word is a palindrome
        return false;
    }
}
