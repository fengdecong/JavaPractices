/*题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，
乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛
的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。   */
import java.util.ArrayList;

public class Question17 {
	 String a,b,c;
	 public static void main(String[] args) {
	  String[] op = { "x", "y", "z" };
	  ArrayList<Question17> arrayList=new ArrayList<Question17>();
	  for (int i = 0; i < 3; i++)
	   for (int j = 0; j < 3; j++)
	    for (int k = 0; k < 3; k++) {
	    	Question17 a=new Question17(op[i],op[j],op[k]);
	     if(!a.a.equals(a.b)&&!a.b.equals(a.c)&&!a.a.equals("x")
	       &&!a.c.equals("x")&&!a.c.equals("z")){
	      arrayList.add(a);
	     }
	    }
	  for(Object a:arrayList){
	  System.out.println(a);
	  }
	 }
	 public Question17(String a, String b, String c) {
	  super();
	  this.a = a;
	  this.b = b;
	  this.c = c;
	 }
	 @Override
	 public String toString() {
	  // TODO Auto-generated method stub
	  return "a的对手是"+a+","+"b的对手是"+b+","+"c的对手是"+c+"\n";
	 }
}