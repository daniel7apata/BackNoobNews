package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="TipoUsuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;
    @Column(name = "descriptionType",nullable = false,length = 15)
    private  String descriptionType;
    @Column(name = "editPermission",nullable = false)
    private  boolean editPermission;

    //Constructor
    public TipoUsuario() {
    }


    //Constructor
    public TipoUsuario(int idTipoUsuario, String descriptionType, boolean editPermission) {
        this.idTipoUsuario = idTipoUsuario;
        this.descriptionType = descriptionType;
        this.editPermission = editPermission;
    }


    //Getter
    public int getIdTipoUsuario() {return idTipoUsuario;}
    public String getDescriptionType() {return descriptionType;}
    public boolean isEditPermission() {return editPermission;}

    //Setter
    public void setIdTipoUsuario(int idTipoUsuario) {this.idTipoUsuario = idTipoUsuario;}
    public void setDescriptionType(String descriptionType) {this.descriptionType = descriptionType;}
    public void setEditPermission(boolean editPermission) {this.editPermission = editPermission;}


}
