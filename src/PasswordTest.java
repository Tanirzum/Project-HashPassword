public class PasswordTest {
    public static void main(String[] args) {
        password("Tanirbergen");

    }

    public static void password(String value) {
        System.out.println(value.hashCode() + " Ваш HashPassword");
    }


}
