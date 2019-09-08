package algo.data;

public class BinarySearchTree {

    static class Node {
        int key;

        Node left;
        Node right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = makeInsertedTreeRec(root, key);
    }

    private Node makeInsertedTreeRec(Node parent, int key) {
        if (parent == null) {
            return new Node(key);
        }

        if (parent.key < key) {
            parent.right = makeInsertedTreeRec(parent.right, key);
        }
        if (key < parent.key) {
            parent.left = makeInsertedTreeRec(parent.left, key);
        }
        return parent;
    }


    public void printInOrder() {
        printInOrderRec(root);
    }

    private void printInOrderRec(Node parent) {
        if (parent == null) {
            return;
        }
        printInOrderRec(parent.left);
        System.out.println(parent.key);
        printInOrderRec(parent.right);
    }

    public Node searchRec(Node parent, int searchKey) {
        if (parent == null) {
            return null;
        }
        if (parent.key == searchKey) {
            return parent;
        }
        if (parent.key < searchKey){
            searchRec(parent.right, searchKey);
        }
        return searchRec(parent.left, searchKey);
    }

    public void delete(int key){
        root = makeKeyDeletedTreeRec(root, key);
    }

    private Node makeKeyDeletedTreeRec(Node root, int key) {
        if(root==null){
            return null;
        }
        if(root.key<key){
            root.right= makeKeyDeletedTreeRec(root.right, key);
            return root;
        }
        if(root.key>key){
            root.left = makeKeyDeletedTreeRec(root.left, key);
            return root;
        }
        if(root.key==key){
            if(root.left == null){
                root=root.right;
            }
            else if(root.right == null){
                root = root.left;
            }else{
                root.key= popMinValue(root.right);
                root.right = makeKeyDeletedTreeRec(root.right, root.key);
            }
        }
        return root;
    }

    private int popMinValue(Node parent) {
        int minValue = parent.key;
        while(parent.left!=null){
            minValue = parent.left.key;
            parent = parent.left;
        }
        return minValue;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.printInOrder();

        System.out.println("\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.printInOrder();

        System.out.println("\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.printInOrder();

        System.out.println("\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.printInOrder();
    }
}
