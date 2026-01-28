package Startups;

public class Logic {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        /*
        * class Solution {
    public int[] twoSum(int[] nums, int target) {
        //prepare memory
      HashMap<Integer,Integer> map = new HashMap<>();
     //iterate for? --> each
      for(int i=0;i<nums.length;i++){
        //condition to get ans for the first ele checking
        int comp = target - nums[i];
        if(map.containsKey(comp)) return new int[] {map.get(comp),i};//immidiate return is also possible
        //then operation for next elements
        map.put(nums[i],i);
      }
      //returning stored ans after condition satisfaction
    return new int[] {-1,-1};
    }
}
        * */

    }
}
