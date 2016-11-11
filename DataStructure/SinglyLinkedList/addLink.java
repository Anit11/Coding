public class addLink {

    public node addtheLink(node head, String data) {
        
        node n = new node();
        
        n.data = data;
        n.next = head;
        head = n;

        return head;

    }

    public num_node addNumLink(num_node head, int data) {
        
        num_node n = new num_node(data);
        n.next = head;
        head = n;

        return head;
    }
}
