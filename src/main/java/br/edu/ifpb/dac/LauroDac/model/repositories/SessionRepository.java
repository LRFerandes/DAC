package br.edu.ifpb.dac.LauroDac.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.dac.LauroDac.model.entity.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Integer>{

}
