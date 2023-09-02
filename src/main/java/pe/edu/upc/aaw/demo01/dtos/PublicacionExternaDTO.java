package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Usuario;

public class PublicacionExternaDTO {

    private int idExternalNews;
    private  String headline;
    private  String link;
    private Usuario user;

    public int getIdExternalNews() {
        return idExternalNews;
    }

    public void setIdExternalNews(int idExternalNews) {
        this.idExternalNews = idExternalNews;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
