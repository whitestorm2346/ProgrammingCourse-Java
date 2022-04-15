class Object {
    public void Action() {
        System.out.println("Do nothing......");
    }

    public void MoveTo(int x, int y) {
        System.out.printf("Walking to location(%d,%d)\n", x, y);
    }

    public void Attack() {
        System.out.println("Attack......");
    }
}

class NPC extends Object {

}

class Player extends Object {
    public void Action() {
        MoveTo(10, 20);
    }

    public void Attack() {
        System.out.println("Casting magic......");

        super.Attack();
    }
}

class Monster extends Object {
    public void MoveTo(int x, int y) {
        System.out.printf("Flying to location(%d,%d)\n", x, y);
    }

    public void Action() {
        MoveTo(10, 20);
        Attack();
    }
}

class Building extends Object {

}

public class RolePlayingGame {
    public static void main(String[] args) {
        NPC npc = new NPC();
        Player player = new Player();
        Monster monster = new Monster();
        Building building = new Building();

        System.out.print("NPC: ");
        npc.Action();

        System.out.print("Player: ");
        player.Action();

        System.out.print("Monster: ");
        monster.Action();

        System.out.println("Player: fight back......");
        player.Attack();

        System.out.print("Building: ");
        building.Action();
    }
}