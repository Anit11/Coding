import java.io.*;

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
        /*head.leaf1.leaf1 = new node('d');
        head.leaf1.leaf2 = new node('e');
        */

        System.out.println("The Inorder traversal is: ");
        inorderTraversal(head);
        System.out.println("The Preorder traversal is: ");
        preorderTraversal(head);
        System.out.println("The Postorder traversal is: ");
        postorderTraversal(head);
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
}
