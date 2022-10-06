package grupofp.controlador;

import grupofp.modelo.Articulo;
import grupofp.modelo.Cliente;
import grupofp.modelo.Datos;
import grupofp.vista.GestionOS;

import java.util.List;

public class Controlador {
    private Datos model;
    private GestionOS view;

    public Controlador(Datos model, GestionOS view) {
        this.model = model;
        this.view = view;

        this.view.setController(this);
    }

    public void displayListaArticulos() {
        view.showArticulos(model.getArticulos());
    }

    public void addArticulo(Articulo articulo) {
        model.addArticulo(articulo);
    }

    public void getListaClientes() {
        view.showClientes(model.getClientes());
    }

    public void addCliente(Cliente cliente) {
        model.addCliente(cliente);
    }


}
