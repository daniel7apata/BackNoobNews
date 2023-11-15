package pe.edu.upc.aaw.demo01.entities;
import pe.edu.upc.aaw.demo01.entities.LogicUser;

import javax.persistence.*;

@Entity
@Table(name = "LogicRol")
public class LogicRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rol;
    @Column(name = "editPermission",nullable = false)
    private  boolean editPermission;
    @OneToOne
    @JoinColumn(name="id_logicuser", nullable=false)
    private LogicUser logicUser;

    public LogicRol() {
    }

    public LogicRol(Long id, String rol, boolean editPermission, LogicUser logicUser) {
        this.id = id;
        this.rol = rol;
        this.editPermission = editPermission;
        this.logicUser = logicUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEditPermission() {
        return editPermission;
    }

    public void setEditPermission(boolean editPermission) {
        this.editPermission = editPermission;
    }

    public LogicUser getLogicUser() {
        return logicUser;
    }

    public void setLogicUser(LogicUser logicUser) {
        this.logicUser = logicUser;
    }
}
