import java.util.Stack;

public class NextGreaterElementII {
      public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            while(st.size()>0 && nums[st.peek()]<=nums[i%n]){
                st.pop();
            }
            ans[i%n]= st.isEmpty()? -1 : nums[st.peek()];
            st.push(i%n);
        }   
        return ans;
    }
}
