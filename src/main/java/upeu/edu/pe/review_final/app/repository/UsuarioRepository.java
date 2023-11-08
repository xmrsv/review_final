package upeu.edu.pe.review_final.app.repository;

import upeu.edu.pe.review_final.infrastructure.entity.UsuarioEntity;

public interface UsuarioRepository {
    // Ver usuarios
    Iterable<UsuarioEntity> getUsuarios();

    // Ver usuario por id
    UsuarioEntity getUsuariosById(Integer id);

    // Guardar usuario
    UsuarioEntity saveUsuario(UsuarioEntity usuarioEntity);

    // Borrar usuario
    void deleteUsuarioById(Integer id);
}
