import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==0){
      System.exit(0);
    }
    for(int i=1;i*i<=n;i++){
      if(i*i==n && n/i==i){
        System.out.println("YES");
        System.exit(0);
      }
      
    }
    System.out.println("NO");
  }
}
