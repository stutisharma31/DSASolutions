class validpalindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int start=0;
        int last=s.length()-1;
        while(start<=last){
            if(s.charAt(start) != s.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;  
    }
}