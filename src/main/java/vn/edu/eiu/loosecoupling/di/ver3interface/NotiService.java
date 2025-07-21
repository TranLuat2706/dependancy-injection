package vn.edu.eiu.loosecoupling.di.ver3interface;

public interface NotiService {
    //Ko có code xử lý cụ thể, chỉ có khai báo hàm abstract
    public void sendNoti(String toRecipient, String content);
}
