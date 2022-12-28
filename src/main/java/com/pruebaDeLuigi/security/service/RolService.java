package com.pruebaDeLuigi.security.service;

import com.pruebaDeLuigi.security.entity.Rol;
import com.pruebaDeLuigi.security.enums.RolNombre;
import com.pruebaDeLuigi.security.repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol) {
        rolRepository.save(rol);
    }
    
}
