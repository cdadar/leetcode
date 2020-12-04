package towSum;

import java.util.HashMap;
import java.util.Map;

class Solution  {

  public int[] twoSum(int[] nums, int target) {
    int result;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      result = target - nums[i];
      if (map.containsKey(result)) {
        return new int[]{map.get(result), i};
      }
      map.put(nums[i], i);
    }
    return null;
    // for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if((nums[i]+nums[j])==target){
    //             a[0] = i;
    //             a[1] = j;
    //             return a;
    //         }
    //     }
    // }
    // return null;
  }
}
