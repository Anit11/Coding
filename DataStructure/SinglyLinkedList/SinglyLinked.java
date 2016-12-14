public class SinglyLinked {
    
    public static void main(String args[]) {
        /*
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
/*        int total;

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
        */

        addLink a_link = new addLink();
        listLink l_link = new listLink();
        
        num_node head1 = new num_node();

        head1.data = 4;
        head1.next = null;

        head1 = a_link.addNumLink(head1, 2);
        head1 = a_link.addNumLink(head1, 1);
        head1 = a_link.addNumLink(head1, 5);
        head1 = a_link.addNumLink(head1, 6);
        head1 = a_link.addNumLink(head1, 7);

/*
        System.out.println("Element before insert");
        l_link.listNumLink(head1);
        System.out.println("Inserting element 3");
        num_node newLink = new num_node(3);

        head1 = sortedInsert(head1, newLink);

        System.out.println("Element after insert");
        l_link.listNumLink(head1);
        head1 = add_loop(head1);

        boolean loop_status = find_loop(head1);
        if(loop_status == false) {
            System.out.println("There is no loop present in the linkedlist");
        }
        else {
            System.out.println("There is loop in the linkedlist");
        }
*/

        num_node res = nth_last_element(head1, 1);
        System.out.println(res.data);
        
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

    private static int countListNum(num_node head) {
        
        num_node temp = head;
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

    public static num_node sortedInsert(num_node head, num_node newNode) {
        
        num_node temp = head;
        num_node prev = head;
        
        if(temp == null) {
            head = newNode;
        }
        else if(temp.data >= newNode.data) {
            newNode.next = temp;
            head = newNode;
        }
        else {
            temp = temp.next;
        }

        while(temp != null) {
            if(temp.next == null && temp.data <= newNode.data) {
                temp.next = newNode;
                break;
            }
            else if(temp.data > newNode.data) {
                num_node temp1 = prev.next;
                prev.next = newNode;
                newNode.next = temp1;
                break;
            }
            else {
                temp = temp.next;
                prev = prev.next;
            }
        }

        return head;
    }

    public static boolean find_loop(num_node head) {
        
        num_node temp = head;
        num_node temp1 = temp.next;

        while(temp != null && temp1 != null) {
            if(temp == temp1) {
                System.out.println(temp.data);
                System.out.println(temp1.data);
                return true;
            }
            else {
                temp = temp.next;
                for(int i=0; i<2; i++) {
                    if(temp1.next != null) {
                        temp1 = temp1.next;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static num_node add_loop(num_node head) {
        
        num_node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        return temp;
    }

    public static num_node nth_last_element(num_node head, int n) {
        
        num_node temp = head;

        for(int i = 0; i<n; i++) {
            if(temp != null) {
                temp = temp.next;
                continue;
            }
            System.out.println("There are less than "+n+" elements");
        }
        
        while(temp.next != null) {
            temp = temp.next;
            head = head.next;
        }

        return head;
    }


}

