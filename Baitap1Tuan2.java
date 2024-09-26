import java.util.Scanner;

public class Baitap1Tuan2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Yêu cầu người dùng nhập tên
        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        
        // Xuất ra màn hình
        System.out.println("Hello " + name);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}