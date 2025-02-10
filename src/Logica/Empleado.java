package Logica;


public abstract class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String fono;
    private String email;    
    private String fechaInicio;
    private int idDepartamento;
    private int idProyecto;
    

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String fono, String email, String fechaInicio, int idDepartamento, int idProyecto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fono = fono;
        this.email = email;
        this.fechaInicio = fechaInicio;
        this.idDepartamento = idDepartamento;
        this.idProyecto = idProyecto;
    }

    

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }


    
    
    
}
