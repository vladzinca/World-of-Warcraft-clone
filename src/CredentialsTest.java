public class CredentialsTest {
    public static void main(String[] args) {
        System.out.println("===================Testare Credentials\n===================");
        Credentials credentials = new Credentials("dragutzu_tao@gmail.com", "i_dont_laik_OOP");
        System.out.println("Emailul si parola vechi: " + credentials.getEmail() + ", " + credentials.getPassword());
        credentials.setEmail("vlad.zinca@stud.acs.upb.ro");
        credentials.setPassword("i_laik_OOP");
        System.out.println("Emailul si parola noi: " + credentials.getEmail() + ", " + credentials.getPassword());
    }
}