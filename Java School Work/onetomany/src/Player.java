public class Player {
    String name;
    Team team;
    double skill = 0;
    double price;

    public Player(String name, double skill, double price) {
        this.name = name;
        if (skill <= 100 && skill >= 0)
            this.skill = skill;
        this.price = price;
    }


}
