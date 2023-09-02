package pe.edu.upc.aaw.demo01.dtos;

public class TipoUsuarioDTO {

    private int idUserType;
    private  String description;
    private  boolean editPermission;

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
