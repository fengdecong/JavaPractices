public class Question14 {
 public static void main(String[] args) {
  float fm = 1f;
  float fz = 1f;
  float temp;
  float sum = 0f;
  for (int i=0;i<20;i++){
   temp = fm;
   fm = fz;
   fz = fz + temp;
   sum += fz/fm;
  }
  System.out.println(sum);
 }
}