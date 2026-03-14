import java.util.*;

public class Main{
    public static void main(String[] argu){
        Scanner sc = new Scanner(System.in);
        PhoneBook danhBa = new PhoneBook();

        int num;

        do {
            System.out.println("\n-------MENU-------");
            System.out.println("\n1. Them lien he moi.");
            System.out.println("2. Xem toan bo danh ba.");
            System.out.println("3. Tim kiem danh ba.");
            System.out.println("4. Thoat MENU.");
            System.out.println("Hay nhap yeu cau.");
            num = sc.nextInt();
            sc.nextLine();

            switch (num){
                case 1:
                    System.out.println("Nhap Ten lien lac: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap So dien thoai: ");
                    String phone = sc.nextLine();

                    danhBa.addPBook(new Contact(name, phone));
                    break;
                case 2:
                    danhBa.showPBook();
                    break;
                case 3:
                    System.out.print("Nhap lien he can tim: ");
                    String Ten = sc.nextLine();

                    danhBa.searchPBook(Ten);
                    break;
                case 4:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Khong hop le, vui long nhap lai.");
                    break;
            }
        }
        while(num != 4);
    }
}