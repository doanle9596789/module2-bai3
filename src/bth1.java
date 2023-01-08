import java.util.Scanner;

public class bth1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int [] array;
        System.out.println("nhap size cua mang");
        size=scanner.nextInt();
        do {
            if (size>20){
                System.out.print("Nhap duoi 20");
            }
        }while (size>20);
        System.out.print("nhap phan tu cua mang");
        array=new int[size];
        int i=0;
        while (i<size){
            System.out.println("phan tu thu" +(i+1));
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("mang array la");
        for (int k : array) {
            System.out.print(k +",");
        }

        for (int j = 0; j < array.length/2; j++) {
            int temp=array[j];
            array[j]=array[array.length-1-j];
            array[array.length-1-j]=temp;
        }
        System.out.println("mang sau khi dao nguoc phan tu");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +", ");
        }
    }
}