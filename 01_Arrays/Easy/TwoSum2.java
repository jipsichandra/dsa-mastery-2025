
import java.util.HashMap;
import java.util.Map;
//  two pinter - but only for sorted array and works on value  and this returns only one pair assuing there is only one soulyution for the target given
public class TwoSum2 {

    //  time complexity - O(n) only for sorted array 
    //  if sorting added then O(n log n)
    //    public static int[] twoSum(int[] nums, int target) {
        
    //     int left=0;
    //     int right=nums.length-1;

    //     while(left<right)
    //     {
    //         int sum=nums[left]+nums[right];
    //       if(sum==target)
    //       {
    //          return new int[]{left,right};
    //       }
    //       else if(sum>target)
    //       {
    //          right--;
    //       }else{
    //          left++;
    //       }
    //     }

    //    return new int[]{-1,-1};
    // }

    // Better approach for unsorted Array
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args)
    {
    //    int[] nums={2,7,11,15};
        // int[] nums={0,1,1,1,1,2};
        int[] nums={3,2,4};
       int target=9;

       int[] pairs=twoSum(nums,target);
       for(int i:pairs)
       {
         System.out.print(i+" ");
       }
    }
    
}
