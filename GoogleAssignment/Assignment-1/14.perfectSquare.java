import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=(int)Math.sqrt(n);
    if(s*s==n){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    
  }
}
