import java.util.Scanner;

public class Baitap3Tuan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int soThuNhat = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int soThuHai = scanner.nextInt();

        // Tính toán
        int tong = soThuNhat + soThuHai;
        int hieu = soThuNhat - soThuHai;
        int tich = soThuNhat * soThuHai;
        float thuong = (float)soThuNhat/ soThuHai; 
        int du = soThuNhat % soThuHai;
        
        // In kết quả
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phan du: " + du);
    }
}