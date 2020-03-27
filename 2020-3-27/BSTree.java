public class BSTree {
    public static class Node{
        int value;
        Node right;
        Node left;

        public Node(int value){
            this.value = value;
            left = right = null;
        }
    }

    private Node root = null;
    public Node find(int value){
        if(root == null)
            return null;
        Node cur = root;
        //从根开始搜索
        while(cur != null){
            if(cur.value == value)
                return cur;
            else if(cur.value > value)
                cur = cur.left;
            else
                cur = cur.right;
        }
        return null;
    }

    public boolean insert(int value){
        if(root == null){
            //空树
            root = new Node(value);
            return true;
        }
        //非空 先搜索再插入
        Node cur = root;
        Node parent = null;
        while(cur != null){
            parent = cur;
            //不能插入重复节点
            if(cur.value == value)
                return false;
            else if(cur.value > value)
                cur = cur.left;
            else
                cur = cur.right;
        }
        cur = new Node(value);
        if(parent.value > cur.value){
            parent.left = cur;
        }
        else{
            parent.right = cur;
        }
        return true;
    }

    public void inOrder(){
        inOrderInternal(root);
    }
	
	//中序遍历
    public static void inOrderInternal(Node root){
        if(root != null){
            inOrderInternal(root.left);
            System.out.print(root.value+" ");
            inOrderInternal(root.right);
        }
    }

    public static void main(String[] args) {
        BSTree bst = new BSTree();

        bst.insert(5);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);
        bst.insert(4);
        bst.insert(2);
        bst.insert(6);

        bst.inOrder();
    }
}