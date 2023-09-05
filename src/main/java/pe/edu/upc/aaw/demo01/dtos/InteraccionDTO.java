package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Publicacion;
import pe.edu.upc.aaw.demo01.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class InteraccionDTO {

    private int idInteraction;
    private LocalDate dateInteraction;
    private LocalTime timeInteraction;
    private boolean liked;
    private boolean shared;
    private  String comment;
    private Publicacion news;
    private Usuario user;

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

    public Publicacion getNews() {
        return news;
    }

    public void setNews(Publicacion news) {
        this.news = news;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}