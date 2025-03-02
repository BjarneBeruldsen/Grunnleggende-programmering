public class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node){

        int data = node.data;

        //legger til root visst den er tom
        if(root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            //legger til venstre visst den er mindre enn root.
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }
    private void displayHelper(Node root) {
        if(root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data) {
        if(root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        }
        else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if(search(data)) {
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " finnes ikke");
        }
    }
    private Node removeHelper(Node root, int data) {
        if(root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else { //her er node funnet
            if(root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) { //må finne en succesor som skal erstatte denne noden
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else { //finner en predecessor som erstatter denne noden
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(Node root) { //finn minste verdi under høyre child av denne noden
        root = root.right;
        while(root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root) { //finn høyeste verdi under venstre child av denne noden
        root = root.left;
        while(root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}
