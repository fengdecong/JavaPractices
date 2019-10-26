 //测试方法
public class TestMethod {
	public static void main(String[]agre) {
		TestMethod tm = new TestMethod();
		tm.printFdc();
		int s=tm.add(30,40,50)+1000;
		System.out.println(s);
	}
	void printFdc() {
		System.out.println("温文尔雅丰德聪");
		System.out.println("英雄本色丰德聪");
		System.out.println("玉树凌风丰德聪");
		System.out.println("风流倜傥丰德聪");
	}
	int add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
		return sum;
	}
}