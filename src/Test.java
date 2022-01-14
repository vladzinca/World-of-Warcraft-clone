import java.util.ArrayList;

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
        ArrayList<String> characters = new ArrayList<>();
        characters.add("Jack Spicer");
        characters.add("Obi-Wan Kenobi");
        characters.add("Ionel Bratianu");
        Integer gameCounter = 61;
        Account account = new Account(information, characters, gameCounter);
        System.out.println("Credentialele jucatorului: " + account.information.credentials.getEmail() + ", " + account.information.credentials.getPassword());
        System.out.println("Personajele contului: " + account.characters);
        System.out.println("Numarul de jocuri jucate: " + account.gameCounter);
        System.out.println("===================");

        System.out.println("Testare Grid\n===================");
        Grid grid;
        int length = 5;
        int width = 5;
        grid = Grid.generateMap(length, width);
        System.out.println("Dupa generarea tablei cu 2 magazine si 4 inamici, tabla de joc este:");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++)
                System.out.print(grid.get(i).get(j) + " ");
            System.out.print("\n");
        }
        Cell cell = new Cell(0, 0, true);
        grid.currentCell = cell;
        System.out.println("La pozitia (" + grid.currentCell.ox + ", " + grid.currentCell.oy + "), daca mergem la nord ajungem la: ");
        grid.goNorth();
        System.out.println("(" + grid.currentCell.ox + ", " + grid.currentCell.oy + ")");
        System.out.println("La pozitia (" + grid.currentCell.ox + ", " + grid.currentCell.oy + "), daca mergem la sud ajungem la: ");
        grid.goSouth();
        System.out.println("(" + grid.currentCell.ox + ", " + grid.currentCell.oy + ")");
        System.out.println("La pozitia (" + grid.currentCell.ox + ", " + grid.currentCell.oy + "), daca mergem la vest ajungem la: ");
        grid.goWest();
        System.out.println("(" + grid.currentCell.ox + ", " + grid.currentCell.oy + ")");
        System.out.println("La pozitia (" + grid.currentCell.ox + ", " + grid.currentCell.oy + "), daca mergem la est ajungem la: ");
        grid.goEast();
        System.out.println("(" + grid.currentCell.ox + ", " + grid.currentCell.oy + ")");
        System.out.println("===================");
    }
}