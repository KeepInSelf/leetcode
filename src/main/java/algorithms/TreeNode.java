package algorithms;

public class TreeNode {

    TreeNode left;
    TreeNode right;
    int value;
    TreeNode(int value){
        this.value=value;
    }
    @Override
    public String toString() {

        return "TreeNode{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }

}
