package br.edu.ifpb.dac.LauroDac.model.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.edu.ifpb.dac.LauroDac.model.entity.UserModel;




public interface UserRepository extends JpaRepository<UserModel, UUID>{
    UserDetails findByEmail(String email);
}