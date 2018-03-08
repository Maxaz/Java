public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            tree.insert(s);
        }

        tree.inOrder();

//                   Darwin
//                 /        \
//         Brisbane           Perth
//        /        \         /       \
//     Adelaide Canberra   Melbourne  Sydney

        System.out.println("-----------------------");

        BinarySearchTree tree1 = new BinarySearchTree();

        String stringData2 = "2134 1353245 456 234 1234 1234";
        String[] data2 = stringData2.split(" ");
        for (String x : data2){
            tree1.insert(Integer.parseInt(x));
        }
        tree1.inOrder();
    }
}
