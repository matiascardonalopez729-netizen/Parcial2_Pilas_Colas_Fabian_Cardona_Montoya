public class ObjClienteBanco {

    private int idTurno;
    private String nombreCliente;
    private String tipoServicio;
    private String horaLlegada;
    private boolean ClienteAtendido;

    public ObjClienteBanco(int idTurno, String nombreCliente, String tipoServicio, String horaLlegada,
            boolean clienteAtendido) {
        this.idTurno = idTurno;
        this.nombreCliente = nombreCliente;
        this.tipoServicio = tipoServicio;
        this.horaLlegada = horaLlegada;
        ClienteAtendido = clienteAtendido;

    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public boolean isClienteAtendido() {
        return ClienteAtendido;
    }

    public void setClienteAtendido(boolean clienteAtendido) {
        ClienteAtendido = clienteAtendido;
    }

    public ObjClienteBanco() {
    }

}