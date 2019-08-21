package algorithm;

import Practice.ListNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : hzx
 * @version V1.0
 * @Project: nowcoder_test
 * @Package algorithm
 * @Description: TODO
 * @date Date : 2019年08月21日 15:18
 */
public class a1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }

    class Solution3 {
        public ListNode partition(ListNode head, int x) {
            ListNode less_header = new ListNode(-1);
            ListNode less = less_header;
            ListNode more_header = new ListNode(-1);
            ListNode more = more_header;
            ListNode node = head;
            while (node != null) {
                if (node.val < x) {
                    less.next = node;
                    less = less.next;
                } else if (node.val >= x) {
                    more.next = node;
                    more = more.next;
                }
                node = node.next;
            }
            less.next = more_header.next;
            more.next = null; //新链表尾节点需要置为null，否则可能成环
            return less_header.next;
        }
    }





class Solution35{
    public int searchInsert(int[] nums, int target) {
        int res = Arrays.binarySearch(nums,target);
        if(res>=0)return res;
        else return -res-1;

    }
}

    public static void main(String[] args) {
        // 打印一个4行的三角形
        // 外层循环打行
        int height = 8;
        int half = height / 2;
        for (int i = 1; i <= height; i++) {
            // 打空格
          /*  for (int k = 1; k <=4-i; k++) {
                System.out.print(" ");// 注意此处输出不换行
            }*/
            // 内层循环打列
            if(i<=half){
                for (int j = 1; j <= i*2-1; j++) {
                    // 每循环一次打一个*
                    System.out.print("*");// 注意此处不换行，每次打到一行上面
                }
                // 每打完一行就换行
                System.out.println();
            }else{
//                int k;
                for (int k =(height-i+1)*2-1; k >0 ; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }




}
