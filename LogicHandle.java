import sun.applet.Main;

import java.util.Scanner;

public class LogicHandle {


    public static void addProduct() {
        System.out.print("Nhập số lượng mặt hàng muốn thêm vào: ");
        int num;
        do {
            num = new Scanner(System.in).nextByte();
            if (num > 0)
                break;
            System.out.print("Số lượng mặt hàng phải lớn hơn 0, nhập lại: ");
        } while (true);
        for (int i = 0; i < num; i++) {
            System.out.println("Thông tin sản phẩm thứ: " + (i + 1));
            Product product = new Product();
            product.inputInfo();
            MainRun.products.add(product);
        }
    }

    public static void showInfoProduct() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : MainRun.products)
            System.out.println(product);
    }


    public static void findProductlessthan5() {
        int count = 0;
        for (Product temp : MainRun.products) {
            if (temp.getNum() < 5) {
                System.out.println(temp);
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy!");
        }

    }


    public static void findProductByName() {
        boolean count = true;
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String name = new Scanner(System.in).nextLine();
        for (Product temp : MainRun.products) {
            if (temp.getName().equalsIgnoreCase(name)) {
                System.out.println(temp);
                count = false;
            }
        }
        if (count) {
            System.out.println("Không tìm thấy!");
        }
    }

    public static void delete() {
        System.out.print("Nhập Id sản phẩm muốn xóa: ");
        int ID = new Scanner(System.in).nextInt();
        for (Product temp : MainRun.products) {
            if (temp.getId() == ID) {
                MainRun.products.remove(temp);
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public static void updateNum() {
        System.out.print("Nhập Id sản phẩm cập nhật số lượng sản phẩm: ");
        int id = new Scanner(System.in).nextInt();
        for (int i = 0; i < MainRun.products.size(); i++) {
            if (MainRun.products.get(i).getId() == id) {
                System.out.print("Cập nhật số lượng: ");
                MainRun.products.get(i).setNum(new Scanner(System.in).nextInt());
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    public static void under50000() {
        for (Product temp : MainRun.products) {
            if (temp.getPrice() < 50000) {
                System.out.println(temp);
            }
        }
    }

    public static void from50000to100000() {
        for (Product temp : MainRun.products) {
            if (temp.getPrice() >= 50000 && temp.getPrice() <= 100000) {
                System.out.println(temp);
            }
        }
    }

    public static void over100000() {
        for (Product temp : MainRun.products) {
            if (temp.getPrice() > 100000) {
                System.out.println(temp);
            }
        }
    }
}
