import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++){
      for(int j=0;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print(" "+fact(i)/(fact(i-j)*fact(j)));
      }
      System.out.println();
    }
  }
  public static int fact(int n){
    if(n==0){
      return 1;
    }else{
      return n*fact(n-1);
    }
  }
}
