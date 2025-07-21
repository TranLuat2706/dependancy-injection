package vn.edu.eiu.loosecoupling.di.ver3interface;

public class MainVer3Interface {
    public static void main(String[] args) {
        // 1. gửi xác nhận = email
        EmailSender emailSender = new EmailSender();
        //gọi accountService để đăng kí, và truyền emailSender vào để thông báo xác nhận
        AccountService accountService = new AccountService(emailSender);

        //gọi hàm xử lý đăng kí
        String email = "test@gmail.com";
        String content = "DI-Ver3: An email has sent to " + email;
        accountService.registerAccount(new AccountEntity(), email, content);

        // 2. gửi xác nhận SMS
        SmsSender smsSender = new SmsSender();
        accountService.setNotiService(smsSender);

        String phoneNum = "0123-456-789";
        content = "DI-Ver3: An SMS has sent to " + phoneNum;
        accountService.registerAccount(new AccountEntity(), phoneNum, content);

        // 3.gửi xác nhận telegram qua constructor
        TelegramSender telegramSender = new TelegramSender();
        accountService.setNotiService(telegramSender);

        String account = "Test";
        content = "DI-Ver3: An telegram message has sent to " + account;
        accountService.registerAccount(new AccountEntity(), account, content);

        // 4. gửi xác nhận qua Whatsapp dùng class Anonymous(lớp ẩn danh)

        // 5. gửi xác nhận qua ... bằng biểu thức lambda

    }
}
