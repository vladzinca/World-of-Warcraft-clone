import java.util.ArrayList;

public class Account {
    Information information;
    ArrayList<String> characters;
    Integer gameCounter;

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
            ArrayList<String> favGames;
            String name, country;

            public InformationBuilder(Credentials credentials, String name) {
                this.credentials = credentials;
                this.name = name;
            }

            public InformationBuilder favGames(ArrayList<String> favGames) {
                this.favGames = favGames;
                return this;
            }

            public InformationBuilder country(String country) {
                this.country = country;
                return this;
            }

            public Information build() {
                return new Information(this);
            }
        }
    }
}