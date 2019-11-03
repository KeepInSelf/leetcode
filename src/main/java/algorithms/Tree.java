package algorithms;

import java.util.*;

/**
 * 102. 二叉树的层次遍历
 */
public class Tree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);

        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode.left=treeNode2;
        treeNode.right=treeNode3;
        treeNode3.left=treeNode4;
        treeNode3.right=treeNode5;
        System.out.println(levelOrder2(treeNode));
    }

    /**
     * 广度优先算法
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root){
        ArrayList<List<Integer>> lists = new ArrayList<>();
        if(Objects.isNull(root)) return lists;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();
                level.add(node.value);
                if(Objects.nonNull(node.right)){
                    queue.add(node.right);
                }
                if(Objects.nonNull(node.left)){
                    queue.add(node.left);
                }
            }
            lists.add(level);
        }
        return lists;
    }



    /**
     * 深度优先
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder2(TreeNode root){
        ArrayList<List<Integer>> lists = new ArrayList<>();
        dfs(lists,root,0);
        return lists;
    }

    public static void dfs(List<List<Integer>> result,TreeNode node,int level){
        if (Objects.isNull(node))return;

        //判断当前层第一个
        if(result.size()<level+1){
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.value);
        dfs(result,node.left,level+1);
        dfs(result,node.right,level+1);
    }


}
