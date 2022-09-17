import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int gcd=1;
        int A = sc.nextInt(),B=sc.nextInt();
        for(int i=2;i<=A && i<=B; i++){
            if(A%i==0 && B%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        //System.out.print((A*B)/gcd);
    }
}
