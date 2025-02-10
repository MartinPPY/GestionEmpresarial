package Logica;

import java.util.List;


public class Proyecto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private List<Empleado> asignacion;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, String descripcion, List<Empleado> asignacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.asignacion = asignacion;
    }

    public List<Empleado> getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(List<Empleado> asignacion) {
        this.asignacion = asignacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
