import java.util.*;
import java.io.*;

class node
{
    int data;
    node next;

/*    public node()
    {
    } */
}

public class SinglyLinkedList
{
    
    public static node head; 

    public static void main(String args[])
    {
        head = new node();
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        displayNode();
        System.out.println("Deleting Initiating");
        deleteNode(3);
        System.out.println("Deleting completed");
        displayNode();
        System.out.println("reverse Initiating");
        reverseList();
        System.out.println("reverse completed");
        displayNode();
        int count = countNode();
        System.out.println("The total number of nodes are "+count);
    }

    /*
    public static void addNode(int number, node head)
    {
        System.out.println("head data: "+head.data);
        if(head.data == 0)
        {
            head.data = number;
            head.next = null;
            System.out.println("if success");
        }
        else
        {
            node temp = new node();
            temp.data = number;
            temp.next = head;
            head = temp;
            System.out.println("else success");
            System.out.println("head data in else loop:"+head.data);
            System.out.println(head.next);
        }
    }
    */

    public static void addNode(int number)
    {
//        System.out.println("head data: "+head.data);
        if(head.data == 0)
        {
            head.data = number;
            head.next = null;
//            System.out.println("if success");
        }
        else
        {
            node temp = new node();
            temp.data = number;
            temp.next = head;
            head = temp;
/*            System.out.println("else success");
            System.out.println("head data in else loop:"+head.data);
            System.out.println(head.next); */
        }
    }

    public static void displayNode()
    {
        node temp = head;
        while(temp != null)
        {
            System.out.println(String.valueOf(temp.data));
            temp = temp.next;
        }
    }
            
    public static void deleteNode(int number)
    {
        node temp = head.next;
        node first = head;
        if(head.data == number)
        {
            head = head.next;
        }
        else 
        {
            while(temp.data != number && temp !=null)
            {
                first = temp;
                temp = temp.next;
            }
            if(temp.data == number)
            {
                first.next = temp.next;
                temp = null;
            }
        }
    }
     
    public static void reverseList()
    {
        if(head.next == null)
        {
        }
        else
        {
//            System.out.println("In else head is :"+head.data);
            node prev = head;
            node curr = null;
            node currnext = null;
            if(prev.next != null)
            {
                curr = prev.next;
            }
            if(curr.next != null)
            {
                currnext = curr.next;
            }
            prev.next = null;

            do
            {
//               System.out.println("In while the head is : "+curr.data);
               curr.next = prev;
               prev = curr;
               curr = currnext;
//               if(currnext.next != null)
               if(currnext != null)
               {
                   currnext = currnext.next;
               }
            }while(curr != null);
            head = prev;
        }
    }

    public static int countNode()
    {
        node temp = head;
        int count = 0;
        while(temp != null)
        {
            count = count + 1;
            temp = temp.next;
        }
        return count;
    }
}

