public class BinarySearchTree {

    private Node root;

    BinarySearchTree() {
        this.root = null;
    }

    class Node {
        private Object nodeValue;
        private Node left, right;

        public Node(Object nodeValue) {
            this.nodeValue = nodeValue;
            this.left = null;
            this.right = null;
        }

        public Object getNodeValue() {
            return nodeValue;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }


        public int compareTo(Object itemValue) {
            if (itemValue instanceof Number) {
                return compareNumber(itemValue);
            } else{
                return this.getNodeValue().toString().compareToIgnoreCase(itemValue.toString());
            }
        }

        private int compareNumber(Object itemValue) {
            double x = Double.parseDouble(this.getNodeValue().toString());
            double y = Double.parseDouble(itemValue.toString());
            return Double.compare(x, y);
        }
    }


    public void insert(Object nodeValue) {
        root = insertRec(root, nodeValue);
    }

    private Node insertRec(Node root, Object nodeValue) {
        if (root == null) {
            root = new Node(nodeValue);
            return root;
        }

        if (root.compareTo(nodeValue) > 0) {
            root.setLeft(insertRec(root.getLeft(), nodeValue));
        } else if (root.compareTo(nodeValue) < 0) {
            root.setRight(insertRec(root.getRight(), nodeValue));
        }
        /* return the (unchanged) node pointer */
        return root;
    }

    public Node searchNode(Node root, Object nodeValue) {
        if (root.compareTo(nodeValue) < 0) {
            return searchNode(root.getLeft(), nodeValue);
        } else if (root.compareTo(nodeValue) > 0) {
            return searchNode(root.getRight(), nodeValue);
        }
        //if (root == null || root.key == key)
        return root;
    }

    void inOrder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getNodeValue());
            inorderRec(root.getRight());
        }
    }
}
