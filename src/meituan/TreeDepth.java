package meituan; /**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年07月15日 14:09
 * @version V1.0
 */

/**
 * @author hzx
 * @createTime 15 14:09
 * @description
 */
public class TreeDepth {
    /*
      题目描述
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
*/
    public int depth(TreeNode root) {
        if (root != null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
