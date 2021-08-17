package OmarAli.arv;

public class PersonRequestObject {
    private final double heritage;
    private final int personType1;
    private final int personType2;
    private final int personType3;

    public PersonRequestObject(double heritage, int personType1, int personType2, int personType3) {
        this.heritage = heritage;
        this.personType1 = personType1;
        this.personType2 = personType2;
        this.personType3 = personType3;
    }

    public double getHeritage() {
        return heritage;
    }

    public int getPersonType1() {
        return personType1;
    }

    public int getPersonType2() {
        return personType2;
    }

    public int getPersonType3() {
        return personType3;
    }
}