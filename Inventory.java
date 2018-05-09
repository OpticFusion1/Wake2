import java.util.ArrayList;

public class Inventory{

  ArrayList<Item> inv = new ArrayList<Item>();

  public Inventory(){


  }//Inventory()

  public void addItem(Item x){
    inv.add(x);
  }

  public void removeItem(int x){
    inv.remove(x);
  }

  public void listItems(){
    int x = inv.size();
    for (int y = 0; y < x; y++){
      System.out.println(inv.get(y).getName());
    }//for y < x+1 
    
  }

}//Inventory
