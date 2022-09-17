import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[] = new int[n];
        for(int i=0;i<n;i++){
            Arr[i]=sc.nextInt();
        }
        Arrays.sort(Arr);
        int num = Arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(Arr[i]<num){
                System.out.print(Arr[i]);
                break;
            }
        }
    }
}

//5           ->size
//1 2 3 4 4   ->arrayElements
//3           ->secondLargestElement in the array
