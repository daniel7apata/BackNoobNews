package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoUsuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserType;
    @Column(name = "description",nullable = false,length = 15)
    private  String description;
    @Column(name = "editPermission",nullable = false)
    private  boolean editPermission;

    //Constructor
    public TipoUsuario() {
    }

    public TipoUsuario(int idUserType, String description, boolean editPermission) {
        this.idUserType = idUserType;
        this.description = description;
        this.editPermission = editPermission;
    }

    public int getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEditPermission() {
        return editPermission;
    }

    public void setEditPermission(boolean editPermission) {
        this.editPermission = editPermission;
    }
}