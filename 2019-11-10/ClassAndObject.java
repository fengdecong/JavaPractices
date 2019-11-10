class Person{
    //属性
    String name;
    int age;

    //方法(普通方法)
    public void sayHello(String target){
        System.out.println(name+" say 我爱你 to "+target);
    }
}

public class ClassAndObject {
    public static void main(String[] args){
        Person p = new Person();
        p.name = "刘佳鑫";
        p.age = 18;

        p.sayHello("丰德聪");
    }
}