//非递归前序遍历
public static void ProOrderNoR(TreeNode root){
	Stack<TreeNode> st = new Stack<>();
	TreeNode curNode = root;
	
	while(curNode != null || !st.isEmpty()){
		//走到空时结束
		while(curNode != null){
			//访问根节点
			System.out.println(curNode.value);
			//访问根的左子树
			st.push(curNode);
			curNode.left = curNode; 
		}
		//获取栈顶元素
		curNode = st.pop();
		//访问栈顶元素的右子树
		curNode = curNode.right;
	}
}