package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;


@Entity
@Table(name="Configuracion")
public class Configuracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSettings;
    @Column(name = "language",nullable = false,length = 15)
    private  String language;
    @Column(name = "notifications",nullable = false)
    private  boolean notifications;

    //Constructor
    public Configuracion() {
    }

    public Configuracion(int idSettings, String language, boolean notifications) {
        this.idSettings = idSettings;
        this.language = language;
        this.notifications = notifications;
    }

    public int getIdSettings() {
        return idSettings;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setIdSettings(int idSettings) {
        this.idSettings = idSettings;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }
}
