package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="PublicacionExterna")
public class PublicacionExterna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExternalNews;
    @Column(name = "headline",nullable = false,length = 50)
    private  String headline;
    @Column(name = "link",nullable = false,length = 300)
    private  String link;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private  Usuario user;

    //Constructor
    public PublicacionExterna() {
    }

    public PublicacionExterna(int idExternalNews, String headline, String link, Usuario user) {
        this.idExternalNews = idExternalNews;
        this.headline = headline;
        this.link = link;
        this.user = user;
    }

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
