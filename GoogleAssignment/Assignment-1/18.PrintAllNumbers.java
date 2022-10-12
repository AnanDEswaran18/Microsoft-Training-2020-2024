import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    digits(n);
    
  }
  public static void digits(int n){
    int r=n%10;
    if((n/10)>0){
    digits(n/10);
    } 
    System.out.println(r);
    
  }
}
