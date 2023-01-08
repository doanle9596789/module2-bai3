import java.sql.SQLOutput;
import java.util.Scanner;

public class bth2 {
    public static void main(String[] args) {
        String[] teacher = {"kieu anh", "trinh", "diep", "nga"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten nguoi ban muon tim");
        String nhapten = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < teacher.length; i++) {
            if (nhapten.equals(teacher[i])) {
                System.out.println(nhapten + " " + "co chi so la" + " " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(" khong co nguoi ban tim ten la" +" "+ nhapten);
        }
    }
}
