int min(int a,int b,int c){
    return (a<=b)?(a<=c)?a:c:(b<=c)?b:c;
}

int minDistance(char * word1, char * word2){
    int m=strlen(word1);
    int n=strlen(word2);
    int edit[m+1][n+1];
    for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            if(i==0){
                edit[i][j]=j;
            }
            else if(j==0){
                edit[i][j]=i;
            }
            else if(word1[i-1]==word2[j-1]){
                edit[i][j]=edit[i-1][j-1];
            }
            else{
                edit[i][j]=1+min(edit[i][j-1],edit[i-1][j],edit[i-1][j-1]);
            }
        }
    }
    return edit[m][n];
}
