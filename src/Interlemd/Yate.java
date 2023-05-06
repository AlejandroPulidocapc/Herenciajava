package Interlemd;

public class Yate extends Acuatico {
    public static char[] toString;

    @Override
    public String toString() {
        return " Yate [color " + getColor() + " marca " + getMarca() + " combustible " + getCombustible()
                + " numeroMotores= " + numeroMotores + "]";
    }

    public Yate() {

    }

    private Integer numeroMotores;

    public Yate(String marca2, String combustible2, String color2, Integer numeroMotores) {
        super(marca2, combustible2, color2);
        this.numeroMotores = numeroMotores;
    }

    public Integer getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(Integer numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

}
