package TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        //Convert to lowercase
        s=s.toLowerCase();
        //remove non alphanumeric
        s=s.replaceAll("[^a-z0-9]","");

        //length of string
        int n=s.length();

        for (int i=0;i<n/2;i++){
            if (s.charAt(i)!=s.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
