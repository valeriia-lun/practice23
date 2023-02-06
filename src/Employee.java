public class Employee {
  String name;
  Phone phoneNumber;
  Position position;

  public Employee() {
  }

  public void validateName(String name){
    if (name.matches(".*[0-9].*")){
      System.out.println("Name is validated");
    }
  }
}
