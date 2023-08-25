package br.edu.ifpb.dac.LauroDac.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.dac.LauroDac.model.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
