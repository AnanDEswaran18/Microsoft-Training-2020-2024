class Solution {
    public int numTrees(int n) {
        return catalan(n);
    }
    public int catalan(int n){
        long c=binocoeff(2*n,n);
        return (int)(c/(long)(n+1));
    }
    public long binocoeff(int n,int k){
        long res=1;
        if(k>n-k){
            k=n-k;
        }
        for(int i=0;i<k;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }
}



***********************************************************************************
class Solution {
    public int numTrees(int n) {
        return catalan_number(n);
    }
    public int catalan_number(int n){
        int[] catalan=new int[n+1];
        catalan[0]=catalan[1]=1;
        for(int i=2;i<=n;i++){
            catalan[i]=0;
            for(int j=0;j<i;j++){
            catalan[i]+=catalan[j]*catalan[i-j-1];
        }    
        }
        return catalan[n];
        
    }
}
