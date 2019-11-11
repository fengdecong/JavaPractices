class Bike{
    String  color;
    int  currentSpeed;
    int maxSpeed;
    Bike(){
        color = "黑色";
        currentSpeed = 0;
        maxSpeed = 193;
    }
    Bike(String color){
        color = color;
        currentSpeed = 0;
        maxSpeed = 193;
    }
    //方法
    void setColor(String color){
        this.color=color;
    }
    void speedUp(){
        currentSpeed += 10;
        if(currentSpeed > maxSpeed){
            currentSpeed = maxSpeed;
        }
    }
    void speedDown(){
        currentSpeed-=10;
        if(currentSpeed < 0){
            currentSpeed=0;
        }
    }
    String getColor(){
        return color;
    }
    int getCurrentSpeed(){
        return currentSpeed;
    }

}

public class BikeDemo {
    public static void main(String[] args){
        Bike bike = new Bike();
        System.out.println(bike.getColor());
        System.out.println(bike.getCurrentSpeed());

        bike.setColor("粉色");
        System.out.println("涂完漆后");
        System.out.println(bike.getColor());

        System.out.println("下坡");
        for(int i=0;i<22;i++){
            bike.speedUp();
            System.out.println(bike.getCurrentSpeed());
        }

        System.out.println("上坡");
        for(int i=0;i<22;i++){
            bike.speedDown();
            System.out.println(bike.getCurrentSpeed());
        }
    }
}