package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="DispositivoConectado")
public class DispositivoConectado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDevice;
    @Column(name = "nameDevice",nullable = false,length = 20)
    private  String nameDevice;
    @Column(name = "dateDevice",nullable = false)
    private LocalDate dateDevice;
    @Column(name = "timeDevice",nullable = false)
    private LocalTime timeDevice;

    @ManyToOne
    @JoinColumn(name = "idSettings")
    private Configuracion settings;


    //Constructor
    public DispositivoConectado() {
    }

    public DispositivoConectado(int idDevice, String nameDevice, LocalDate dateDevice, LocalTime timeDevice, Configuracion settings) {
        this.idDevice = idDevice;
        this.nameDevice = nameDevice;
        this.dateDevice = dateDevice;
        this.timeDevice = timeDevice;
        this.settings = settings;
    }

    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public LocalDate getDateDevice() {
        return dateDevice;
    }

    public void setDateDevice(LocalDate dateDevice) {
        this.dateDevice = dateDevice;
    }

    public LocalTime getTimeDevice() {
        return timeDevice;
    }

    public void setTimeDevice(LocalTime timeDevice) {
        this.timeDevice = timeDevice;
    }

    public Configuracion getSettings() {
        return settings;
    }

    public void setSettings(Configuracion settings) {
        this.settings = settings;
    }
}
