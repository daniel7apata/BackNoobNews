package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.LogicUser;
import pe.edu.upc.aaw.demo01.entities.Users;

public class ExternalPublicationDTO {

    private int idExternalPublication;
    private  String headline;
    private  String link;
    private LogicUser logicUser;

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