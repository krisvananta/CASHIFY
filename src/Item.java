import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Item {
    private int itemId;
    private String itemName;
    private double price;

    public Item(int itemId, String itemName, double price){
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getItemId(){
        return  itemId;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPrice(){
        return price;
    }

    abstract void displayDetails();
}
