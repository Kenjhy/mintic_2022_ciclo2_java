package com.octans.demo.services;

import com.octans.demo.models.dao.UsuarioDao;
import com.octans.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service// registrarlo como un bin en el contenedor de Spring
public class UsuarioServicesImpl implements  UsuarioService{


   @Autowired // Inyeccion de dependencias
   private UsuarioDao usuarioDao;
   @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public Usuario findById(Long id_usuario) {
        return usuarioDao.findById(id_usuario).orElse(null);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public void delete(Long id_usuario) {
       usuarioDao.deleteById(id_usuario);

    }
}
