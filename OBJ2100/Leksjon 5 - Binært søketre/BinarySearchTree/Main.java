public class Main {
    public static void main(String[] args) {
        BinarySearchTree btree = new BinarySearchTree();

        btree.insert(new Node(5));
        btree.insert(new Node(1));
        btree.insert(new Node(9));
        btree.insert(new Node(3));
        btree.insert(new Node(7));
        btree.insert(new Node(4));
        btree.insert(new Node(8));
        btree.insert(new Node(2));

        btree.remove(0);
        btree.display();

        //System.out.println(btree.search(5));

    }
}