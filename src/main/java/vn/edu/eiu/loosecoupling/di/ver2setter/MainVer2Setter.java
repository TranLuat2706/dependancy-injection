package vn.edu.eiu.loosecoupling.di.ver2setter;

public class MainVer2Setter {
    public static void main(String[] args) {
        // tạo accountService xừ lý đăng kí
        AccountService accountService = new AccountService();

        // tạo emailSender bỏ vào
        EmailSender emailSender = new EmailSender();

        accountService.setEmailSender(emailSender);

        //truyền vào cho accountService thông qua setter
        accountService.registerAccount(new AccountEntity());
    }
}
