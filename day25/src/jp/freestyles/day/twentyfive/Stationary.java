package jp.freestyles.day.twentyfive;

public class Stationary {

    private String name;
    private Amount amount;
    private int quantity;

    public Stationary(String name, Amount amount, int quantity) {
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;
        showStationary();
    }

    public Amount calcTotalAmount() {
        return this.amount.multipleByQuantity(this.quantity);
    }

    public void showStationary() {

        System.out.format(
            "%s が %d 本あります %n", 
            this.name, this.quantity);
    }
}
