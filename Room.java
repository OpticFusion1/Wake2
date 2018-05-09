import java.util.ArrayList;

public class Room{

  //parameters here;
  public String name;
  public String shortDesc;
  public String longDesc;

  public ArrayList<Room> exits = new ArrayList<Room>(); //n,s,e,w
  public ArrayList<Item> items = new ArrayList<Item>();

  //getters/setters

  String getName() {
    return name;
  }//getName()

  String getShortDesc() {
    return shortDesc;
  }//getShortDesc

  String getLongDesc() {
    return longDesc;
  }//getLongDesc
 
  public void setName(String x) {
    name = x;
  }//setName()

  public void setShortDesc(String x) {
    shortDesc = x;
  }//setShortDesc

  public void setLongDesc(String x) {
    longDesc = x;
  }//setLongDesc

  public void addExit(int x, Room y) {
    exits.add(x, y);
  }//addExit

  public void addItem(Item x){
    items.add(x);
  }

}//Room
