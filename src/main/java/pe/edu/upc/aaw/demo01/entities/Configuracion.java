package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;


@Entity
@Table(name="Configuracion")
public class Configuracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConfiguracion;
    @Column(name = "idioma",nullable = false,length = 15)
    private  String idioma;
    @Column(name = "notificaciones",nullable = false)
    private  boolean notificaciones;

    //Constructor
    public Configuracion() {
    }


    //Constructor

    public Configuracion(int idConfiguracion, String idioma, boolean notificaciones) {
        this.idConfiguracion = idConfiguracion;
        this.idioma = idioma;
        this.notificaciones = notificaciones;
    }

    //Getter

    public int getIdConfiguracion() {
        return idConfiguracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public boolean isNotificaciones() {
        return notificaciones;
    }


    //Setter

    public void setIdConfiguracion(int idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setNotificaciones(boolean notificaciones) {
        this.notificaciones = notificaciones;
    }
}
