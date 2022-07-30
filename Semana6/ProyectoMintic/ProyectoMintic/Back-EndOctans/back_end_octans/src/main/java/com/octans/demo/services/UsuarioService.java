package com.octans.demo.services;

import com.octans.demo.models.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario save(Usuario usuario);
    public  Usuario findById(Long id_usuario);
    public List<Usuario>findAll();
    public void delete(Long id_usuario);

}
