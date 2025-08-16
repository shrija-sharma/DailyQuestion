import java.util.HashMap;
import java.util.Scanner;


public class Repeatednum {
public static int repeat(int[] arr) {

boolean nonpos = true;
for (int num : arr) {
if (num > 0) {
nonpos = false;
break;
}
}
if (nonpos)
return 0;
//using hashmap

HashMap<Integer, Integer> map = new HashMap<>();
for (int num : arr) {
if (num <= 0)
continue;
map.put(num, map.getOrDefault(num, 0) + 1);

if (map.get(num) == 2) {
return num;
}
}
return arr[0];
}

//using hashset
// HashSet<Integer> set=new HashSet<>();
  // for(int num:arr){
  // if(num<=0) continue;
  // if(set.contains(num)){
  // return num;
  // }
  // set.add(num);
  // }
  // return arr[0];
  // }
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int[] arr = new int[n];
  for (int i = 0; i < n; i++) {
  arr[i] = in.nextInt();
  }
  int ans = repeat(arr);
  System.out.println(ans);
  }
}


