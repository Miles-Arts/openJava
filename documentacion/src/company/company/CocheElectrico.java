package company.company;

public class CocheElectrico extends Coche{

   String motorElectrico;

   public CocheElectrico() {

   }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
