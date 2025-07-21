package vn.edu.eiu.loosecoupling.di.ver3interface;

public class TelegramSender implements NotiService{
    @Override
    public void sendNoti(String toRecipient, String content) {
        //thông báo
        System.out.println("DI-Ver3: An telegram message has sent to " + toRecipient + "\nwith content: " + content);
    }
}
