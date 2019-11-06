import java.util.Arrays;

   public static void main(String[] args) {
       int[] a = {8, 9, 6, 3, 4, 7, 1, 2};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j + 1]) {
                    int t;
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
            System.out.print(Arrays.toString(a));	
		}
	}
