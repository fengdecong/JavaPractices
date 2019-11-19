//外部类HelloWorld
public class InnerClass{
	
	// 内部类Inner，类Inner在类HelloWorld的内部
	public class Inner{
		// 内部类的方法
		public void show(){
			System.out.println("ljx I love you");
		}
	}
	public static void main(String[] args){
		 // 创建外部类对象
		InnerClass hello = new InnerClass();
		// 创建内部类对象
		Inner i = hello.new Inner();
		// 调用内部类对象的方法
		i.show();
	}
}