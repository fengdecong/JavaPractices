public class Question2 {
	public static void main(String[] args) {
		//求100-200之间的素数
		int sum=0;
		for(int i=101;i<=200;i++)
			for(int j=2;j<=i;j++) {
				if(i%j==0&&i==j) {
					sum++;
					System.out.println(i);
				}
				else if(i%j==0&&i!=j) 
					break;
				}
		System.out.println("101-200之间有："+sum+"个素数");	
	}
}