import java.util.*;

public class MergeSortedArray {
    public static void mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {
        /**** method 1 *****/
        for (int i = 0; i < n; i++)
            nums1[m + i] = nums2[i];
        Arrays.sort(nums1);
    }

    /***** method 2 ******/
    /*
    private static int[] mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {
        int[] temp = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                temp[k++] = nums1[i++];

            else
                temp[k++] = nums2[j++];
        }

        while (i < m)
            temp[k++] = nums1[i++];

        while (i < n)
            temp[k++] = nums2[j++];

        return temp;

    }
    */
}