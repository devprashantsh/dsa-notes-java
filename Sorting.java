import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int[] nums = {  3, 2,5, 9,10, 14 };
        System.out.println("Original array: " +  Arrays.toString(nums));
        System.out.println("Sorted array: " +  Arrays.toString(selectionSortDescending(nums)));
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++){
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
    // selection sort function ascending order
    public static int[] selectionSort(int[] nums) {
    int minIndex;
    for (int i = 0; i < nums.length; i++ ){
        minIndex = i;
        for ( int j = i + 1; j < nums.length; j++){
            if (nums[j] < nums[minIndex]){
                minIndex = j;
            }
        }
        int temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;
        System.out.println(Arrays.toString(nums));
    }
    
    return nums;
    }

    // selectiion sort function descending order
    public static int[] selectionSortDescending(int[] nums) {
        int maxIndex;
        for (int i = 0; i < nums.length; i++){
            maxIndex = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j]> nums[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
            System.out.println(Arrays.toString(nums));

        }
    

        return nums;
    }
        
}
