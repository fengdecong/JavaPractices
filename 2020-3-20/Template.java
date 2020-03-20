import java.util.Arrays;

//数组的泛型
public class Template<E,K,V>{

}


class MyArrayList<E>{
    private E[] array;
    private int size;
    private int capacity;

    public MyArrayList(){
        array = (E[]) new Object[10];
        size = 0;
        capacity = 10;
    }

    public void add(E value){
        if(size == capacity) {
            array = Arrays.copyOf(array,2*capacity);
            capacity *= 2;
        }
        array[size++] = value;
    }
    public  E remove(){
        E ret;
        if(size > 0){
            ret = array[size - 1];
            array[size - 1] = null;
            size--;
            return ret;
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void print(){
        for(E e : array){
            System.out.print(e + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MyArrayList<Integer> ml = new MyArrayList<>();
        MyArrayList<Character> ml2 = new MyArrayList<>();
        ml.add(1);
        ml.add(2);
        ml.add(3);
        ml.add(4);
        ml.print();

        ml2.add('a');
        ml2.add('b');
        ml2.add('c');
        ml2.add('d');
        ml2.print();
    }
}