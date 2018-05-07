public class Item{

  public String name;
  public String desc;

  public Item(String itemName, String itemDescription){
    name = itemName;
    desc = itemDescription;

  }//Item()

  public String getName(){
    return name;
  }

  public String getDesc(){
    return desc;
  }

}//Item
