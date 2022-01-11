public class Test {
    public static void main(String[] args) {
        System.out.println("Testare Credentials\n===================");
        Credentials credentials = new Credentials("dragutzu_tao@gmail.com", "i_dont_laik_OOP");
        System.out.println("Emailul si parola vechi: " + credentials.getEmail() + ", " + credentials.getPassword());
        credentials.setEmail("vlad.zinca@stud.acs.upb.ro");
        credentials.setPassword("i_laik_OOP");
        System.out.println("Emailul si parola noi: " + credentials.getEmail() + ", " + credentials.getPassword());
        System.out.println("===================");

        System.out.println("Testare Information\n===================");
        SortedArrayList<String> favGames = new SortedArrayList<>();
        favGames.insert("The Witcher 3: Wild Hunt");
        favGames.insert("Grand Theft Auto V");
        favGames.insert("Portal 2");
        favGames.insert("Amnesia: The Dark Descent");
        System.out.println("Daca nu introducem un nume:\n");
        try {
            Account.Information information = new Account.Information.InformationBuilder(credentials, "")
                    .favGames(favGames)
                    .country("Romania")
                    .build();
            System.out.println("Credentialele jucatorului: " + information.credentials.getEmail() + ", " + information.credentials.getPassword());
            System.out.println("Jocurile preferate ale jucatorului: " + information.favGames);
            System.out.println("Numele jucatorului: " + information.name);
            System.out.println("Tara din care provine jucatorul: " + information.country);
            System.out.println("===================");
        }
        catch(Exception e)
        {
            System.out.println("InformationIncompleteException >>> Please provide name and credentials\n");
        }
        System.out.println("Daca introducem un nume:\n");
        try {
            Account.Information information = new Account.Information.InformationBuilder(credentials, "Vlad")
                    .favGames(favGames)
                    .country("Romania")
                    .build();
            System.out.println("Credentialele jucatorului: " + information.credentials.getEmail() + ", " + information.credentials.getPassword());
            System.out.println("Jocurile preferate ale jucatorului: " + information.favGames);
            System.out.println("Numele jucatorului: " + information.name);
            System.out.println("Tara din care provine jucatorul: " + information.country);
            System.out.println("===================");
        }
        catch(Exception e)
        {
            System.out.println("InformationIncompleteException >>> Please provide name and credentials");
        }

    }
}