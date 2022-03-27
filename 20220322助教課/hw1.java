class Object {
    protected int dmg;

    public Object() {
        dmg = 0;
    }

    public Object(int x) {
        dmg = x;
    }

    public void Action() {
        System.out.println("Do nothing......");
    }

    public void MoveTo(int x, int y) {
        System.out.println("Walking to location(" + x + "," + y + ")");
    }

    public void Attack(int dmg) {
        System.out.println("Attack.......");
        System.out.println("Damage: " + dmg);
    }
}

class NPC extends Object {
}

class Player extends Object {
    private int magicDmg;

    public Player() {
        super(10);
        magicDmg = 10;
        System.out.println("dmg = " + dmg);
        System.out.println("magicDmg = " + magicDmg);
    }

    public void Action() {
        MoveTo(10, 20);
    }

    public void Attack() {
        System.out.println("Casting magic......");
        super.Attack(dmg + magicDmg);
    }
}

class Monster extends Object {
    public Monster() {
        super(20);
        System.out.println("dmg = " + dmg);
    }

    public void MoveTo(int x, int y) {
        System.out.println("Flying to location(" + x + "," + y + ")");
    }

    public void Action() {
        MoveTo(10, 20);
        Attack(dmg);
    }
};

class Building extends Object {
};

public class myClass {
    public static void main(String[] args) {
        System.out.println("NPC: ");

        NPC npc = new NPC();
        npc.Action();

        System.out.println("---------------------------");
        System.out.println("Player: ");

        Player player = new Player();
        player.Action();

        System.out.println("---------------------------");
        System.out.println("Monster: ");

        Monster monster = new Monster();
        monster.Action();

        System.out.println("---------------------------");
        System.out.println("Player: fight back....");

        player.Attack();

        System.out.println("---------------------------");
        System.out.println("Building: ");

        Building building = new Building();
        building.Action();
    }
}
