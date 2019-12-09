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

    public void popFront(){
       /* if(size == 0){
            System.out.println("空的");
            return ;
        }
        for(int i = 1;i < size;i++){
            array[i-1] = array[i];
        }
        array[--size] = 0;*/
       erase(0);
    }

    public void popBack(){
      /*  if(size == 0){
            System.out.println("空了");
        }
        array[--size] = 0;*/
      erase(size - 1);
    }

    //按下标删除
    public void erase(int index) {
        if(size == 0){
            System.out.println("空了");
            return;
        }
        for(int i = index  + 1;i < size;i++){
            array[i - 1] = array[i];
        }
        array[size --] = 0;
    }

    public void insert(int element,int index){
        size++;
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
        list.popBack();
        list.pushBack(6);
        list.pushFront(10);
        list.pushFront(20);
        list.popFront();
        list.pushFront(30);
        list.insert(15,2);
        list.erase(3);

        System.out.println(list);
    }
}