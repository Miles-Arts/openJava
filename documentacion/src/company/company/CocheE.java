package company.company;

public class CocheE {

    String name = "nombre de coche";

    public CocheE() {

    }

    public CocheE(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CocheE{" +
                "name='" + name + '\'' +
                '}';
    }
}
