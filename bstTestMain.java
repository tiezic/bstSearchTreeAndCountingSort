
/**
 * Class to test creating a bst, and also calling bstSearchTrace
 */
public class bstTestMain {
    public static void main(String[] args) {

        //1. create bst tree
        TreeNode root = new TreeNode(7);
        TreeNode.treeInsert(root, new TreeNode(9));
        TreeNode.treeInsert(root, new TreeNode(5));
        TreeNode.treeInsert(root, new TreeNode(11));

        System.out.println("root: " + root.val + ". root right: " + root.right.val + ". root left: " + root.left.val);
        System.out.println(root.right.right.val);

        //2. call bstSearchTrace for a key we want
        System.out.println(TreeNode.bstSearchTrace(root, 11));
    }


}//end bstTestMain