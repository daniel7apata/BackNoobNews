package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Configuracion")
public class Configuracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConfiguracion;
    @Column(name = "language",nullable = false,length = 15)
    private  String language;
    @Column(name = "notifications",nullable = false)
    private  boolean notifications;

    //Constructor
    public Configuracion() {
    }


    //Constructor
    public Configuracion(int idConfiguracion, String language, boolean notifications) {
        this.idConfiguracion = idConfiguracion;
        this.language = language;
        this.notifications = notifications;
    }

    //Getter
    public int getIdConfiguracion() {return idConfiguracion;}
    public String getLanguage() {return language;}
    public boolean isNotifications() {return notifications;}

    //Setter
    public void setIdConfiguracion(int idConfiguracion) {this.idConfiguracion = idConfiguracion;}
    public void setLanguage(String language) {this.language = language;}
    public void setNotifications(boolean notifications) {this.notifications = notifications;}
}
