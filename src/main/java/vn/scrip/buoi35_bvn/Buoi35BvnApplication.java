//Mục tiêu:
//Tạo chương trình mô phỏng tài khoản ngân hàng. Nếu người dùng rút tiền vượt quá số dư, chương trình ném ra một ngoại lệ InsufficientFundsException do bạn tự định nghĩa.
//
//Yêu cầu:
//Tạo lớp BankAccount có:
//Thuộc tính: balance

//Phương thức: deposit(double amount), withdraw(double amount)
//Nếu rút vượt số dư, ném ra InsufficientFundsException
//
//Viết chương trình chính mô phỏng 2 trường hợp:
//Giao dịch thành công
//Giao dịch thất bại (số dư không đủ)
//
//Gợi ý code:
//

//Tạo class ngoại lệ tự định nghĩa
//public class InsufficientFundsException extends Exception {
//    public InsufficientFundsException(String message) {
//        super(message);
//    }
//}
//Tạo class BankAccount
//public class BankAccount {
//    private double balance;
//
//    public BankAccount(double initialBalance) {
//        this.balance = initialBalance;
//    }
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Nạp tiền thành công: " + amount);
//    }
//    public void withdraw(double amount) throws InsufficientFundsException {
//        if (amount > balance)
//        {
//            throw new InsufficientFundsException("Số dư không đủ để rút: " + amount);
//        }
//        balance -= amount;
//        System.out.println("Rút tiền thành công: " + amount);
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//}
//
//Lưu ý: Có thể các loại công cụ AI hỗ trợ.
package vn.scrip.buoi35_bvn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Buoi35BvnApplication
{
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount(1_000_000); // 1 triệu đồng
		System.out.println("💰 Số dư ban đầu: " + account.getBalance() + " VND");
		try {
			// Giao dịch 1: thành công
			account.withdraw(500_000);
			System.out.println("👉 Số dư còn lại: " + account.getBalance() + " VND");
			// Giao dịch 2: thất bại (số dư không đủ)
			account.withdraw(600_000); // chỉ còn 500k, rút 600k sẽ lỗi
		}













		catch (InsufficientFundsException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("🏦 Kết thúc giao dịch, số dư: " + account.getBalance() + " VND");
	}
}



