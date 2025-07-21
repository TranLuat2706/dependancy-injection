package vn.edu.eiu.loosecoupling.di.ver1constructor;

public class MainVer1Constructor {
    public static void main(String[] args) {
        //New dependancy EmailService để truyền vào AccountService
        EmailSender emailSender = new EmailSender();
        AccountService accountService = new AccountService(emailSender);

        accountService.registerAccount(new AccountEntity());
    }
}
