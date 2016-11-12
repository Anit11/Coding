class node {
    char element;
    node leaf1;
    node leaf2;

    node(char a) {
        element = a;
        leaf1 = null;
        leaf2 = null;
    }
}

public class binaryTree {

    public static void main(String args[]) {
        node head = new node('a');
        head.leaf1 = new node('b');
        head.leaf2 = new node('c');
        head.leaf1.leaf1 = new node('d');
        head.leaf1.leaf2 = new node('e');
        head.leaf2.leaf1 = new node('f');
        head.leaf2.leaf1.leaf2 = new node('g');
        
        
        System.out.println("The Inorder traversal is: ");
        inorderTraversal(head);
        System.out.println("The Preorder traversal is: ");
        preorderTraversal(head);
        System.out.println("The Postorder traversal is: ");
        postorderTraversal(head);

        int count; 
        count = count_node(head);
        System.out.println("The count is :"+count);

        int height;
        height = find_height(head);
        System.out.println("The height of the node is :"+height);
    }

    //left, root, right
    public static void inorderTraversal(node head) {
        
        if(null != head) {
            inorderTraversal(head.leaf1);
            System.out.println(head.element);
            inorderTraversal(head.leaf2);
        }
    }

    //root, left, right
    public static void preorderTraversal(node head) {

        if(null != head) {
            System.out.println(head.element);
            preorderTraversal(head.leaf1);
            preorderTraversal(head.leaf2);
        }
    }

    //left, right, root
    public static void postorderTraversal(node head) {

        if(null != head) {
            postorderTraversal(head.leaf1);
            postorderTraversal(head.leaf2);
            System.out.println(head.element);
        }
    }

    public static int count_node(node head) {
        
        if(head == null) {
            return 0;
        }
        else { 
            return 1 + count_node(head.leaf1) + count_node(head.leaf2);
       }
         
    }


    public static int find_height(node head) {
        
         if(head == null) {
            return 0;
         }
         else if(head.leaf1 == null && head.leaf2 == null) {
            return 1;
         }
         else {
            int temp1 = find_height(head.leaf1);
            int temp2 = find_height(head.leaf2);
            if(temp1 > temp2) {
                return 1 + temp1;
            }
            else {
                return 1 + temp2;
            }
         }
    }
}
