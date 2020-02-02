/**
 * 抽象类: 第一: 没有实现  第二: 子类必须实现
 * 抽象类的意义在于:为子类提供统一的,规范的模板,子类必须实现相关的抽象方法!
 */
public  abstract class Animal {

    abstract public void shout();
    public void run(){
        System.out.println("跑啊跑!");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.run();
        a.shout();
    }
}
class Dog extends Animal{
    @Override
    public void shout(){
        System.out.println("汪汪汪!");
    }
}
