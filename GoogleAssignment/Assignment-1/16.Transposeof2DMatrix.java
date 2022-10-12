import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int[][] mat=new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        mat[i][j]=sc.nextInt();
      }
    }
    for(int j=0;j<n;j++){
      for(int i=0;i<m;i++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
}
