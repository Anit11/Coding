public class addLink {

    public node addtheLink(node head, String data) {
        
        node n = new node();
        
        n.data = data;
        n.next = head;
        head = n;

        return head;

    }
}
