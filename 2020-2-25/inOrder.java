//非递归的二叉树的中序遍历
public static void inOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode curNode = root;
        while(curNode != null || !st.isEmpty()){
            while (curNode != null) {
                st.push(curNode);
                curNode = curNode.left;
            }
            curNode = st.pop();
                System.out.println(curNode.value+" ");
                curNode = curNode.right;
        }
        System.out.println();
    }