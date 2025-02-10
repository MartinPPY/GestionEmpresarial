package Logica;

public class EmpleadoContratista extends Empleado {
    private double pagoPorProyecto;

    public EmpleadoContratista() {
    }

    public EmpleadoContratista(double pagoPorProyecto, int id, String nombre, String apellido, String fono, String email, String fechaInicio, int idDepartamento, int idProyecto) {
        super(id, nombre, apellido, fono, email, fechaInicio, idDepartamento, idProyecto);
        this.pagoPorProyecto = pagoPorProyecto;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }
    
    
    
     
    
}
