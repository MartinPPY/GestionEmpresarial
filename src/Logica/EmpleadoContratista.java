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

    @Override
    public int calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
     
    
}
