import java.util.Arrays;

public class MyArrayList {
    private int[] array;
    private int size;

    public MyArrayList(){
        array=new int[10];
        size=0;
    }

    public void pushFront(int element){
        for(int i=size-1;i>=0;i--){
            array[i+1]=array[i];
        }
        //把新的元素放到0号下标去
        array[0]=element;
        //长度+1
        size++;
    }

    public void pushBack(int element){
        array[size++]=element;
    }

    public void insert(int element,int index){
        size++; //数组长度+1
        for(int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index]=element;
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(array,size));
    }

    public static void main(String[] args){
        MyArrayList list = new MyArrayList();
        list.pushBack(2);
        list.pushBack(4);
        list.pushBack(6);
        list.pushFront(10);
        list.pushFront(20);
        list.pushFront(30);
        list.insert(15,2);

        System.out.println(list);
    }
}