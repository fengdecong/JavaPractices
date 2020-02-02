public class TestInterface {
    public static void main(String[] args) {
        Volant volant = new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HIGHT);
        Honest honest = new Angel();
        honest.helpOther();
    }
}
/** 飞行接口  */
interface Volant{
    int FLY_HIGHT = 100;
    void fly();
}
/** 善良接口*/
interface Honest{
    void helpOther();
}
/** Angel类实现飞行接口和善良接口*/
class Angel implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("我是天使,我飞起来了!");
    }

    @Override
    public void helpOther() {
        System.out.println("救起落水的小孩!");
    }
}
class BirdMan implements Volant{

    @Override
    public void fly() {
        System.out.println("我是鸟人,正在飞");
    }
}