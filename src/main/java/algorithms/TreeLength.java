package algorithms;

import java.util.Objects;

public class TreeLength {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(9);
        treeNode.left=treeNode2;
        treeNode.right=treeNode3;
        treeNode3.left=treeNode4;
        treeNode3.right=treeNode5;
        treeNode5.right=treeNode6;
        System.out.println(minDeep(treeNode));
        System.out.println(maxDeep(treeNode));
    }

    /**
     * 树的最小深度
     * @param treeNode
     * @return
     */
    public static int minDeep(TreeNode treeNode){
        if(Objects.isNull(treeNode))return 0;
        if(Objects.isNull(treeNode.left))return 1+minDeep(treeNode.right);
        if(Objects.isNull(treeNode.right))return 1+minDeep(treeNode.left);
        return 1+Math.min(minDeep(treeNode.left),minDeep(treeNode.right));
    }

    /**
     * 树的最大深度
     * @param treeNode
     * @return
     */
    public static int maxDeep(TreeNode treeNode){
        return (Objects.isNull(treeNode))?0:1+Math.max(maxDeep(treeNode.right),maxDeep(treeNode.right));

    }
}
