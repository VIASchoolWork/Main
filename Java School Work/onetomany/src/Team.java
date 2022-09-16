import java.util.ArrayList;

public class Team {
    String name;
    double budget;
    double avgskill;
    ArrayList<Player> trial = new ArrayList<>();
    ArrayList<Player> main = new ArrayList<>();


    public Team(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public void updateSkill() {
        double sum = 0;
        for (Player nuts : main) {
            sum += nuts.skill;
        }
        this.avgskill = sum / main.size();
    }

    public void newPlayer(Player player) {
        updateSkill();
        if (this.budget < player.price) {
            System.out.println("You (" + this.name + ")have not got the money for " + player.name + ".");
            return;
        }
        if (player.team != null) {
            System.out.println("Cannot add " + player.name + " to the " + this.name + ". "
                    + player.name + " is a part of " + player.team.name);
            return;
        }
        trial.add(player);
        player.team = this;
        double x = 0;
        for (Player nuts : main) {
            if (x < nuts.skill) {
                x = nuts.skill;
            }
        }
        if (player.skill > x) {
            player.price = player.price * 0.1 + player.price;
        }
        x = 100;
        for (Player nuts : main) {
            if (x > nuts.skill)
                x = nuts.skill;
        }
        if (player.skill < x) {
            player.price = player.price - player.price * 0.1;
        }
        if (player.skill > this.avgskill || main.size() < 3) {
            trial.remove(player);
            main.add(player);
            this.budget = this.budget - player.price;
        }
    }

    public void playerTransfer(Player player, Team newteam) {
        if (trial.size() >= 3 || this.budget < player.price) {
            System.out.println("We "+this.name+" cant afford " + player.name + " man");
            return;
        }
        trial.remove(player);
        main.remove(player);
        this.budget = this.budget + player.price;
        newteam.budget = newteam.budget - player.price;
        newteam.trial.add(player);

    }


}


