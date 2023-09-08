package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConnectedDeviceDTO {

    private int idConnectedDevice;
    private  String nameDevice;
    private LocalDate dateDevice;
    private LocalTime timeDevice;
    private Configuration configuration;

    public int getIdConnectedDevice() {
        return idConnectedDevice;
    }

    public void setIdConnectedDevice(int idConnectedDevice) {
        this.idConnectedDevice = idConnectedDevice;
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

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}