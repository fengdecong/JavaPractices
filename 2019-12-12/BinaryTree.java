class Node{
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {
    public static int size = 0;
    public static int leafSize = 0;
    //前序遍历
    public void preOrder(Node root){
        if(root == null){
            return ;
        }else{
            System.out.print(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //中序遍历
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.value);
            inOrder(root.right);
        }
    }
    //后序遍历
    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value);
        }
    }


    public Node buildTree(){
        Node root = new Node('A');
        Node node1 = new Node('B');
        Node node2 = new Node('C');
        Node node3 = new Node('D');
        Node node4 = new Node('E');
        Node node5 = new Node('F');
        Node node6 = new Node('G');
        Node node7 = new Node('H');
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.right = node7;
        node2.left = node5;
        node2.right = node6;
        return root;
    }
	public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        Node root = bTree.buildTree();
        bTree.preOrder(root);
        System.out.println();
        bTree.inOrder(root);
        System.out.println();
        bTree.postOrder(root);