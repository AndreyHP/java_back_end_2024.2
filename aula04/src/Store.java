public class Store {
    String[] Items;

    public Store(String[] Items){
        this.Items = Items;
    }

    public  void showItems(){
        for (String items: Items){
           System.out.println(items);
        }
    }
}
