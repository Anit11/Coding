import java.util.*;

public class treeClass
{
    String data;
    treeClass left = null;
    treeClass right = null;

    private void setData(String input)
    {
        data = input;
    }

    private String getData()
    {
        return data;
    }

    private void setLeft(treeClass obj)
    {
        left = obj;
    }

    private treeClass getLeft()
    {
        return left;
    }

    private void setRight(treeClass obj)
    {
        right = obj;
    }

    private treeClass getRight()
    {
        return right;
    }
}
