public class BookDemo {
    public static void main(String[] args) {
      //  Book b1= new Book();
        Book b1 = new Book("三体","刘慈欣",60);
        System.out.println(b1);
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice());
        Book b2 = new Book("西游记","吴承恩",80);
        System.out.println(b2);
        //调用priceDiscount方法打8折 后再调用getPrice方法
        System.out.println(b2.priceDiscount(0.8));
        System.out.println(b2.getAuthor());
    }
}