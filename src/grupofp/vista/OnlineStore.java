package grupofp.vista;

import grupofp.controlador.Controlador;
import grupofp.modelo.*;

public class OnlineStore {
    public static void main(String[] args) {

        GestionOS view = new GestionOS();
        Datos model = new Datos();
        System.out.println("Test MVC OnlineStore");
        Controlador ctrl = new Controlador(model,view );

        //Arrancar el menu de la vista
        view.run();
    }
}
