package Interlemd;

public class Moto extends Terrestre {
    public static char[] toString;

    public Moto() {

    }

    @Override
    public String toString() {
        return " Moto [color " + getColor() + " marca " + getMarca() + " combustible " + getCombustible()
                + " numeroRuedas= " + numeroRuedas + "]";

    }

    private Integer numeroRuedas;

    public Moto(String marca, String combustible, String color, Integer numeroRuedas) {
        super(marca, combustible, color);
        this.numeroRuedas = numeroRuedas;
        // TODO Auto-generated constructor stub
    }

    public Integer getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(Integer numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

}

