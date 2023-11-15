package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.LogicUser;
import pe.edu.upc.aaw.demo01.entities.Publication;
import pe.edu.upc.aaw.demo01.entities.Users;

import java.time.LocalDate;
import java.time.LocalTime;

public class InteractionDTO {

    private int idInteraction;
    private LocalDate dateInteraction;
    private LocalTime timeInteraction;
    private boolean liked;
    private boolean shared;
    private  String comment;
    private Publication publication;
    private LogicUser logicUser;

    public int getIdInteraction() {
        return idInteraction;
    }

    public void setIdInteraction(int idInteraction) {
        this.idInteraction = idInteraction;
    }

    public LocalDate getDateInteraction() {
        return dateInteraction;
    }

    public void setDateInteraction(LocalDate dateInteraction) {
        this.dateInteraction = dateInteraction;
    }

    public LocalTime getTimeInteraction() {
        return timeInteraction;
    }

    public void setTimeInteraction(LocalTime timeInteraction) {
        this.timeInteraction = timeInteraction;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public LogicUser getLogicUser() {
        return logicUser;
    }

    public void setLogicUser(LogicUser logicUser) {
        this.logicUser = logicUser;
    }
}