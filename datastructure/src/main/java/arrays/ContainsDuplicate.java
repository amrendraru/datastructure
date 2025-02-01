package arrays;

import java.util.HashSet;
import java.util.Set;

/*
* Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
* Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
*/
public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        boolean res = false;
        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums) {
            if(set.contains(num)) {
                res = true;
                break;
            }
            set.add(num);
        }
        set.clear();
        return res;

    }
}
