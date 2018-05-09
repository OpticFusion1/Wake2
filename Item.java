public class Item{

  public String name;
  public String desc;
  public boolean obtainable = false;

  public Item(String itemName, String itemDescription, boolean obt){
    name = itemName;
    desc = itemDescription;
    obtainable = obt;

  }//Item()

  public String getName(){
    return name;
  }

  public String getDesc(){
    return desc;
  }

  public boolean getObtainable(){
    return obtainable;
  }

}//Item
