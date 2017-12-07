package models.entities;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alejandro on 4/12/2017.
 */
@Entity
@Table(name="TAREAS")
public class Tarea {
    @Id
    @Column(name="id_tarea", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_tarea;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private Date fecha_vencimiento;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private Boolean realizada;
    @ManyToOne(optional = false)
    @JoinColumn(name="id_usuario")
    private Usuario usuarioPropietario;

    public Tarea( ){
        super();
        this.realizada=false;
    }
    public Tarea(String titulo, Date fecha_vencimiento, String descripcion, Usuario usuarioPropietario) {
        this();
        this.titulo = titulo;
        this.fecha_vencimiento = fecha_vencimiento;
        this.descripcion = descripcion;
        this.usuarioPropietario = usuarioPropietario;
    }

    public Tarea(Long id_tarea,String titulo, Date fecha_vencimiento,String descripcion, Boolean realizada, Usuario usuarioPropietario) {
        this.id_tarea=id_tarea;
        this.titulo = titulo;
        this.usuarioPropietario = usuarioPropietario;
        this.realizada = realizada;
        this.descripcion = descripcion;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Usuario getUsuarioPropietario() {
        return usuarioPropietario;
    }

    public void setUsuarioPropietario(Usuario usuarioPropietario) {
        this.usuarioPropietario = usuarioPropietario;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
