package pe.edu.upc.aaw.demo01.dtos;

import pe.edu.upc.aaw.demo01.entities.Usuario;


import java.time.LocalDate;

public class ReconocimientoDTO {

    private int idReconocimiento;
    private  String descripcion;
    private LocalDate fecha;
    private Usuario usuario;


    public int getIdReconocimiento() {
        return idReconocimiento;
    }

    public void setIdReconocimiento(int idReconocimiento) {
        this.idReconocimiento = idReconocimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
