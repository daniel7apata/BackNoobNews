package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Configuracion;

import java.time.LocalDate;
import java.time.LocalTime;

public class DispositivoConectadoDTO {

    private int idDevice;
    private  String nameDevice;
    private LocalDate dateDevice;
    private LocalTime timeDevice;
    private Configuracion settings;

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