import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Map<Character,Integer> map=new LinkedHashMap<>();
    String str=sc.nextLine();
    int len=str.length();
    int c=1;
    for(int i=0;i<len;i++){
      c=1;
      if(map.containsKey(str.charAt(i))){
        c=map.get(str.charAt(i))+1;
      }
      map.put(str.charAt(i),c);
    }
    for(Map.Entry<Character,Integer> entry:map.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }
  }
}
