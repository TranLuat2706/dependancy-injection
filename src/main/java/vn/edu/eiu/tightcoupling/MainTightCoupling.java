package vn.edu.eiu.tightcoupling;

/**UI: đáng lẽ sẽ có form nhập thông tin account => gọi accountService để xử lý logic
 * tạo account và thông báo xác nhận
 */
public class MainTightCoupling {
    public static void main(String[] args) {
        //Giả sử Accountentity đã có
        AccountService accountService = new AccountService();
        //Gọi hàm đăng kí tài khoản (chứa luôn thông báo xác nhận qua email)
        accountService.registerAccount(new AccountEntity());
    }
}
