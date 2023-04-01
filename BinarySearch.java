public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        search(nums, target);
    }

    private static int search(int[] nums, int target) {
        int startIndex = 0;
        int lastIndex = nums.length - 1;
        while (startIndex <= lastIndex) {
            int mid = (startIndex + lastIndex) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                lastIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }
}
