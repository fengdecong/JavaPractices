//合法括号判断
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
		//先存在数组中
      char[] a = A.toCharArray();
        int count = 0;
		//如果为奇数false
        if(a.length %2 != 0)
            return false;
        for(int i = 0;i < a.length ; i++){
            if(a[i] != '(' && a[i] != ')')
                return false;
            if(a[i] == '(')
                count++;
            if(a[i] == ')')
                count--;
			//如果 < 0 则说明后括号在前 输出false 
            if(count < 0)
                return false;
        }
        if(count == 0)
            return true;
        return false;
    }
}