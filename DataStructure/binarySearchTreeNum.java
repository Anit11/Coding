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
        root.left.right = new node(2);
        root.right.right = new node(20);

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
    
}
