package leet_code;

public class LC003RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};

        System.out.print("Original: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        nums = new LC003RunningSumof1dArray().runningSum(nums);

        System.out.print("\nUpdated: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
