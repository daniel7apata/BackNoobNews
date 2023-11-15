package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.LogicUser;



public class LogicRolDTO {
    private Long id;
    private String rol;
    private  boolean editPermission;
    private LogicUser logicUser;

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
