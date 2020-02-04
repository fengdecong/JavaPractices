public class Outer {
    int age = 10;
    public static void main(String[] args) {
		//创建内部类对象,内部类对象依托于外部类对象
        Inner inner = new Outer().new Inner();
        inner.show();
    }
	//非静态内部类不能有静态属性,静态方法
    class Inner{
        int age = 20;
        public void show(){
            int age = 30;
            System.out.println("外部类的成员变量age:"+Outer.this.age);
            System.out.println("内部类的成员变量age:"+this.age);
            System.out.println("局部成员变量age:"+age);
        }
    }
}