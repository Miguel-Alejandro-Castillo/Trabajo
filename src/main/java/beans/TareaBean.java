package beans;


import models.entities.Usuario;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Alejandro on 6/12/2017.
 */
public class TareaBean {
    private Long id_tarea;
    @NotNull
    @NotEmpty
    private String titulo;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date fecha_vencimiento;
    @NotNull
    @NotEmpty
    private String descripcion;
    @NotNull
    private Boolean realizada;


    public TareaBean() {
        super();
    }

    public TareaBean(Long id_tarea, String titulo, Date fecha_vencimiento, String descripcion, Boolean realizada) {
        this();
        this.id_tarea = id_tarea;
        this.titulo = titulo;
        this.fecha_vencimiento = fecha_vencimiento;
        this.descripcion = descripcion;
        this.realizada = realizada;
    }



    public Long getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(Long id_tarea) {
        this.id_tarea = id_tarea;
    }

    public Boolean getRealizada() {
        return realizada;
    }

    public void setRealizada(Boolean realizada) {
        this.realizada = realizada;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
