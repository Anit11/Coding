/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author anu
 */
/* package codechef; // don't place package name! */
class nodeStruct {

    nodeStruct left;
    String data;
    nodeStruct right;

    public nodeStruct() {
        left = null;
        data = null;
        right = null;
    }
}

public class LinkedList
{

    nodeStruct nodestruct = new nodeStruct();

    public static void main(String[] args) throws java.lang.Exception {
        String data;
        nodeStruct head = null;
        LinkedList obj = new LinkedList();

        addLastNode(5);
        addLastNode(3);
        addLastNode(4);
        

        /*
        System.out.println("Enter your option: ");
        System.out.println("1.Add a node");
        System.out.println("2.Delete a node");
        System.out.println("3.Display the nodes");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (head == null) {
                        System.out.println("Enter the data");
                        data = sc.next();
                        obj.addLastNode(data);
                    } else {
                        System.out.println("Enter the data");
                        data = sc.next();
                        obj.addLastNode(head, data);
                    }

                case 2:
                    System.out.println("Enter the data to be deleted");
                    data = sc.next();
                    obj.deleteNode(head, data);
                case 3:
                    obj.displayNode(head);
                case 4:
                    System.exit(0);
            }
        }
        */
    }

    public void addLastNode(nodeStruct head, String data) {
        nodestruct.left = head;
        nodestruct.data = data;
        nodestruct.right = null;
    }

    public void addLastNode(String data) {
        nodestruct.left = null;
        nodestruct.data = data;
        nodestruct.right = null;
    }

    public void deleteNode(nodeStruct head, String data) {
        nodeStruct temp = head;
        while (temp.data != data) {
            temp = temp.right;
        }
        if (temp.data == data) {
            temp.left = temp.right;
            temp.right.left = temp.left;
        } else {
            System.out.println("There is no such node");
        }
    }

    public void displayNode(nodeStruct head) {

    }

    public int count(nodeStruct head)
    {
        
    }
}

