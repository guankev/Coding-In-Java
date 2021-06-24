package leet_code;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given an array of integers numbers and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */


public class LC001TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        int target = 9;

       String result = IntStream.of(new LC001TwoSum().twoSum(nums, target)).mapToObj(Integer::toString).collect(Collectors.joining(", "));

        System.out.print("[" + result + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        for (int index = 0; index < nums.length - 1; index++) {
            for (int nextIndex = index + 1; nextIndex < nums.length; nextIndex++) {
                if (target == nums[index] + nums[nextIndex]) {
                    return new int[]{index, nextIndex};
                }
            }
        }

        return null;
    }
}
