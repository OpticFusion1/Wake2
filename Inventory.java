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

  public String listItems(){
    String i;
    i = "0"; //replace this
    //i = inv;
    return i;


//    int x = inv.size();
//    for (int y = 0; y < x + 1; y++){
//      System.out.println(inv(y).getName());
//    }//for y < x+1 
    
  }

}//Inventory
