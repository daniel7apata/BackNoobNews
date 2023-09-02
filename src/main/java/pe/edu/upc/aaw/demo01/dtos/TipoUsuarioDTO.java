package pe.edu.upc.aaw.demo01.dtos;

public class TipoUsuarioDTO {

    private int idTipoUsuario;
    private  String descripcion;
    private  boolean permisoDeEdicion;


    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPermisoDeEdicion() {
        return permisoDeEdicion;
    }

    public void setPermisoDeEdicion(boolean permisoDeEdicion) {
        this.permisoDeEdicion = permisoDeEdicion;
    }
}
