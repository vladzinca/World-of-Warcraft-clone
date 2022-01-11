public class Test {
    public static void main(String[] args) {
        Credentials credentials = new Credentials("dragutzu_tao@gmail.com", "i_dont_laik_OOP");
        System.out.println("Emailul si parola vechi: " + credentials.getEmail() + " si " + credentials.getPassword());
        credentials.setEmail("vlad.zinca@stud.acs.upb.ro");
        credentials.setPassword("i_laik_OOP");
        System.out.println("Emailul si parola noi: " + credentials.getEmail() + " si " + credentials.getPassword());
    }
}