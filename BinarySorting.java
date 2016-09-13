import java.util.Scanner;

public class BinarySorting {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] bin = new int[n];
        int[] count = new int[n];
        int[] sort = new int[n];
        for (int i = 0; i < n; i++) {
            bin[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[i] = 0;
            arr[i] = sc.nextInt();
            bin[i] = Integer.parseInt(Integer.toBinaryString(arr[i]));
        }

        for (int i = 0; i < n; i++) {
            int t = bin[i];
            while (t > 0) {
                if (t % 10 == 1) {
                    count[i]++;
                }
                t /= 10;
            }
        }

        int largest = 0;
        int i;
        for (i = 0; i < n; i++) {
            largest = i;
            if (i == n - 1) {

                
                for(int j = 0; j < n - 1; j++) {
                    if (count[largest] == count[j]) {
                        if (arr[largest] < arr[j]) {
                            largest = j;
                        }
                    } else if (count[largest] < count[j]) {
                        largest = j;
                    }
                }
                
            } else {
                for (int j = 0; j < n; j++) {
                    if(i == j) {
                        
                    }else if (count[largest] == count[j]) {
                        if (arr[largest] < arr[j]) {
                            largest = j;
                        }
                    } else if (count[largest] < count[j]) {
                        largest = j;
                    }
                }
            }
            count[largest] = 0;
            sort[i] = arr[largest];
        }
        for (i = 0; i < n; i++) {
            System.out.println(sort[i]);
        }

    }
}
