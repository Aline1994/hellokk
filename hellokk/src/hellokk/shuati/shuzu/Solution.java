package hellokk.shuati.shuzu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
	}
	public static int removeDuplicates(int[] nums) {
		Set set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return set.size();
    }
}