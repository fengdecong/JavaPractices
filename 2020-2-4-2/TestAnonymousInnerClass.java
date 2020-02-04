public class TestAnonymousInnerClass {
    //传入AA接口对象a
    public static void tets01(AA a){
        System.out.println("################");
        a.aa();
    }
    public static void main(String[] args) {
        TestAnonymousInnerClass.tets01(new AA(){

            @Override
            public void aa() {
                System.out.println("匿名内部类的使用!");
            }
        });
        }
    }
interface AA{
    void aa();
}