import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,j, element;
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements : ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be deleted : ");
        element = sc.nextInt();
        int size = arr.length;
        for (i = 0,j=0; i < size; i++) {
                if (arr[i] != element) {
                    arr[j] = arr[i];
                    j++;
                }
            }
        System.out.println("The array after deletion : "+ Arrays.toString(arr));
    }
}
