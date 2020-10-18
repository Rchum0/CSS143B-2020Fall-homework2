public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    * The algorithm I used to solve this code was two pointer algorithm.
    * When [i] is equal to [j], j gets incremented to skip the duplicate.
    * When [i] doesn't equal to [j] its done checking for the duplicate it
    * Will get copied to nums[i + 1] then repeats.
    Sources
    *https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
    *https://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-java/
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;

    }
}
