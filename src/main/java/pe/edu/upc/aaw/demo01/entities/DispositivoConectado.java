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
    @Column(name = "nombre",nullable = false,length = 20)
    private  String nombre;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name = "hora",nullable = false)
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "idConfiguracion")
    private Configuracion configuracion;


    //Constructor
    public DispositivoConectado() {
    }

    //Constructor

    public DispositivoConectado(int idDispositivo, String nombre, LocalDate fecha, LocalTime hora, Configuracion configuracion) {
        this.idDispositivo = idDispositivo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.configuracion = configuracion;
    }


    //Getter

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }


    //Setter


    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }
}
