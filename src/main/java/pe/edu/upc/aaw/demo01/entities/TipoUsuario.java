package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoUsuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;
    @Column(name = "descripcion",nullable = false,length = 15)
    private  String descripcion;
    @Column(name = "permisoDeEdicion",nullable = false)
    private  boolean permisoDeEdicion;

    //Constructor
    public TipoUsuario() {
    }


    //Constructor

    public TipoUsuario(int idTipoUsuario, String descripcion, boolean permisoDeEdicion) {
        this.idTipoUsuario = idTipoUsuario;
        this.descripcion = descripcion;
        this.permisoDeEdicion = permisoDeEdicion;
    }


    //Getter

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isPermisoDeEdicion() {
        return permisoDeEdicion;
    }


    //Setter


    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPermisoDeEdicion(boolean permisoDeEdicion) {
        this.permisoDeEdicion = permisoDeEdicion;
    }
}
