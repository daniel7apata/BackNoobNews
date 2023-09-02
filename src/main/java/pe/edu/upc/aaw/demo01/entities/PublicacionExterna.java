package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="PublicacionExterna")
public class PublicacionExterna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacionExterna;
    @Column(name = "titular",nullable = false,length = 50)
    private  String titular;
    @Column(name = "enlace",nullable = false,length = 300)
    private  String enlace;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private  Usuario usuario;

    //Constructor
    public PublicacionExterna() {
    }


    //Constructor

    public PublicacionExterna(int idPublicacionExterna, String titular, String enlace, Usuario usuario) {
        this.idPublicacionExterna = idPublicacionExterna;
        this.titular = titular;
        this.enlace = enlace;
        this.usuario = usuario;
    }


    //Getter

    public int getIdPublicacionExterna() {
        return idPublicacionExterna;
    }

    public String getTitular() {
        return titular;
    }

    public String getEnlace() {
        return enlace;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    //Setter


    public void setIdPublicacionExterna(int idPublicacionExterna) {
        this.idPublicacionExterna = idPublicacionExterna;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
