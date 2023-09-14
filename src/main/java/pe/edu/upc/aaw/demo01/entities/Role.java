package pe.edu.upc.aaw.demo01.entities;
import javax.persistence.*;

@Entity
@Table(name="Role")
public class Role {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column(name = "description",nullable = false,length = 15)
    private  String description;
    @Column(name = "editPermission",nullable = false)
    private  boolean editPermission;

    //Constructor
    public Role() {
    }

    public Role(int idRole, String description, boolean editPermission) {
        this.idRole = idRole;
        this.description = description;
        this.editPermission = editPermission;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
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