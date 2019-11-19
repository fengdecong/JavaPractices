public class InitailTelphonr {
    public static void main(String[] args){
        //通过无参构造方法创造对象
        Telphone phone = new Telphone();
        //通过有参构造方法创建对象并给对象的实例变量赋初值
        Telphone phone2 = new Telphone(5.0f,1.4f,2.5f);
       // phone2.cpu=5.5f;   //prviate关键字修饰属性 对象不能直接访问与要用set和get方法来使用

        //用set方法来修改cpu的值
        phone2.setCpu(5.5f);
        //用get方法来得到cpu的值
        System.out.println(phone2.getCpu());
    }
}