package mx.uach.fing.manejousuarios.dao;

import java.util.List;
import mx.uach.fing.manejousuarios.datos.Usuario;

/**
 *
 * @author User1
 * @param <t>
 */
public interface Crud <t>{
    
    public List<t> list();
    
    public void create(Usuario usuario);
    
    public void update(Usuario usuario);
    
    public void eliminar(Integer id);
}
