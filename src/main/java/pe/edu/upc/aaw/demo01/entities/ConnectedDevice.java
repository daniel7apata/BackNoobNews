package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="ConnectedDevice")
public class ConnectedDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConnectedDevice;
    @Column(name = "nameDevice",nullable = false,length = 20)
    private  String nameDevice;
    @Column(name = "dateDevice",nullable = false)
    private LocalDate dateDevice;
    @Column(name = "timeDevice",nullable = false)
    private LocalTime timeDevice;

    @ManyToOne
    @PrimaryKeyJoinColumn
    @JoinColumn(name = "id_configuration")
    private Configuration configuration;


    //Constructor
    public ConnectedDevice() {
    }

    public ConnectedDevice(int idConnectedDevice, String nameDevice, LocalDate dateDevice, LocalTime timeDevice, Configuration configuration) {
        this.idConnectedDevice = idConnectedDevice;
        this.nameDevice = nameDevice;
        this.dateDevice = dateDevice;
        this.timeDevice = timeDevice;
        this.configuration = configuration;
    }

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