package com.senai.projeto_escola.Application.Service;
import com.senai.projeto_escola.Domain.Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.projeto_escola.Domain.Repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuarioPorId (String id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(String id, Usuario usuarioAtualizado){
        if (!usuarioRepository.existsById(id))
            return null;
        usuarioAtualizado.setId(id);
        return usuarioRepository.save(usuarioAtualizado);
    }

    public void deletarUsuario(String id){
        usuarioRepository.deleteById(id);
    }
}
