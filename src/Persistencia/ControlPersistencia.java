package Persistencia;

import Logica.Usuario;


public class ControlPersistencia {
    
    UsuarioJpaController user = new UsuarioJpaController();
    
    //crear usuario en la bd
    public void crearUser(Usuario usuario){
        user.create(usuario);
    }
    
    //buscar por email en la bd
    public Usuario findUserByEmail(String email){
        return user.findUserByEmail(email);
    }
    
}
