
/**
 * Class to test creating a bst, and also calling bstSearchTrace
 *                  15        
 *                /    \      
 *              6       18    
 *             / \     /  \   
 *            3   7  17    20 
 *           / \   \          
 *          2   4   13        
 *                 /          
 *                9           
 */
public class bstTestMain {
    public static void main(String[] args) {

        //1. create bst tree
        TreeNode root = new TreeNode(15);

        int[] nodeList = {6, 18, 3, 7, 17, 20, 2, 4, 13, 9};
        for (int i = 0; i < nodeList.length; i++) {
            TreeNode.treeInsert(root, new TreeNode(nodeList[i]));
        }

        System.out.println("root: " + root.val + ". root right: " + root.right.val + ". root left: " + root.left.val);
        System.out.println(root.left.right.right.left.val);

        //2. call bstSearchTrace for a key we want
        System.out.println("Trace list for 13: " + TreeNode.bstSearchTrace(root, 13));
        System.out.println("Trace list for 14: " + TreeNode.bstSearchTrace(root, 14));

    }


}//end bstTestMain