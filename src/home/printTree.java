package home;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2019/10/1.
 */
public class printTree {

    //    先序遍历
    public void preOrderTraverse1(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + "->");
            preOrderTraverse1(root.left);
            preOrderTraverse1(root.right);
        }
    }




    //    先序遍历
    public void preOrderTraverse2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            if (node != null) {
                System.out.println("node  = " + node.val);
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                node = tem.right;
            }
        }
    }

    public void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            if (node != null) {
                System.out.println(node.val);
                stack.push(node);
            } else {
                TreeNode temp = stack.pop();
                node = temp.right;
            }
        }
    }


    //  中序遍历
    public void inOrderTraverse(TreeNode root) {
        if (root != null) {
            inOrderTraverse(root.left);
            System.out.print(root.val + "->");
            inOrderTraverse(root.right);
        }
    }

    //  中序遍历
    public void inOrderTraverse1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                System.out.print(tem.val + "->");
                node = tem.right;
            }
        }
    }

    //    中序遍历
    public void inOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                TreeNode temp = stack.pop();
                System.out.println(temp.val);
                node = temp.right;
            }
        }
    }


    //    后序遍历
    public void postOrderTraverse(TreeNode root) {
        if (root != null) {
            postOrderTraverse(root.left);
            postOrderTraverse(root.right);
            System.out.println(root.val);
        }
    }

    //    后序遍历
    public void postOrderTraverse1(TreeNode root) {
        TreeNode cur, pre = null;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            cur = stack.peek();
            if ((cur.left == null && cur.right == null) || (pre != null && (pre == cur.left || pre == cur.right))) {
                System.out.print(cur.val + "->");
                stack.pop();
                pre = cur;
            } else {
                if (cur.right != null)
                    stack.push(cur.right);
                if (cur.left != null)
                    stack.push(cur.left);
            }
        }
    }


    //    层次遍历
    public void levelOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + "->");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }


}


class TreeNode {
    TreeNode val;
    TreeNode left;
    TreeNode right;

    TreeNode(TreeNode val) {
        this.val = val;
    }

}
