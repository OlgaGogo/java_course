package extra_practice;

public class Palindrome {
    public static void main(String[] args){
        //check if a string is a palindrome
        Palindrome palindrome = new Palindrome();
        String[] arr = {"ab", "ca", "ada", "bf", "aca"};
        String res = palindrome.firstPalindrome(arr);
        System.out.println(res);

    }
    //using for-loop (more effective)
    public boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words){
        for (String w: words){
            if(isPalindrome(w)){
                return w;
            }
        }
        return "";
    }

    //using StringBuilder (less effective)
    private boolean isPalindrome2(String s){
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return s.equals(reverse);
    }
}
