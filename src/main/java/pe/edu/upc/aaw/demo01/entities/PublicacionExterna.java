package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;

@Entity
@Table(name="PublicacionExterna")
public class PublicacionExterna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacionExterna;
    @Column(name = "headlinePE",nullable = false,length = 50)
    private  String headlinePE;
    @Column(name = "linkPE",nullable = false,length = 300)
    private  String linkPE;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private  Usuario usuario;

    //Constructor
    public PublicacionExterna() {
    }


    //Constructor

    public PublicacionExterna(int idPublicacionExterna, String headlinePE, String linkPE, Usuario usuario) {
        this.idPublicacionExterna = idPublicacionExterna;
        this.headlinePE = headlinePE;
        this.linkPE = linkPE;
        this.usuario = usuario;
    }


    //Getter

    public int getIdPublicacionExterna() {
        return idPublicacionExterna;
    }

    public String getHeadlinePE() {
        return headlinePE;
    }

    public String getLinkPE() {
        return linkPE;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    //Setter


    public void setIdPublicacionExterna(int idPublicacionExterna) {
        this.idPublicacionExterna = idPublicacionExterna;
    }

    public void setHeadlinePE(String headlinePE) {
        this.headlinePE = headlinePE;
    }

    public void setLinkPE(String linkPE) {
        this.linkPE = linkPE;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
