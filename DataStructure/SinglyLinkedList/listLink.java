public class listLink {
    
    public void listtheLink(node head) {
        
        node temp = head;

        if(temp != null) {
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void listNumLink(num_node head) {
        
        num_node temp = head;

        if(temp != null) {
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
