public class Book {
    private String name;
    private String author;
    private double price;
    //一个有参的构造器
    Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    //方法 得到名字
    String getName() {
        return name;
    }

    //get方法  得到作者
    String getAuthor() {
        return author;
    }

    //get方法 得到价钱
    double getPrice() {
        return price;
    }

    void stename(String name){
        this.name = name;
    }
    void setAuthor (String author){
        this.author = author;
    }
    //普通方法 添加作者
    void appendAuthor(String author){
        this.name = this.name +" "+name;
    }

        //普通方法 打折
    double priceDiscount ( double discount){
        return this.price * discount ;
    }

    //覆写一个方法
    @Override
    public String toString(){
        return String.format("《%s》 by %s",name,author);
    }
}