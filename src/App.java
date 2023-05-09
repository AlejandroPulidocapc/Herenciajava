
import java.util.ArrayList;
import java.util.List;

import Interlemd.Avion;
import Interlemd.Moto;
import Interlemd.Vehiculo;
import Interlemd.Yate;

public class App {
    public static void main(String[] args) throws Exception {

        Moto moto = new Moto("Rojo", " BMW ", "200CC", 2);
        Moto moto2 = new Moto();
        moto2.setColor(" Verde ");
        moto2.setMarca(" Yamaha ");
        moto2.setCombustible(" 187CC ");
        moto2.setNumeroRuedas(2);

        System.out.println(moto.toString());
        System.out.println(moto2.toString());

        System.out.println("rodando en mi moto");

        System.out.println("********************");

        Avion avion = new Avion("Rojo", " BMW ", "200CC", 2);
        Avion avion2 = new Avion();
        avion2.setColor(" Verde ");
        avion2.setMarca(" Yamaha ");
        avion2.setCombustible(" 187CC ");
        avion2.setNumeroTurbinas(2);

        System.out.println(avion.toString());
        System.out.println(avion2.toString());
        System.out.println("volando en mi avion");

        System.out.println("**********************");

        Yate yate = new Yate("Rojo", " BMW ", "200CC", 2);
        Yate yate2 = new Yate();
        yate2.setColor(" Verde ");
        yate2.setMarca(" Yamaha ");
        yate2.setCombustible(" 187CC ");
        yate2.setNumeroMotores(2);
        System.out.println(yate.toString());
        System.out.println(yate2.toString());
        System.out.println("Navegando en mi yate");
    }

List<Vehiculo> ListaVehiculos = new  ArrayList<>();
//createMoto();
Vehiculo vehiculo1 = new Moto("Rojo", " BMW ", "200CC", 2);
Vehiculo vehiculo2 = new Yate("Rojo", " BMW ", "200CC", 2);


 
{
    ListaVehiculos .add(vehiculo1);

ListaVehiculos .add(vehiculo2);
for (Vehiculo objeto : ListaVehiculos )


{
    System.out.println(objeto.toString());
}


}
}
