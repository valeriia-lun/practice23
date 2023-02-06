public class Phone {
  String phoneNumber;

  private String validatePhoneNumber(String phone) {
    if (phone.length() <= 3) {
      return "-------------";
    }
    return phone;
  }
}
