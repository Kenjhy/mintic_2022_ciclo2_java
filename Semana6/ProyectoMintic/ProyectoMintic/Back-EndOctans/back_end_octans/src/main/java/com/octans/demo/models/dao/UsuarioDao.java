package com.octans.demo.models.dao;

import com.octans.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario,Long> {
}
