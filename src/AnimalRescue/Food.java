package AnimalRescue;

public class Food {


    private String food_name;
    private int price;
    private int quantity;
    private int availability;

    public void setFood_name(String food_name){
        this.food_name = food_name;
    }
    public String getFood_name() {
        return food_name;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setAvailability(int availability){
        this.availability = availability;
    }
    public int getAvailability() {
        return availability;
    }




}
