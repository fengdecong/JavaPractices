public class Avg{
	public static void mian(String[] args){
		int sum=0;
		for(int i=0;i<=args.length;i++){
			sum+=Integer.parseInt(args[i]);
	}
	double average=1.0*sum/args.length;
	System.out.println("平均值是:"+average);
	}
}