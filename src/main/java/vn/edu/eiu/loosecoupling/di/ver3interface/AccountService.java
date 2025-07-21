package vn.edu.eiu.loosecoupling.di.ver3interface;

/**Thay vì sử dụng depedancy cụ thể là email, sms, ... thì lớp này sử dụng dependancy là 1 interface NotiService
 */
public class AccountService {
    //Khai báo repo xử lý CRUD
    private AccountRepo accountRepo;
    //Khai báo Noti để thông báo xác nhận(nhưng chưa biết xài hệ thống nào)
    private NotiService notiService;

    //có thể dùng 1 trong 2 cách truyền dependancy, nên khai báo cả 2
    public AccountService(NotiService notiService) {
        this.notiService = notiService;
    }

    public void setNotiService(NotiService notiService) {
        this.notiService = notiService;
    }

    public void registerAccount(AccountEntity account, String toRecipient, String content) {
        // gọi repo xử lý xác nhận đăng kí
        // lẽ ra là thông tin gửi xác nhận là lấy từ account, nhưng mà giả lập nên tạm thời hard-coded từ main gửi vào

        //Thông báo xác nhận và cũng chưa biết là xài từ hệ thống gì nên toRecipient và content
        notiService.sendNoti(toRecipient, content);
    }
}
