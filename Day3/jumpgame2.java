package Day3;

public class jumpgame2 {

    public static int jump(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;

        int near = 0, far = 0, jumps = 0;

        while (far < nums.length - 1) {
            int farthest = far;

            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            // if we can't move forward → unreachable
            if (farthest == far) return -1;

            near = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums)); // 2
    }
}