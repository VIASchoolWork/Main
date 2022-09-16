public class Main {
    public static void main(String[] args) {
        Team fcb = new Team("FC Barcelona", 120000000);
        Team chelsea = new Team("Chelsea", 80000000);

        Player ramos = new Player("Sergio Ramos", 86, 4500000);
        Player messi = new Player("Lionel Messi", 90, 250000000);
        Player silva = new Player("Thiago Silva", 89, 15000000);
        Player ronaldo = new Player("Cristiano Ronaldo", 25, 800000);
        Player podrinkis = new Player("Krishjanis Podrinkis", 45, 2000000);
        Player tyrone = new Player("Tyrone",99,25);

        fcb.newPlayer(tyrone);
        fcb.newPlayer(ramos);
        fcb.newPlayer(messi);
        fcb.newPlayer(ronaldo);
        chelsea.newPlayer(silva);
        chelsea.newPlayer(podrinkis);
        chelsea.newPlayer(ramos);
        fcb.playerTransfer(messi, chelsea);
        fcb.playerTransfer(tyrone,chelsea);
        if (chelsea.main.size() != 0) {
            System.out.println("\nChelsea main team: ");
            for (int x = 0; x < chelsea.main.size(); x++) {
                System.out.println(chelsea.main.get(x).name + " is a player from "
                        + chelsea.main.get(x).team.name + " and his rating is " + chelsea.main.get(x).skill
                        + " hence the reason he costs "
                        + chelsea.main.get(x).price);
            }
        }
        if (fcb.main.size() != 0) {
            System.out.println("\nFCB main team: ");
            for (int x = 0; x < fcb.main.size(); x++) {
                System.out.println(fcb.main.get(x).name + " is a player from "
                        + fcb.main.get(x).team.name + " and his rating is " + fcb.main.get(x).skill
                        + " hence the reason he costs "
                        + fcb.main.get(x).price);
            }
        }
        if (chelsea.trial.size() != 0) {
            System.out.println("\nThe trial lineup for Chelsea:");
            for (int x = 0; x < chelsea.trial.size(); x++) {
                System.out.println(chelsea.trial.get(x).name + " is a player from "
                        + chelsea.trial.get(x).team.name + " and his rating is " + chelsea.trial.get(x).skill
                        + " hence the reason he costs "
                        + chelsea.trial.get(x).price);
            }
        }
        if (fcb.trial.size() != 0) {
            System.out.println("\nThe trial lineup for FCB:");
            for (int x = 0; x < fcb.trial.size(); x++) {
                System.out.println(fcb.trial.get(x).name + " is a player from "
                        + fcb.trial.get(x).team.name + " and his rating is " + fcb.trial.get(x).skill
                        + " hence the reason he costs "
                        + fcb.trial.get(x).price);
            }
        }


    }
}
