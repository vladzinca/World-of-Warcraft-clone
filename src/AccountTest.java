import java.util.ArrayList;

public class AccountTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Information\n===================");
        Credentials credentials = new Credentials("vlad.zinca@stud.acs.upb.ro", "i_laik_OOP");
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
        } catch (InformationIncompleteException e) {
            System.out.println("Please provide name and credentials\n");
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
        } catch (InformationIncompleteException e) {
            System.out.println("Please provide name and credentials\n");
        }

        System.out.println("Testare Account\n===================");
        Account.Information information = new Account.Information.InformationBuilder(credentials, "Vlad")
                .favGames(favGames)
                .country("Romania")
                .build();
        Character character1 = CharacterFactory.makeCharacter(CharacterType.WARRIOR);
        Character character2 = CharacterFactory.makeCharacter(CharacterType.ROGUE);
        Character character3 = CharacterFactory.makeCharacter(CharacterType.MAGE);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        Integer gameCounter = 61;
        Account account = new Account(information, characters, gameCounter);
        System.out.println("Credentialele jucatorului: " + account.information.credentials.getEmail() + ", " + account.information.credentials.getPassword());
        System.out.println("Personajele contului: ");
        for (int i = 0; i < account.characters.size(); i++)
            System.out.println(account.characters.get(i).name);
        System.out.println("Numarul de jocuri jucate: " + account.gameCounter);
        System.out.println("===================");
    }
}
