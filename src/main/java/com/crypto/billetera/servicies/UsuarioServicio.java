package com.crypto.billetera.servicies;

import com.crypto.billetera.entities.Usuario;
import com.crypto.billetera.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServicio {

    @Autowired
    public UsuarioRepositorio usuarioRepositorio;

    @Transactional(readOnly = true)
    private List<Usuario> findAll(){
        return usuarioRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    private  Usuario findById(Long id){
        return usuarioRepositorio.findById(id).get();
    }

    @Transactional
    private void deleteById(Long id){
        usuarioRepositorio.deleteById(id);
    }

    @Transactional
    private void createUsuario(Usuario usuario){
        Usuario nuevo = new Usuario();
        nuevo.setApellido(usuario.getApellido());
        nuevo.setNombre(usuario.getNombre());
        nuevo.setEmail(usuario.getEmail());
        nuevo.setSexo(usuario.getSexo());
        nuevo.setDNI(usuario.getDNI());
        nuevo.setTelefono(usuario.getTelefono());
        nuevo.setBilletera(usuario.getBilletera());
        usuarioRepositorio.save(nuevo);
    }
    @Transactional
    private void updateUsuario(Usuario usuario){
        Usuario nuevo = new Usuario();
        nuevo.setApellido(usuario.getApellido());
        nuevo.setNombre(usuario.getNombre());
        nuevo.setEmail(usuario.getEmail());
        nuevo.setSexo(usuario.getSexo());
        nuevo.setDNI(usuario.getDNI());
        nuevo.setTelefono(usuario.getTelefono());
        nuevo.setBilletera(usuario.getBilletera());
        usuarioRepositorio.save(nuevo);
    }

}
