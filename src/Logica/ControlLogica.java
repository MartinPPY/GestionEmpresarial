package Logica;

import Persistencia.ControlPersistencia;


public class ControlLogica {
    ControlPersistencia control = new ControlPersistencia();
    
    //Crear usuario en la bd
    public void crearUsuario(Usuario user){
        control.crearUser(user);
    }
    
    //Buscar por correo al usuario
    public Usuario findUserByEmail(String email){
        return control.findUserByEmail(email);
                
    }
    
}
