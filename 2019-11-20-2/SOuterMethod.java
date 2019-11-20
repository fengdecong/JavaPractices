//外部类
public class SOuterMethod {
    private String name = "ljx我爱你";

    // 外部类中的show方法
    public void show() {
        // 定义方法内部类
        class MInner {
            int num = 2990;
            public int getScore() {
                return num + 10;
            }
        }
        // 创建方法内部类的对象
        MInner mi = new MInner();

        // 调用内部类的方法
        int newNum = mi.getScore();

        System.out.println(  name + "：爱你" + newNum+ "遍");
    }

    // 测试方法内部类
    public static void main(String[] args) {

        // 创建外部类的对象
        SOuterMethod sm = new SOuterMethod();

        // 调用外部类的方法
        sm.show();
    }
}