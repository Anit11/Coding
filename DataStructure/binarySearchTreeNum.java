import java.util.*;

class node {
   int data;
   node left;
   node right;

   public node(int data) {
       this.data = data;
       left = null;
       right = null;
   }

   public node() {
   }
}

public class binarySearchTreeNum {

    public static void main(String args[]) {

        node root = new node(10);
        root.left = new node(5);
        root.right = new node(15);
        root.left.left= new node(2);
        root.left.right = new node(3);
        root.right.right = new node(20);
        // what happens when root.right.right is again initialized. Will it old value get replaced
        root.right.right.right = new node(50);

        if(root != null) {
            int smallest = find_smallest(root);
            int biggest = find_biggest(root);
            System.out.println("The smallest number in the tree is : "+smallest);
            System.out.println("The biggest number in the tree is : "+biggest);
        }
        else {
            System.out.println("There are no elements present in tree");
        }

        // find path that sum up to a number
        boolean a = search_the_path(root, 17, 0);
        print_boolean(a, "Yes", "No");
        int countNodes = find_node_count(root);
        System.out.println("The count of nodes are : "+countNodes);
        int depth = find_depth(root);
        System.out.println("The depth of the tree is "+depth);
        ArrayList<Integer> aList = new ArrayList<>();
        print_path(root, aList);
        mirror(root);
        print_preorder(root);
        int count = subtree_in_range(root, 15, 30);
        System.out.println(count);

        //find shallow depth
        int shallowDepth = findShallowDepth(root);
        System.out.println("The shallow depth of the given tree is : "+shallowDepth);

    }

    public static int find_smallest(node root) {
        
        if(null == root.left) {
            return root.data;
        }
        else {
            return find_smallest(root.left);
        }
    }
    
    public static int find_biggest(node root) {
        
        if(null == root.right) {
            return root.data;
        }
        else {
            return find_biggest(root.right);
        }
    }

    public static void printTree(node root)
    {
        if (root == null)
        {
            return;
        }

        printTree(root.left);
        System.out.println(root.data);
        printTree(root.right);
    }

    public static boolean search_the_path(node root, int num, int total) {
        

        if(root == null) {
            return false;
        }
        total = total + root.data;

        if(root.left == null && root.right == null) {
            if(total == num) {
                return true;
            }
            else {
                return false;
            }
        }

        return (search_the_path(root.left, num, total) || search_the_path(root.right, num, total)); 
       }

       public static void print_boolean(boolean boo, String success, String failure) {
       
           if(boo) {
               System.out.println(success);
           }
           else {
               System.out.println(failure);
           }
       }

       public static int find_node_count(node root) {
        
            if(root == null) {
                return 0;
            }

            return 1 + find_node_count(root.left) + find_node_count(root.right);
       }

       public static int find_depth(node root) {
        
            if(root == null) {
                return 0;
            }

            return max (1+find_depth(root.left), 1+find_depth(root.right));
            
       }

       public static int max (int a, int b) {
            
            if(a<b) {
                return b;
            }
            return a;
       }

       //print the tree in increasing order
       public static void print_ascending_tree(node root) {
            
            if(root == null) {
                return;
            }

            print_ascending_tree(root.left);
            System.out.println(root.data);
            print_ascending_tree(root.right);
        }

        public static void print_postorder(node root) {
            
            if(root == null) {
                return;
            }

            print_postorder(root.left);
            print_postorder(root.right);
            System.out.println(root.data);
        }

        public static void print_preorder(node root) {
            
            if(root == null) {
                return;
            }

            System.out.println(root.data);
            print_preorder(root.left);
            print_preorder(root.right);
        }
            
    
        public static void print_path(node root, ArrayList<Integer> aList) {
            
            if(root == null) {
                return;
            }

            if(root.left != null || root.right != null) {
                aList.add(root.data);
            }
            else {
                aList.add(root.data);
                System.out.println(aList.toString());
            }

            print_path(root.left, aList);
            print_path(root.right, aList);
            aList.remove(aList.size()-1);
        }

        public static void mirror(node root) {
            
            if(root == null) {
                return;
            }
            else {
                root = swap_nodes(root);
            }

            mirror(root.left);
            mirror(root.right);
        }

        public static node swap_nodes(node root) {
            
            if(root.left != null && root.right != null) {
                int temp = root.left.data;
                root.left.data = root.right.data;
                root.right.data = temp;
            }

            return root;
        }

        public static void double_tree(node root) {
            
        }

        public static void same_tree(node root) {
            
        }

        public static int subtree_in_range(node root, int start, int end) {
            
            if(root == null) {
                return 0;
            }   
            int min = find_smallest(root);
            int max = find_biggest(root);

            System.out.println("MAX: "+max);
            System.out.println("MIN: "+min);
            if(min >= start && max <= end) {
                System.out.println("2.");
                return find_node_count(root);
            }   
            /*else if(min <= start || max >= end) {
                System.out.println("3.");
                return 0; 
            }
            */

            return max (subtree_in_range(root.left, start, end), subtree_in_range(root.right, start, end));
        }

}
