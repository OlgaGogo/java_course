package extra_practice;

public class Palindrome {
    public static void main(String[] args){
        //check if a string is a palindrome
        Palindrome palindrome = new Palindrome();
        String[] arr = {"ab", "ca", "ada", "bf", "aca"};
        String res = palindrome.firstPalindrome(arr);
        System.out.println(res);

    }

    public String firstPalindrome(String[] words){
        for (String w: words){
            if(isPalindrome3(w))
                return w;
        }
        return "";
    }

    //using for-loop (more effective)
    public boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++)
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        return true;
    }

    //using while-loop (more effective)
    private boolean isPalindrome3(String s){
        int i=0, j=s.length()-1;
        while (i<j){
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;

    }
    //using StringBuilder (less effective)
    private boolean isPalindrome2(String s){
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return s.equals(reverse);
    }
}
