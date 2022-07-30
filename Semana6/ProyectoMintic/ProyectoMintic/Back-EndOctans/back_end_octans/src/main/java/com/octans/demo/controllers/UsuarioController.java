package com.octans.demo.controllers;

import com.octans.demo.models.Rol;
import com.octans.demo.models.Usuario;
import com.octans.demo.services.RolService;
import com.octans.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolService rolService;

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/rol")
    public ResponseEntity<List<Rol>> listarRol() {
        return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);



    }
    @PostMapping("/crear")
    public  ResponseEntity<Usuario>crearUsuario(@RequestBody Usuario usuario){
    return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
    }
    @PutMapping("/actualizar/{id_usuario}")
    public  ResponseEntity<Usuario>actualizarUsuario(@PathVariable Long id_usuario,@RequestBody Usuario usuario){
        Usuario usuarioEncontrado = usuarioService.findById(id_usuario);

        if(usuarioEncontrado == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            usuarioEncontrado.setNombre(usuario.getNombre());
            usuarioEncontrado.setEstado(usuario.getEstado());
            usuarioEncontrado.setRol(usuario.getRol());

            return  new ResponseEntity<>(usuarioService.save(usuarioEncontrado), HttpStatus.CREATED);

        }catch (DataAccessException e) {
         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/eliminar/{id_usuario}")
    public ResponseEntity<?> actualizarUsuario(@PathVariable Long id_usuario){
    usuarioService.delete(id_usuario);
    return new ResponseEntity<>(HttpStatus.OK);

    }
    @GetMapping("/{id_usuario}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable Long id_usuario){
        return new ResponseEntity<Usuario>(usuarioService.findById(id_usuario), HttpStatus.OK);
    }
}

