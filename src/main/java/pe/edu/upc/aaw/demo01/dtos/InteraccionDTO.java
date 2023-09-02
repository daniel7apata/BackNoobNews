package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Publicacion;
import pe.edu.upc.aaw.demo01.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class InteraccionDTO {

    private int idInteraccion;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean like;
    private boolean compartido;
    private  String comentario;
    private Publicacion publicacion;
    private Usuario usuario;

    public int getIdInteraccion() {
        return idInteraccion;
    }

    public void setIdInteraccion(int idInteraccion) {
        this.idInteraccion = idInteraccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public boolean isCompartido() {
        return compartido;
    }

    public void setCompartido(boolean compartido) {
        this.compartido = compartido;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
