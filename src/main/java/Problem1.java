public class Problem1 {

    /*
     Describe your algorithm here in up to 5 sentences:
     * The algorithm I used first checks if my cur is pointing to a red ball.
     * If it is it's going to swap the start and current index then its going to increment both start and current.
     * If the yellow ball is found somewhere in the center it is at the right place and we are going to increment.
     * Then if the ball green we are going to swap the our current pointer to the end pointer then we decrement the end index.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {

        int start = 0;
        int cur = 0;
        int end = nums.length - 1;

        while (cur <= end) {
            if (nums[cur] == 0) {
                nums[cur++] = nums[start];
                nums[start++] = 0;
            } else if (nums[cur] == 1) {
                cur++;
            } else if (nums[cur] == 2) {
                nums[cur] = nums[end];
                nums[end--] = 2;
            }

        }
    }
}
