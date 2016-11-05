public class SinglyLinked {
    
    public static void main(String args[]) {
        node head = new node();
        
        head.data = "Start";
        head.next = null;

        addLink a_link = new addLink();

        head = a_link.addtheLink(head, "My First Entry");
        head = a_link.addtheLink(head, "My Second Entry");
        head = a_link.addtheLink(head, "My Third Entry");

/*        listLink l_link = new listLink();

        l_link.listtheLink(head);
        
        deleteList d_list = new deleteList();

        head = d_list.deletetheList(head);

        l_link.listtheLink(head);
*/
        int total;

        total = countList(head);
        System.out.println("The number of links are "+total);

        String NthElement = getNthElement(head, 2);
        System.out.println("The Nth Element is "+NthElement);

        head = pop(head);
        if(head == null) {
            System.out.println("No elements in the list");
        }
        else {
            System.out.println("Success");
        }
        
        head = insertNth(head, 2, "inserted element");

        total = countList(head);
        System.out.println("The number of links are "+total);
        
    }

    private static int countList(node head) {
        
        node temp = head;
        int counter = 0;

        while(temp != null) {
            counter++;
            temp = temp.next;
        }

        return counter;
    }

    private static String getNthElement(node head, int n) {
        
        node temp = head;

        if(n==1) {
            return head.data;
        }
        else {
            for(int i=1; i<n; i++) {
               temp = temp.next; 
            }
        
            String element = temp.data;
            return element;
       }
    }

    private static node pop(node head) {
       
       if(head != null) {
           head = head.next;
           return head;
       }
       else {
           return null;
       }
    }

    private static node insertNth(node head, int n, String data){
        
        node temp = head;
        node prev = head;
        node current = head;

        for(int i=0; i<n; i++) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = current;
        current.next = temp;
        current.data = data;

        return head;
    }
}

