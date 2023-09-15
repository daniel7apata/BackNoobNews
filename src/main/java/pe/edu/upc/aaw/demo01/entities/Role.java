package pe.edu.upc.aaw.demo01.entities;
import javax.persistence.*;

@Entity
@Table(name="Role")
public class Role {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column(name = "role",nullable = false,length = 15)
    private  String role;
    @Column(name = "editPermission",nullable = false)
    private  boolean editPermission;

    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private Users user;

    //Constructor
    public Role() {
    }

    public Role(int idRole, String role, boolean editPermission, Users user) {
        this.idRole = idRole;
        this.role = role;
        this.editPermission = editPermission;
        this.user = user;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEditPermission() {
        return editPermission;
    }

    public void setEditPermission(boolean editPermission) {
        this.editPermission = editPermission;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

}