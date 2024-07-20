class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    boolean accept(int value) {
        // Check if value is equal to the current Node's integer
        if (value == this.data) {
            return false;
        } else if (value > this.data) {
            /*
            *  Check if value is greater than the current Node's integer.
            *  If yes then check if right subtree is empty (== null).
            *  If true insert value into Node.
            *  Otherwise, recursively call the accept method on that right subtree Node.
            * */
            if (this.right == null) {
                this.right = new Node(value);
                return true;
            } else {
                return this.right.accept(value);
            }
        } else {
            // If value is less than the current Node's integer then check if left subtree is
            // empty. The rest of the process is similar to the (value > this.data) above but
            // focusing on the left subtree instead.
            if (this.left == null) {
                this.left = new Node(value);
                return true;
            } else {
                return this.left.accept(value);
            }
        }
    }
}