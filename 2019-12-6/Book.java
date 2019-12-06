import java.util.Comparator;
import java.util.Scanner;

public class Book implements Comparable<Book> {
    public String ISBN;   //书号
    public String title;
    public String author;
    public int price;

    @Override
    public boolean equals(Object obj) {
        //1.obj 不是null
        if (obj == null) {
            return false;
        }
        //2.obj指向的是否是同一个对象
        if(!(obj instanceof Book)) {
            return false;
        }
        //3.向下转型
        Book book = (Book)obj;
        // 4. 根据需要比较
        return this.ISBN.equals(book.ISBN);
    }

    @Override
    public int compareTo(Book o){
        return this.price - o.price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

       /* book1.title = "救火指南";
        book1.author = "丰德聪";
        book1.price = 35;
        book2.title = "救火指南";
        book2.author = "丰德聪";
        book2.price = 35;*/

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equalsIgnoreCase("价格")) {
            //按价格比较
            int r = book1.compareTo(book2);
        } else if (line.equalsIgnoreCase("书名")) {
            //桉书名比较
            Comparator<Book> c = new BookComparator();
            int r = c.compare(book1, book2);
        } else if (line.equalsIgnoreCase("作者")) {
            //按作者比较
            Comparator<Book> c = new AuthorComparator();
            int r = c.compare(book1, book2);
        }
    }
}