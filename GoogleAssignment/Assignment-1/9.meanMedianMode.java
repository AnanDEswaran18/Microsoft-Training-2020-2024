import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int sum=0,element=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    int c=1,max=1;
    for(int i=0;i<n;i++){
      c=1;
      arr[i]=sc.nextInt();
      if(map.containsKey(arr[i])){
        c=map.get(arr[i])+1;
        if(c>max){
          max=c;
          element=arr[i];
        }
      }
      map.put(arr[i],c);
      sum+=arr[i];
    }
    int mean=(sum/n);
    System.out.println("mean-"+mean);
    int mid=arr[n/2];
    if(n%2!=0){
       System.out.println("median-"+mid);
    }else{
      mid=(arr[n/2]+arr[(n/2)+1])/2;
      System.out.println("median-"+mid);
    }
    System.out.println("mode-"+element);
  }
}
