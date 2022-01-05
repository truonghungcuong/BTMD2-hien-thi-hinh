import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luachon = -1;
        Scanner scanner = new Scanner(System.in);
        while (luachon!=0) {
            System.out.println("Menu");
            System.out.println("1.Hình chữ nhật");
            System.out.println("2.Hình tam giác");
            System.out.println("3.Hình tam giác ngược");
            System.out.println("4.Thoát");
            System.out.println("Nhập số:");
            luachon = scanner.nextInt();
            switch (luachon) {
                case 1:
                    for (int i = 1; i < 4; i++) {
                        for (int j = 1; j < 8; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;
                case 2:
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("không có lựa chọn");
            }
        }
    }
}
