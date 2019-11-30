//力扣第118题杨辉三角的解决算法
public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(numRows);
        for(int i=0;i<numRows;i++){
           triangle.add(new ArrayList<>());
           triangle.get(i).add(1);
        }
		 /*     先设定第一排的数字都为1
             numRows : 5
             1
             1
             1
             1
             1
             */
        for(int i=1;i<numRows;i++){  
			for(int j=1;j<i;j++){
				int ret = triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
				triangle.get(i).add(ret);
			}  
		//每次在最后尾插一个1
        triangle.get(i).add(1);
        }
    return triangle;
}