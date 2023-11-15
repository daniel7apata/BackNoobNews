package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.LogicUser;
import pe.edu.upc.aaw.demo01.entities.Users;


import java.time.LocalDate;

public class AcknowledgmentDTO {

    private int idAcknowledgment;
    private  String description;
    private LocalDate dateAcknowledgment;
    private LogicUser logicUser;

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

    public LogicUser getLogicUser() {
        return logicUser;
    }

    public void setLogicUser(LogicUser logicUser) {
        this.logicUser = logicUser;
    }
}