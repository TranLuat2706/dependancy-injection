package vn.edu.eiu.loosecoupling.di.ver2setter;

public class AccountService {
    private AccountRepo accountRepo;
    private EmailSender emailSender;  // không new

    //Khai báo setter để truyền obj emailSender
    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    // hàm xử lý chính: tạo account
    public void registerAccount(AccountEntity account) {
        // gọi repo xử lý xác nhận đăng kí

        //Thông báo xác nhận, cần lấy từ accountentity nhưng ta đang demo nên tự tạo như ở dưới
        String email = "test@gmail.com";
        String content = "DI-Ver1: Your verification code is 1234.";
        emailSender.sendEmail(email, content);
    }

}
