package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="ExternalPublication")
public class ExternalPublication {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExternalPublication;
    @Column(name = "headline",nullable = false,length = 300)
    private  String headline;
    @Column(name = "link",nullable = false,length = 500)
    private  String link;

    @ManyToOne
    @JoinColumn(name = "id_logicuser")
    private LogicUser logicUser;

    //Constructor
    public ExternalPublication() {
    }

    public ExternalPublication(int idExternalPublication, String headline, String link, LogicUser logicUser) {
        this.idExternalPublication = idExternalPublication;
        this.headline = headline;
        this.link = link;
        this.logicUser = logicUser;
    }

    public int getIdExternalPublication() {
        return idExternalPublication;
    }

    public void setIdExternalPublication(int idExternalPublication) {
        this.idExternalPublication = idExternalPublication;
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

    public LogicUser getLogicUser() {
        return logicUser;
    }

    public void setLogicUser(LogicUser logicUser) {
        this.logicUser = logicUser;
    }
}