package OmarAli.arv;

public class PersonResponseObject {
    private final double amountPerson1;
    private final double amountPerson2;
    private final double amountPerson3;

    public PersonResponseObject(double amountPerson1, double amountPerson2, double amountPerson3) {
        this.amountPerson1 = amountPerson1;
        this.amountPerson2 = amountPerson2;
        this.amountPerson3 = amountPerson3;
    }

    public double getAmountPerson1() {
        return amountPerson1;
    }

    public double getAmountPerson2() {
        return amountPerson2;
    }

    public double getAmountPerson3() {
        return amountPerson3;
    }
}
