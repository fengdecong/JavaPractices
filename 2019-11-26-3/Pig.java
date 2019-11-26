public class Pig extends Animal {
    @Override
    public void scream() {
        System.out.println("宝贝儿我在这呢!");
    }

    public static void main(String[] args) {
        Pig p = new Pig();
        p.scream();
    }
}