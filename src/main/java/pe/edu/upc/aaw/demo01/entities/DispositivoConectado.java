package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="DispositivoConectado")
public class DispositivoConectado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDispositivo;
    @Column(name = "nameDevice",nullable = false,length = 20)
    private  String nameDevice;
    @Column(name = "dateDevice",nullable = false)
    private LocalDate dateDevice;
    @Column(name = "timeDevice",nullable = false)
    private LocalTime timeDevice;

    @ManyToOne
    @JoinColumn(name = "idConfiguracion")
    private Configuracion configuracion;


    //Constructor
    public DispositivoConectado() {
    }

    //Constructor

    public DispositivoConectado(int idDispositivo, String nameDevice, LocalDate dateDevice, LocalTime timeDevice, Configuracion configuracion) {
        this.idDispositivo = idDispositivo;
        this.nameDevice = nameDevice;
        this.dateDevice = dateDevice;
        this.timeDevice = timeDevice;
        this.configuracion = configuracion;
    }


    //Getter

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public LocalDate getDateDevice() {
        return dateDevice;
    }

    public LocalTime getTimeDevice() {
        return timeDevice;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }


    //Setter

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public void setDateDevice(LocalDate dateDevice) {
        this.dateDevice = dateDevice;
    }

    public void setTimeDevice(LocalTime timeDevice) {
        this.timeDevice = timeDevice;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }
}
