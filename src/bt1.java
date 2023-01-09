import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9, 6, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int locationToDelete = findLocationToDelete(arr, num);
        if(locationToDelete == -1){
            System.out.println("Khong co phan tu trong mang");
        } else {
            arr = deleteElement(arr, locationToDelete);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int findLocationToDelete(int[] arr, int element) {
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                index_del = i;
            }
        }
        return index_del;
    }
    public static int[] deleteElement(int[] arr, int index_del){
        int[] newArr =new int[arr.length-1];
        for (int i = 0; i < index_del; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index_del + 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }
}