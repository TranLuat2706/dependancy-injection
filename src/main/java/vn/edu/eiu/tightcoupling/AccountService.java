package vn.edu.eiu.tightcoupling;

/** Class này có nhiệm vụ: nhận data từ UI (form đăng kí), xử lý logic đăng kí thành viên => đưa cho repo gửi xuống db,
 * gửi thông tin xác nhận đăng kí(giả định qua email)
 * Các dependancy của nó:
 *  1. Repo
 *  2. EmailSender
 */
public class AccountService {
    // 1. Đã xủ lý logic đăng kí thành viên
    private AccountRepo accountRepo;  // dùng để CRUD dữ liệu xuống db
    private EmailSender emailSender = new EmailSender(); // tight coupling

    //Hàm thực hiện đăng kí
    public void registerAccount(AccountEntity account) {
        //gọi repo ghi xuống db(giả sử đã gọi)

        //gủi thông báo xác nhận
        String email = "test@gmail.com";
        String content = "Tight Coupling Dependancy: Your vertification code is 1234.";
        emailSender.sendEmail(email, content);
    }
}
