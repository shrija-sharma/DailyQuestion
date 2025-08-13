import java.util.*;
public class FindPIN {
  public static int smalldigit(int num){
    int s=9;
    while(num>0){
      int digit=num%10;
      if(digit<s){
        s=digit;
      }
      num=num/10;
    }
    return s;
  }
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int ip1=in.nextInt();
    int ip2=in.nextInt();
    int ip3=in.nextInt();
    int ip4=in.nextInt();

    int a=smalldigit(ip1);
    int b=smalldigit(ip2);
    int c=smalldigit(ip3);
    int ans=(a*b*c)+ip4;
    System.out.println(ans);
  }
}
