package vn.edu.eiu.tightcoupling;

/** Class này chuyên việc thực hiện gửi email xác nhận
 */
public class EmailSender {
    // Khai báo các thuộc tính cần thiết

    public void sendEmail(String toEmail, String content) {
        //Logic gửi email

        //Giả định xuất thông báo gửi thành công
        System.out.println("An email has sent to " + toEmail);
    }
}
