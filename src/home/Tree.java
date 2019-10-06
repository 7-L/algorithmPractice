/**
 * Created by Administrator on 2019/10/1.
 */
package home;
public class Tree {
    private int value;        //节点的值
    private TreeNode node;        //此节点，数据类型为Node
    private TreeNode left;        //此节点的左子节点，数据类型为Node
    private TreeNode right;       //此节点的右子节点，数据类型为Node

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public Tree(int value) {
        this.value=value;
        this.left=null;
        this.right=null;
    }
    public String toString() {         //自定义的toString方法，为了方便之后的输出
        return this.value+" ";
    }
}
