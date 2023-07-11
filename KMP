class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        int pattern_len=needle.length();
        //now pehele me LPS nikalunga
        int lps[]=new int[pattern_len+1];
        int j=0;
        for(int i=1;i<pattern_len;i++){
            j=lps[i-1];
            while(j>0&&needle.charAt(j)!=haystack.charAt(i)){
                j=lps[j-1];
            }
            if(needle.charAt(j)==haystack.charAt(i)){
                j++;
            }
            lps[i]=j;
        }
        int i=0;
         j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==pattern_len){
                return (i-j);
            }else if(i<haystack.length()&&haystack.charAt(i)!=needle.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }
}
