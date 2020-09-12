package Bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.print("Moi ban nhap  de chon : ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    soLe();
                    break;
                case 2:
                    soChan();
                    break;
                case 3:
                    so1N();
                    break;
                case 4:
                    ASCII();
                    break;
                case 5:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Ban da nhap sai!!!");
            }
        } while (choose != 5);
    }

    // Menu
    static void showMenu() {
        System.out.println();
        System.out.println("******************************Menu******************************");
        System.out.println("1. Thuc hien in cac so le nho hon so nguyen n");
        System.out.println("2. Thuc hien in cac so chan nho hon so nguyen n");
        System.out.println("3. Thuc hien in cac so tu 1 -> n");
        System.out.println("4. Thuc hien in cac ki tu hoa trong bang ma ASCII");
        System.out.println("5. Thoat");
        System.out.println("****************************************************************");
        System.out.println();
    }

    // Ham nhap
    public static int Input() {
        Scanner intput = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = intput.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban da nhap sai ! Vui long nhap lai!");
                intput.nextLine();
            }
        }
        return n;
    }

    // câu 1
    private static void soLe() {
        System.out.print("Nhap n : ");
        int n = Input();
        System.out.println("Cac so le nho hon so nguyen n : ");
        for (int i = 1; i < n; i += 2) {
            System.out.print("\t" + i);
        }
        System.out.println();
    }

    // câu 2
    private static void soChan() {
        System.out.print("Nhap n : ");
        int n = Input();
        System.out.println("Cac so chan nho hon so nguyen n : ");
        for (int i = 0; i < n; i += 2) {
            System.out.print("\t" + i);
        }
        System.out.println();
    }

    // câu 3
    private static void so1N() {
        System.out.print("Nhap n : ");
        int n = Input();
        System.out.println("Cac so tu 1 -> n la : ");
        for (int i = 0; i <= n; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
    }

    // câu 4
    private static void ASCII() {
        for (int i = 65; i <= 89; i++) {
            System.out.printf("%5d%5c\n", i, i);
        }
    }
}
