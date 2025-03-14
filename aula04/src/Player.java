import java.util.ArrayList;

public class Player {
    int hp;
    int mp;
    int atk;
    int def;
    ArrayList<String> nItems;
    String name;

    public Player(String name, int hp,int mp,int atk,int def, ArrayList<String> nItems){
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.mp = mp;
        this.nItems = nItems;
        this.name = name;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("ATK: " + atk);
        System.out.println("DEF: " + def);
        System.out.print("Items: ");
        for (String item : nItems) {
            System.out.print(item + " ");
        }
    }

    public void displayItems() {
        for (String item: nItems){
            System.out.println(item + " ");
        }
    }
}


