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
}
