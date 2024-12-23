package structures;

public class Tree {
    private Node root;

    public Tree(int value) {
        root = new Node(value);
    }

    public void PrintMinMax(Node node) {
        if (node != null) {
            PrintMinMax(node.getLeft());
            System.out.println("Node Value: " + node.getValue());
            PrintMinMax(node.getRight());

        }
    }
    public void PrintMaxMin(Node node) {
        if (node != null) {
            PrintMinMax(node.getRight());
            System.out.println("Node Value: " + node.getValue());
            PrintMinMax(node.getLeft());
        }
    }

    public void insert (int value) {
        root.insert(value);
    }
    public Node find (int value) {
        return root.find(value);
    }
}
