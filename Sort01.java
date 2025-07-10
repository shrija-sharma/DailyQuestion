public class Sort01 {
      public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int n=arr.length;
        int i=0,j=n-1;
        while(i<=j){
            if(arr[i]==0){
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
