import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);
        
        // int i=0;
        // while(i<=n){
        //     sum+=i;
        //     i++;
        // }
        // System.out.print(sum);
	}
}
