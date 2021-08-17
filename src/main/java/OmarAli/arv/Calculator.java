package OmarAli.arv;

public class Calculator {

    private static final double HIGH_INCOME_LIMIT = 43000.0;

    public PersonResponseObject calculate(PersonRequestObject requestObject) {
        double p1 = calculatePerson1(requestObject.getHeritage(), requestObject.getPersonType1());
        double p2 = calculatePerson2(requestObject.getHeritage(), requestObject.getPersonType2());
        double p3 = calculatePerson3(requestObject.getHeritage(), requestObject.getPersonType3());
        //TODO: Proper calculation

        return new PersonResponseObject(p1, p2, p3);
    }

    private double calculatePerson1(double income, int personType) {
        boolean highIncome = income >= HIGH_INCOME_LIMIT;

        switch (personType) {
            case 0:
                return 0;
            case 1:
                return income * 0.50;
            case 2:
                return income * 0.25;
            case 3:
                return income * 0.125;
            case 4:
                return income * 0.33;
            case 5:
                return income * 0.166;
        }
        return 0;
    }
    private double calculatePerson2(double income, int personType) {
        boolean highIncome = income >= HIGH_INCOME_LIMIT;

        switch (personType) {
            case 0:
                return 0;
            case 1:
                return income * 0.50;
            case 2:
                return income * 0.25;
            case 3:
                return income * 0.125;
            case 4:
                return income * 0.33;
            case 5:
                return income * 0.166;
        }
        return 0;
    }
    private double calculatePerson3(double income, int personType) {
        boolean highIncome = income >= HIGH_INCOME_LIMIT;

        switch (personType) {
            case 0:
                return 0;
            case 1:
                return income * 0.50;
            case 2:
                return income * 0.25;
            case 3:
                return income * 0.25;
            case 4:
                return income * 0.125;
            case 5:
                //resterande arv
                return income * 0.0;
            case 6:
                return income * 166;
            case 7:
                return income * 0.33;
            case 8:
                //en tredjedel av resterande
                return income * 0.01;
            case 9:
                return income * 0.50;
            case 10:
                return income * 0.66;
            case 11:
                return income * 0.33;
            case 12:
                return income * 0.33;
        }
        return 0;
    }
}