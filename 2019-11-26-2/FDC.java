public class FDC extends Animal {
    String host;

    FDC(String host){
        super("蓝色",2);
        this.host = host;
    }
    public String getHost(){
        this.host = host;
        return host;
    }
    @Override
    public void scream(){
        System.out.println("乖子救我");
    }

    public static void main(String[] args) {
        FDC fdc = new FDC("刘佳鑫");
        fdc.scream();
        System.out.println("我的主人是:"+fdc.getHost());
        System.out.println(fdc.getColor());
    }
    public static void sleep() {
        System.out.println("我是 Dog 的睡觉");
    }
}