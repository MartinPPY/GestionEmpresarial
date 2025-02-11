package Logica;


public class EmpleadoPorHora extends Empleado {
    
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora() {
    }        

    public EmpleadoPorHora(double tarifaPorHora, int horasTrabajadas, int id, String nombre, String apellido, String fono, String email, String fechaInicio, int idDepartamento, int idProyecto) {
        super(id, nombre, apellido, fono, email, fechaInicio, idDepartamento, idProyecto);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public int calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
