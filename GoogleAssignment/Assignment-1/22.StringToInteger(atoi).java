class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int len=s.length();
        int sign=1;
        long ans=0;
        if(len==0){
            return 0;
        }
        if(s.charAt(0)=='-'){
            sign=-1;
        }
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int index=(s.charAt(0)=='+'|| s.charAt(0)=='-')?1:0;
        while(index<len){
            if(!Character.isDigit(s.charAt(index))){
                break;
            }
            ans=(ans*10)+(s.charAt(index)-'0');
            if(sign==-1 && (ans*-1)<min){
                return min;
            }
            if(sign==1 && (ans)>max){
                return max;
            }
            index++;
        }
        return (int)ans*sign;
    }
}
