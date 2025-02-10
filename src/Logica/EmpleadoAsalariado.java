package Logica;


public class EmpleadoAsalariado extends Empleado {
    private double sueldoMensual;

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(double sueldoMensual, int id, String nombre, String apellido, String fono, String email, String fechaInicio, int idDepartamento, int idProyecto) {
        super(id, nombre, apellido, fono, email, fechaInicio, idDepartamento, idProyecto);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    
    
    
    
}
