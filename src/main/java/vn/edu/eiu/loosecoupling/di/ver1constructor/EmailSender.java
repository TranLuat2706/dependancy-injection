package vn.edu.eiu.loosecoupling.di.ver1constructor;

public class EmailSender {
    public void sendEmail(String toEmail, String content) {
        //đã xử lí gửi email

        //thông báo
        System.out.println("DI-Ver1: An email has sent to " + toEmail + "\n with content: " + content);
    }
}
