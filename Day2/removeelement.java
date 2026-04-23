package Day2;

import java.util.Arrays;

public class removeelement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        removeelement obj = new removeelement();

        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int k = obj.removeElement(nums, val);

        System.out.println("New length: " + k);
        System.out.print("Modified array: ");
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}