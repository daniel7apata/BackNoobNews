package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Usuario;

public class PublicacionExternaDTO {

    private int idPublicacionExterna;
    private  String titular;
    private  String enlace;
    private Usuario usuario;

    public int getIdPublicacionExterna() {
        return idPublicacionExterna;
    }

    public void setIdPublicacionExterna(int idPublicacionExterna) {
        this.idPublicacionExterna = idPublicacionExterna;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
