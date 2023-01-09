import java.util.Scanner;

public class bth3 {
    public static void main(String[] args) {
        int size;
        int[]array;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào size cua mảng");
        size=scanner.nextInt();
        do {
            if (size>20){
                System.out.println("nhập vào độ dài nhỏ hơn 20");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<size){
            System.out.println("nhập vào phần tử thứ " + (i+1));
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("mang vua nhap la");
        for (int j = 0; j <array.length; j++) {
            System.out.print(array[j] + ",");
        }
        int index=1;
        int max=array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j]>=max){
                max=array[j];
            }else {
                max=array[0];
            }index=j+1;

        }
        System.out.println("nguoi giau nhat co so tien la");
        System.out.println(max +"trieu $" + "dung o vi tri thu " + index );
    }
}
