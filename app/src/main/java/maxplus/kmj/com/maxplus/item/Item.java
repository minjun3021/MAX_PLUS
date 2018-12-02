package maxplus.kmj.com.maxplus.item;

public class Item {
    private String name;
    private int amount;
    private String check;
    private String date;

    public Item(String name, int amount, String check, String date) {

        this.name = name;
        this.amount = amount;
        this.check = check;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
