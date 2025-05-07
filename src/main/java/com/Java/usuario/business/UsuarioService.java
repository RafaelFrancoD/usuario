package com.Java.usuario.business;

import com.Java.usuario.business.converter.UsuarioConverter;
import com.Java.usuario.business.dto.UsuarioDTO;
import com.Java.usuario.entity.Usuario;
import com.Java.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
   private final UsuarioRepository usuarioRepository;
   private final UsuarioConverter usuarioConverter;

   public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
      Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
      return usuarioConverter.paraUsuarioDTO(
              usuarioRepository.save(usuario)
      );
   }
}
