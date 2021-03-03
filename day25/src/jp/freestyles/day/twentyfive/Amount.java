package jp.freestyles.day.twentyfive;

public class Amount {

    private final static double TAX_RATE =  1.08;
    private double value;

    public Amount(double value) {
        this.value = value;
    }

    public Amount add(Amount amount) {
        return new Amount(this.value + amount.value);
    }

    public Amount addTax() {
        return new Amount(this.value * TAX_RATE);
    }

    public void showValue() {
        System.out.format("金額は %.0f 円です", this.value);
    }

	public Amount multipleByQuantity(int quantity) {
		return new Amount(this.value * quantity);
	}
}
