import java.util.*;

public class buildTree
{
    public static treeClass buildTreeNode(treeClass currObj, treeClass parObj)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input data: ");
        String item = sc.next();

        if(parNode.left != null)
        {
            currObj.data = item;
            parObj.left = currObj;
            return currObj;
        }
        else if(parNode.right != null)
        {
            currObj.data = item;
            parObj.right = currObj;
            return currObj;
        }
        else
        {
            System.out.println("Error: The child node cannot be created to parent node");
        }
    }
}
        
        
