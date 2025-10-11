//  using HashMap O(n) Time Complexity

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum{
     public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;

        List<int[]> pairs=findPair(nums,target);

        for(int[] i:pairs)
        {
          System.out.println(Arrays.toString(i)+" ");
        }
     }

     public static List<int[]> findPair(int[] nums,int target)
     {
        List<int[]> pairs=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];

            if(map.containsKey(complement))
            {
                pairs.add(new int[]{map.get(complement),i});
            }
            map.put(nums[i],i);
        }
        return pairs;
     }
}