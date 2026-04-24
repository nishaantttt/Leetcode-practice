package Day3;

public class jumpgame {

    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;

        int maxind = 0;

        for (int i = 0; i < nums.length; i++) {
            if (maxind < i) return false;
            maxind = Math.max(maxind, i + nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }
}