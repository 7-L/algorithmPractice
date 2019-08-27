package leetcode;
import	java.io.InputStreamReader;
import	java.io.BufferedReader;

import java.io.IOException;
import java.util.Arrays;

public class package01 {
    public int countBoat(Integer[] nums, int max) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] <= max) {
                i++;
                j--;
            }else {
                j--;
            }
            count++;
        }
        return count + (j == i ? 1 : 0);
    }
}

class boat{
//    漂流船
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int n = line1.length;
        int limit = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums [i] = Integer.parseInt(line1 [i]);
        }
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (nums[left] + nums[right] > limit) {
                count++;
                right--;
            }else {
                count++;
                left++;
                right--;
            }
        }
        System.out.println(count);
    }
}
