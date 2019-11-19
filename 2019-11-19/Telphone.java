public class Telphone {
   private float screen;
   private float cpu;
   private float mem;

   public float getCpu(){
       return cpu;
   }

   public void setCpu(float cpu){
       this.cpu=cpu;
   }

   public Telphone(){
        System.out.println("无参构造器方法执行");
    }
    public Telphone(float screen,float cpu,float mem){
        if(this.screen<3.5f){
            System.out.println("您的输入有误!自动赋初始值3.5");
            screen=3.5f;
        }else{
            this.screen=screen;
        }
        this.screen = screen;
        this.cpu = cpu;
        this.mem = mem;
        System.out.println("screen="+screen+" cpu="+cpu+" mem="+mem);
    }
}