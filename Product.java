import java.util.Scanner;

public class Product {
    public static int AUTO_ID = 0;
    private int id;
    private String name;
    private String detail;
    private double num;
    private int price;
    private String unit;


    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }

    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập mô tả: ");
        this.detail = new Scanner(System.in).nextLine();
        System.out.print("Nhập số lượng: ");
        this.num = new Scanner(System.in).nextByte();
        System.out.print("Nhập giá: ");
        this.price = new Scanner(System.in).nextInt();
        System.out.print("Nhập đơn vị: ");
        this.unit = new Scanner(System.in).nextLine();
    }

}
