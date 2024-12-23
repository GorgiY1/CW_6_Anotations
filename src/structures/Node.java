package structures;

public class Node {

    @TreeInfo(info = "This is the left child node.")
    private Node left;
    @TreeInfo(info = "This is the right child node.")
    private Node right;
    private int value;

    public Node(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }
    @TreeOperations(description = "Finds a node in binary tree.")
    public Node find(int value) {
        if(this.value == value) {
            return this;
        } else if(value < this.value && left != null) {
            return left.find(value);
        } else if(value > this.value && right != null) {
            return right.find(value);
        }
        return null;
    }
    @TreeOperations(description = "Inserts a new node in the binary tree.")
    public void insert(int newValue) {
        if(value == newValue) {
            System.out.println("Error a new value.");
            return;
        }
        if(newValue < this.value) {
            if(left == null) {
                left = new Node(newValue);
            } else {
                left.insert(newValue);
            }
        } else {
            if(right == null) {
                right = new Node(newValue);
            } else {
                right.insert(newValue);
            }
        }
    }
}
