import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static boolean onStore = true;

    public static void main(String[] args) {
        level01();
    }

    public static void storelevel(Player player) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("==========Store==========");
        String[] items = {"(1)Potion", "(2)Helmet"};
        Store store = new Store(items);

        store.showItems();

        String playerInput = scanner.nextLine();
        if (Objects.equals(playerInput, "quit")) {
            onStore = false;
        }
        switch (playerInput){
            case "1":{

                player.nItems.add("Potion");
            }
            case "2":{
                player.nItems.add("Helmet");
            }
        }

    }

    public static void level01(){
        Scanner scanner = new Scanner(System.in);

        boolean game = true;

        System.out.println("Choose your name!");
        String name = scanner.nextLine();

        ArrayList<String> items = new ArrayList<>();
        items.add("sword");

        Player player = new Player(name,100,100,10,10,items);


        player.displayInfo();

        while (game){
            String playerInput = scanner.nextLine();
            if (Objects.equals(playerInput, "quit")) {
                game = false;
            }

            switch (playerInput){
                case "items":{
                    player.displayItems();
                }
                case "store":{
                    storelevel(player);
                }
            }
        }
    }

}