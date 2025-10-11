import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//  two pinter - but only for sorted array and works on value
public class TwoSum1 {
       public static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> pairs=new ArrayList<>();
        int left=0;
        int right=nums.length-1;

        while(left<right)
        {
            int sum=nums[left]+nums[right];
          if(sum==target)
          {
             pairs.add(new int[]{nums[left],nums[right]});
             left++;
             right--;
          }
          else if(sum>target)
          {
             right--;
          }else{
             left++;
          }
        }

       return pairs;
    }
    public static void main(String[] args)
    {
    //    int[] nums={2,7,11,15};
        int[] nums={0,1,1,1,1,2};
       int target=2;

       List<int[]> pairs=twoSum(nums,target);
       for(int[] i:pairs)
       {
         System.out.print(Arrays.toString(i)+" ");
       }
    }
    
}
