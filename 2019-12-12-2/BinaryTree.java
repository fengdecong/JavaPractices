 class Node{
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value = value;
        left = right = null;
    }
}
//创建二叉树
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
	public void getSize1(Node root){
        if(root != null){
            size += 1;
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public int getSize2(Node root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
            return getSize2(root.left) + getSize2(root.right) + 1;
    }
    //求叶子节点的个数
    public void getLeafSize1(Node root){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            leafSize++;
            return;
        }
        getSize2(root.left);
        getSize2(root.right);
    }
    //求叶子节点数
    public int getLeafSize2(Node root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
        return 1;
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    //获取第K层的节点数
    public int getKSize(Node root,int k){
        if(root == null)
            return 0;
        if(k == 1)
            return 1;
        return getKSize(root.left,k-1) +getKSize(root.right,k-1) ;
    }
	public sattic void main(args[] String){
        System.out.println(bTree.getSize2(root));
        bTree.getLeafSize1(root);
        System.out.println(bTree.getLeafSize2(root));
        System.out.println(bTree.getKSize(root,4));
        System.out.println(bTree.getKSize(root,3));
        System.out.println(bTree.getKSize(root,2));
	}
}