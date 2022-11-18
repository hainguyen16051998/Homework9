
import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            menu();
            int functionchoice = functionchoice();
            switch (functionchoice) {
                case 1:
                    LogicHandle.addProduct();
                    break;
                case 2:
                    LogicHandle.showInfoProduct();
                    break;
                case 3:
                    LogicHandle.findProductByName();
                    break;
                case 4:
                    menu4();
                    break;
                case 5:
                    LogicHandle.findProductlessthan5();
                    break;
                case 6:
                    menu6();
                    break;
                case 7:
                    return;
            }
        }
    }


    private static int functionchoice() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 7)
                break;
            System.out.print("Nhập sai, mời nhập lại: ");
        }
        while (true);
        return choice;
    }

    private static void menu() {
        System.out.println("----PHẦN MÊM QUẢN LÝ THÔNG TIN BÁN HÀNG----");
        System.out.println("1. Thêm thông tin sản phẩm");
        System.out.println("2. In ra thông tin sản phẩm");
        System.out.println("3. Tìm sản phẩm theo tên");
        System.out.println("4. Tìm sản phẩm theo ID");
        System.out.println("5. Tìm các sản phẩn có số lượng dưới 5");
        System.out.println("6. Tìm sản phẩm theo mức giá");
        System.out.println("7. Thoát");
        System.out.print("Mời chọn: ");
    }

    private static void menu4() {
        while (true) {
            System.out.println("Tìm sản phẩm theo ID:");
            System.out.println("1. Xóa sản phẩm");
            System.out.println("2. Cập nhập số lượng sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Mời chọn: ");
            int choice;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 3)
                    break;
                System.out.print("Nhập sai, mời nhập lại: ");
            }
            while (true);
            switch (choice) {
                case 1:
                    LogicHandle.delete();
                    break;
                case 2:
                    LogicHandle.updateNum();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void menu6() {
        while (true) {
            System.out.println("Tìm sản phẩm theo giá:");
            System.out.println("1. Dưới 50.000");
            System.out.println("2. Từ 50.000 đến dưới 100.000");
            System.out.println("3. Từ 100.000 trở lên");
            System.out.println("4. Thoát");
            System.out.print("Mời chọn: ");
            int choice;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 4)
                    break;
                System.out.print("Nhập sai, mời nhập lại: ");
            } while (true);
            switch (choice) {
                case 1:
                    LogicHandle.under50000();
                    break;
                case 2:
                    LogicHandle.from50000to100000();
                    break;
                case 3:
                    LogicHandle.over100000();
                    break;
                case 4:
                    return;
            }
        }
    }

}

