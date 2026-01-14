public class PasswordCheck {
    public static void main(String[] args) {

        String realPass = "admin123";
        String userPass = "admin123";  // given

        if (userPass.equals(realPass))
            System.out.println("Login Successful");
        else
            System.out.println("Wrong Password");
    }
}
