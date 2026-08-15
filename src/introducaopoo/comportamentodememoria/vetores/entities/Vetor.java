package introducaopoo.comportamentodememoria.vetores.entities;

public class Vetor {

    private String nameV;
    private double priceV;

    public Vetor(String name, double price) {
        this.nameV = name;
        this.priceV = price;
    }

    public String getName() {
        return nameV;
    }

    public void setName(String name) {
        this.nameV = name;
    }

    public double getPrice() {
        return priceV;
    }

    public void setPrice(double price) {
        this.priceV = price;
    }
}
