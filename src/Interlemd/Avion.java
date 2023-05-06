package Interlemd;

public class Avion extends Aereo {
    public Avion() {

    }

    @Override
    public String toString() {
        return " Avion [color " + getColor() + " marca " + getMarca() + " combustible " + getCombustible()
                + " numeroTurbinas= " + numeroTurbinas + "]";
    }

    private Integer numeroTurbinas;
    public static char[] toString;

    public Avion(String marca2, String combustible2, String color2, Integer numeroTurbinas) {
        super(marca2, combustible2, color2);
        this.numeroTurbinas = numeroTurbinas;
    }

    public Integer getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public void setNumeroTurbinas(Integer numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }

}
