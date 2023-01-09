import java.util.Scanner;
public class bth4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int select;
        double doC;
        double doF;
        do {
            System.out.println(" menu select");
            System.out.println("1:" +" tu doF sang doC");
            System.out.println("2:" + "tu doC sang doF");
            System.out.println("0"+"exit chuong trinh");
            System.out.println("nhap menu");
            select=scanner.nextInt();
            switch (select){
                case 1:System.out.println("nhap doC");
                doC=scanner.nextInt();
                System.out.println("doF la" +doCsangdoF(doC));
                break;
                case 2:System.out.println("nhap doF");
                doF=scanner.nextInt();
                System.out.println("doC la" +doFsangdoC(doF));
                break;
                case 0:
                    System.exit(0);

            }
        }while (select !=0);

    }
    public static double doCsangdoF(double doC){
        double doF= (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double doFsangdoC(double doF){
        double doC=(5.0 / 9) * (doF - 32);
        return doC;
    }
}