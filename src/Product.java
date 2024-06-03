public class Product extends Item{
    private int stock;

    public Product(int itemId, String itemName, double price) {
        super(itemId, itemName, price);
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void addStock(int newStock){
        this.stock = this.stock + newStock;
    }

    public void displayDetails(){

    }

    public void saveToDatabase(){

    }

    public void loadFromDatabase(){

    }
}
