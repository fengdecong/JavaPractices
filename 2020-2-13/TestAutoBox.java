public class TestAutoBox {
    public static void main(String[] args) {
        Integer a = 5; //自动装箱 Integer a = Integer.valueOf(5)
        int b = a;     //自动拆箱 int b = a.intValue();
        Integer c = null;
//        if(c != null) {
//            int d = c;     //自动拆箱 : 调用了:c.intValue()
//        }
        //缓存[-128,127]之间的数字
        Integer in1 = Integer.valueOf(-128);
        Integer in2 = -128;
        //当我们调用valueOf()的时候,首先会检查是否在[-128,127]之间如果在直接从缓存数组中调用
        // -128在缓存范围之内, [-128,127]会集中放在一个ceach数组对象中,所以in1,in2是一个对象是true
        System.out.println(in1 == in2);//true
        System.out.println(in1.equals(in2));  //true
        System.out.println("##############");
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4);  //false因为1234不在缓存范围内
        System.out.println(in3.equals(in4)); //true
    }
}
