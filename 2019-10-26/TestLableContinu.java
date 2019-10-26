public class TestLableContinue {
	public static void main(String[]agre) {
		int count=0;
		outer:for(int i=101;i<=150;i++){
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					continue outer;
				}
			}
			System.out.print(i+"、");
			count++;
			if(count%3==0) {
		    System.out.println();
		    count=0;
		    }
			}
		}
} 