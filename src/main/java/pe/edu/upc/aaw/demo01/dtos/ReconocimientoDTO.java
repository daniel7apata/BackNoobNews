package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Usuario;


import java.time.LocalDate;

public class ReconocimientoDTO {

    private int idAcknowledgment;
    private  String description;
    private LocalDate dateAcknowledgment;
    private Usuario user;

    public int getIdAcknowledgment() {
        return idAcknowledgment;
    }

    public void setIdAcknowledgment(int idAcknowledgment) {
        this.idAcknowledgment = idAcknowledgment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateAcknowledgment() {
        return dateAcknowledgment;
    }

    public void setDateAcknowledgment(LocalDate dateAcknowledgment) {
        this.dateAcknowledgment = dateAcknowledgment;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
