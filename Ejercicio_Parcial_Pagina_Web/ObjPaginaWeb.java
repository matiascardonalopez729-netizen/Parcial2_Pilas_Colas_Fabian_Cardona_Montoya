public class ObjPaginaWeb {

    private String urlPagina;
    private String tituloPagina;
    private String fechaAcceso;

    public ObjPaginaWeb(String urlPagina, String tituloPagina, String fechaAcceso) {
        this.urlPagina = urlPagina;
        this.tituloPagina = tituloPagina;
        this.fechaAcceso = fechaAcceso;
    }

    public ObjPaginaWeb() {
    }

    public String getUrlPagina() {
        return urlPagina;
    }

    public void setUrlPagina(String urlPagina) {
        this.urlPagina = urlPagina;
    }

    public String getTituloPagina() {
        return tituloPagina;
    }

    public void setTituloPagina(String tituloPagina) {
        this.tituloPagina = tituloPagina;
    }

    public String getFechaAcceso() {
        return fechaAcceso;
    }

    public void setFechaAcceso(String fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }
}