import java.util.Scanner;

public class Baitap4Tuan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien gui: ");
        double soTienGui = scanner.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatHangNam = scanner.nextDouble();

        System.out.print("Nhap so thang gui: ");
        int soThangGui = scanner.nextInt();

        // Chuyển đổi lãi suất hàng năm thành lãi suất hàng tháng
        double laiSuatHangThang = laiSuatHangNam / 12 / 100;

        // Tính lãi
        double lai = soTienGui * laiSuatHangThang * soThangGui;

        // Tính số tiền gốc với lãi cuối kỳ
        double soTienCuoiKy = soTienGui + lai;

        // In kết quả
        System.out.println("So tien lai: " + lai);
        System.out.println("So tien goc va lai cuoi ky: " + soTienCuoiKy);
    }
}