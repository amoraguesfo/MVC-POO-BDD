package grupofp.modelo;

import java.util.ArrayList;

public class Lista<T>{
    protected ArrayList<T> lista;

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }
    public void add(T t){
        lista.add(t);
    }
}
