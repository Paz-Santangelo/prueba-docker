package com.pruebaDeLuigi.security.repository;

import com.pruebaDeLuigi.security.entity.Rol;
import com.pruebaDeLuigi.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
