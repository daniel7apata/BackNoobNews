package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;


@Entity
@Table(name="Configuration")
public class Configuration {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConfiguration;
    @Column(name = "language",nullable = false,length = 15)
    private  String language;
    @Column(name = "notifications",nullable = false)
    private  boolean notifications;

    //Constructor
    public Configuration() {
    }

    public Configuration(int idConfiguration, String language, boolean notifications) {
        this.idConfiguration = idConfiguration;
        this.language = language;
        this.notifications = notifications;
    }

    public int getIdConfiguration() {
        return idConfiguration;
    }

    public void setIdConfiguration(int idConfiguration) {
        this.idConfiguration = idConfiguration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }
}