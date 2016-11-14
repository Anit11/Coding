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
        root.left.left = new node(2);
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

}
