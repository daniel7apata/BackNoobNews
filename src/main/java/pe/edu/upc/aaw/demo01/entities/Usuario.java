package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombre",nullable = false,length = 50)
    private  String nombre;
    @Column(name = "apellidoPaterno",nullable = false,length = 30)
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno",length = 30)
    private String apellidoMaterno;
    @Column(name = "fechaNacimiento",nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "correoElectronico",nullable = false,length = 50)
    private String correoElectronico;
    @Column(name = "contrasenia",nullable = false,length = 20)
    private String contrasenia;
    @Column(name = "perfilLinkedIn",nullable = false,length = 100)
    private String perfilLinkedIn;
    @Column(name = "fechaRegistro",nullable = false)
    private LocalDate fechaRegistro;

    @OneToOne
    @JoinColumn(name="idTipoUsuario")
    private  TipoUsuario tipoUsuario;

    @OneToOne
    @JoinColumn(name="idConfiguracion")
    private  Configuracion configuracion;

    @ManyToOne
    @JoinColumn(name="idUniversidad")
    private  Universidad universidad;



    //Constructor
    public Usuario() {
    }
    //Constructor

    public Usuario(int idUsuario, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, String correoElectronico, String contrasenia, String perfilLinkedIn, LocalDate fechaRegistro, TipoUsuario tipoUsuario, Configuracion configuracion, Universidad universidad) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.contrasenia = contrasenia;
        this.perfilLinkedIn = perfilLinkedIn;
        this.fechaRegistro = fechaRegistro;
        this.tipoUsuario = tipoUsuario;
        this.configuracion = configuracion;
        this.universidad = universidad;
    }


    //Getter

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getPerfilLinkedIn() {
        return perfilLinkedIn;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public Universidad getUniversidad() {
        return universidad;
    }


    //Setter


    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setPerfilLinkedIn(String perfilLinkedIn) {
        this.perfilLinkedIn = perfilLinkedIn;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
