//水仙花数问题，打印出100-999之间满足每个位数的三次方之和的数

public class question3 {
	public static void main(String[] args) {
		int i,j=0,k;
		int bai,shi,ge;
		for(i=100;i<1000;i++) {
			bai=i/100;
			shi=(i/10)%10;
			ge=i%10;
			k=bai*bai*bai+shi*shi*shi+ge*ge*ge;
			if(i==k) {
				System.out.println(i);
				j++;		
			}
					}
		System.out.println("符合水仙花数的个数为"+j);
	}
}