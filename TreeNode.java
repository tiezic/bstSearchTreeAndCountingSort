
import java.util.ArrayList;
import java.util.List;

/**
 * This class creates tree node objects which contains
 * pointers to left and right nodes
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;


    /**
     * Constructor for TreeNode objects
     */
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }


    /**
     * Method for inserting a new node into bst
     * 
     * @param root tree
     * @param node node to be inserted
     */
    public static void treeInsert(TreeNode root, TreeNode node) {
        
        TreeNode newRoot = null; 
        TreeNode tempRoot = root; 

        while(tempRoot != null) {
            newRoot = tempRoot; //set parentNode to tempRoot/root

            if (node.val < tempRoot.val) {
                tempRoot = tempRoot.left;
            } else {
                tempRoot = tempRoot.right;
            }

        }//end while
        
        if (newRoot == null) {
            root = node;
        } else if (node.val < newRoot.val) {
            newRoot.left = node;
        } else {
            newRoot.right = node;
        }

    }//end TreeInsert


    /**
     * This method will search through nodes, either traversing
     * left or right, in order to find an integer value in the 
     * binary search tree
     * 
     * @param root the root node of the tree
     * @param k the integer value we are looking for
     * @return the list of integers the method goes through, or null
    */
    public static List<Integer> bstSearchTrace(TreeNode root, Integer k) {
        List<Integer> numberTrace = new ArrayList<>();

        if (root == null) {
            return numberTrace;
        }

        numberTrace.add(root.val);

        if (k == root.val) {
            return numberTrace;
        }

        if (k < root.val) {
            numberTrace.addAll(bstSearchTrace(root.left, k));
        } else {
            numberTrace.addAll(bstSearchTrace(root.right, k));
        }

        return numberTrace;

    }//end bstSearchTrace


}//end TreeNode

