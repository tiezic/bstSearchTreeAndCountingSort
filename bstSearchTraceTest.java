import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;


public class bstSearchTraceTest {
    
    @Test
    void testSearchTraceSuccess() {
        //create bst
        TreeNode root = new TreeNode(15);

        int[] nodeList = {6, 18, 3, 7, 17, 20, 2, 4, 13, 9};
        for (int i = 0; i < nodeList.length; i++) {
            TreeNode.treeInsert(root, new TreeNode(nodeList[i]));
        }

        //expected
        List<Integer> expected = Arrays.asList(15, 6, 7, 13);

        //actual
        List<Integer> result = TreeNode.bstSearchTrace(root, 13);

        assertEquals(expected, result);

    }//end testSearchTrace


    @Test
    void testSearchTraceFail() {
        //create bst
        TreeNode root = new TreeNode(15);

        int[] nodeList = {6, 18, 3, 7, 17, 20, 2, 4, 13, 9};
        for (int i = 0; i < nodeList.length; i++) {
            TreeNode.treeInsert(root, new TreeNode(nodeList[i]));
        }

        //expected
        List<Integer> expected = Arrays.asList(15, 6, 7, 13);

        //actual
        List<Integer> result = TreeNode.bstSearchTrace(root, 14);

        assertEquals(expected, result);

    }//end testSearchTrace


}//end bstSearchTraceTest