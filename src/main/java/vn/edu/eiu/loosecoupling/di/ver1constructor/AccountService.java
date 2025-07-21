package vn.edu.eiu.loosecoupling.di.ver1constructor;

/** UI <---> Service(you're here) <---> Repo <--->DB
 *
 */
public class AccountService {
    //cần dependancy repo để xử lý CRUD
    private AccountRepo accountRepo;
    //cần emailsender để gửi xác nhận, nhưng không new => không quản lí chặt => loose coupling
    private EmailSender emailSender;

    //hàm xử lý chính: đăng kí thành viên
    public void registerAccount(AccountEntity account) {
        //gọi repo xử lí đăng kí thành viên

        //Thông báo xác nhận
        String email = "test@gmail.com";
        String content = "DI-Ver1: Your verification code is 1234.";
        emailSender.sendEmail(email, content);
    }
    // vì không neư nên ko có obj để gửi, vì vậy phải truyền từ ngoài vào thông qua constructor
    public AccountService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
}
