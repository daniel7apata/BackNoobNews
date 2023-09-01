package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

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
    @Column(name = "idUsuario",nullable = false)
    private  int idUsuario;

    //Constructor
    public PublicacionExterna() {
    }


    //Constructor
    public PublicacionExterna(int idPublicacionExterna, int idUsuario, String headlinePE, String linkPE) {
        this.idPublicacionExterna = idPublicacionExterna;
        this.idUsuario = idUsuario;
        this.headlinePE = headlinePE;
        this.linkPE = linkPE;
    }


    //Getter
    public int getIdPublicacionExterna() {return idPublicacionExterna;}
    public int getIdUsuario() {return idUsuario;}
    public String getHeadlinePE() {return headlinePE;}
    public String getLinkPE() {return linkPE;}

    //Setter
    public void setIdPublicacionExterna(int idPublicacionExterna) {this.idPublicacionExterna = idPublicacionExterna;}
    public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}
    public void setHeadlinePE(String headlinePE) {this.headlinePE = headlinePE;}
    public void setLinkPE(String linkPE) {this.linkPE = linkPE;}


}
