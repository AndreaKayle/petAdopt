package practice;
import java.util.Scanner;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int size, find;
        System.out.print("Enter size: ");
        size = sc.nextInt();
        int [] list = new int[size];
    
        for(int i=0; i < list.length;i++){
            System.out.print("Enter element: ");
            list[i] = sc.nextInt();
        }
        System.out.print("Array Elements; ");
        for (int i = 0; i < size; i++){
            System.out.print(list[i] + " ");
        }
        System.out.print("\nFind: ");
        find = sc.nextInt();
        for (int i=0; i < size; i++){
            if (find == list[i]){
            System.out.print(find + " is at index " + i);
        }
    }
        Arrays.sort(list);
        System.out.print("\nSorted Arrays: " + Arrays.toString(list));
}
}
