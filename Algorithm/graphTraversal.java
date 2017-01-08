import java.util.*;

//Undirected Graph
class Node {
    int _data;
    ArrayList<Nodes> _adjacentNodes = new ArrayList<>();
    public Node(int data) {
        _data = data;
    }
}

public class graphTraversal {
    public static void main(String args[]) {
        
        //Creating the Graph
        Node A = new Node(1);
        Node B = new Node(2);
        CreateLink(B, new ArrayList(A));
        
    }
}
