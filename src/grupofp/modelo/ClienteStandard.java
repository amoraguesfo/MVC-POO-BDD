package grupofp.modelo;

public class ClienteStandard extends Cliente {

    public ClienteStandard(String email, String nif, String nombre, String domicilio) {
        super(email, nif, nombre, domicilio);
    }

    @Override
    public String tipoCliente() {
        //TODO
        return null;
    }

    @Override
    public float calcAnual() {
        //TODO
        return 0;
    }

    @Override
    public float descuentoEnvio() {
        //TODO
        return 0;
    }

    @Override
    public String toString() {
        return "ClienteStandard{" +
                "email='" + email + '\'' +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }
}
