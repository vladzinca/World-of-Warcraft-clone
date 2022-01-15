import java.util.ArrayList;
import java.util.Objects;

public class Account {
    Information information;
    ArrayList<Character> characters;
    Integer gameCounter;

    public Account(Information information, ArrayList<Character> characters, Integer gameCounter) {
        this.information = information;
        this.characters = characters;
        this.gameCounter = gameCounter;
    }

    public static class Information {
        Credentials credentials;
        ArrayList<String> favGames;
        String name, country;

        public Information(InformationBuilder builder) {
            this.credentials = builder.credentials;
            this.favGames = builder.favGames;
            this.name = builder.name;
            this.country = builder.country;
        }

        public static class InformationBuilder {
            Credentials credentials;
            SortedArrayList<String> favGames;
            String name, country;

            public InformationBuilder(Credentials credentials, String name) {
                this.credentials = credentials;
                this.name = name;
            }

            public InformationBuilder favGames(SortedArrayList<String> favGames) {
                this.favGames = favGames;
                return this;
            }

            public InformationBuilder country(String country) {
                this.country = country;
                return this;
            }

            public Information build() {
                Information information = new Information(this);
                validate(information);
                return new Information(this);
            }

            void validate(Information information) throws InformationIncompleteException {
                if (information.credentials.getEmail().equals("") || information.credentials.getPassword().equals("") || information.name.equals("")) {
                    System.out.println("InformationIncompleteException");
                    throw new InformationIncompleteException();
                }
            }
        }
    }
}