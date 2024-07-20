public class BinaryTree {
    private Node root;

    // Checks if the root Node has a value and inserts a value if there is none.
    public boolean accept(int value) {
        if (root == null) {
            root = new Node(value);
            return true;
        } else {
            return root.accept(value);
        }
    }

    // depth does the exact same thing search does but counts how deep the value is in the tree
    public int depth(int value) {
        return depthRecursive(root, value, 0);
    }

    private int depthRecursive(Node current, int value, int depth) {
       if (current == null) {
           return -1;
       }
       if (value == current.data) { // if the value is the same the current Node's value, return it
           return depth;
       } else if (value < current.data) { // if the value is less than the Node go subtree left
           return depthRecursive(current.left, value, depth + 1);
       } else { // else if value is greater than the Node's value go subtree right
           return depthRecursive(current.right, value, depth + 1);
       }
    }

    // Calculates the entire tree's depth
    public int treeDepth() {
       return treeDepthRecursive(root);
    }

    private int treeDepthRecursive(Node current) {
        // If root is null then the depth of the tree is 0
        if (current == null) {
            return 0;
        }
        // Recursively traverses through the entire tree (right and left) and Max.math returns the
        // longer depth of right or left.
        int leftDepth = treeDepthRecursive(current.left);
        int rightDepth = treeDepthRecursive(current.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }


    // search traverses the tree recursively using searchRecursive to find
    // the Node with the given data value.
    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node current, int data) {
        // If the current Node is empty or (== null) return false
        if (current == null) {
            return false;
        }

        // If the current Node contains the same value as data then return true
        if (data == current.data) {
            return true;
        }

        // Recursively searches a subtree based on whether the current Node's value is greater
        // or less than the data value.
        if (data < current.data) {
            return searchRecursive(current.left, data);
        } else {
            return searchRecursive(current.right, data);
        }
    }

    // Allows adding values into the tree
    public void insert(int data) {
        accept(data);
    }

}
