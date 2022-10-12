import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String rev="";
    int len=str.length();
    for(int i=0;i<len;i++){
      rev=str.charAt(i)+rev;
    }
  
    if((str.equals(rev))==true){
      System.out.println("YES");
    }else{
      System.out.println("No");
    }
  }
}
