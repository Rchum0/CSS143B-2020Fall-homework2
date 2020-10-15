public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int start = 0;
        int cur = 0;
        int end = nums.length-1;

        while (cur <= end){
            if(nums[cur] == 0){
                int temp = nums[cur];
                nums[cur] = nums[start];
                nums[start] = temp;

                cur++;
                start++;
            }else if()

        }
    }
}
