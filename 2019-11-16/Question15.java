import java.util.Scanner;
public class Question15 {

static int[] a = new int[5];
static int[] b = new int[5];
public static void main(String[] args) {
   boolean is =false;
   Scanner s = new Scanner(System.in);
   long l = s.nextLong();
   if (l > 99999 || l < 10000) {
    System.out.println("Input error, please input again!");
    l = s.nextLong();
   }
   for (int i = 4; i >= 0; i--) {
    a[i] = (int) (l / (long) Math.pow(10, i));
    l =(l % ( long) Math.pow(10, i));
   }
   System.out.println();
   for(int i=0,j=0; i<5; i++, j++) {
     b[j] = a[i];
   }
   for(int i=0,j=4; i<5; i++, j--) {
    if(a[i] != b[j]) {
     is = false;
     break;
    } else {
     is = true;
    }
   }
   if(is == false) {
    System.out.println("is not a Palindrom!");
   } else if(is == true) {
    System.out.println("is a Palindrom!");
   }
}
}