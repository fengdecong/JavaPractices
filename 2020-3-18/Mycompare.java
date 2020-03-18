import java.util.Arrays;
import java.util.Comparator;

public class MyCompare {
}

class Person implements Comparable<Person>{
//class Person {
    public String name;
    public String gender;
    public int age;
    public String ID;

    Person(String name,String gender,int age,String id){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = id;
    }

    @Override
    public int compareTo(Person o) {
        int ret = age - o.age;
        if (ret < 0) {
            return -1;
        } else if (ret > 0)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString(){
       return name+"--"+gender+"--"+age+"--"+ID;
    }
}


class PersonAgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        int ret = o1.age - o2.age;
        if (ret < 0)
            return -1;
        else if (ret > 0)
            return 1;
        else
            return 0;
    }
}


class PersonIDComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.compareTo(o2);
    }
}

class test1{
    public static void main(String[] args) {
        int[] arr = {1,3,8,4};
        Person[] personArr = {new Person("丰德聪","男",22,"19980103"),
                new Person("丰德攀","男",19,"20010101"),
                new Person("刘佳鑫","女",22,"19981101")};
        Arrays.sort(arr);
        //Person  已经实现了Comparable中的compareTo方法
       // Arrays.sort(personArr);
        //System.out.println(Arrays.toString(personArr));
        //如果已经有了Person类型的000比较器
        Arrays.sort(personArr,new PersonIDComparator());
        System.out.println(Arrays.toString(personArr));
    }
}