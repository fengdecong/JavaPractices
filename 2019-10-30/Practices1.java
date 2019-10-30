import java.util.Scanner;

public class Practices01 {
	public static void main(String[] args) {
		int classNum=3;//班级数量
		int stuNum=4; //学生数量
		double sum=0; //成绩总和
		double avg=0; //成绩平均分
		Scanner input=new Scanner(System.in); //创建Scanner对象
		
		for(int i=1;i<=classNum;i++) {//外层循环控 制班级的数量
			System.out.println("***请输入第"+i+"个班级的成绩***");
			sum=0;
			for(int j=1;j<=stuNum;j++) {//内层循环控制每个班级的学生数量
				System.out.println("请输入第"+j+"个学员的成绩：");
				int score=input.nextInt();//获取输入信息
				sum=sum+score;//成绩累加求和
			}
			avg=sum/stuNum;//计算并均分
			System.out.println("第"+i+"个班级学生的平均分:"+avg);
		}
	}
}