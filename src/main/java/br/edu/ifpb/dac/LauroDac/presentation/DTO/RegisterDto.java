package br.edu.ifpb.dac.LauroDac.presentation.DTO;

import br.edu.ifpb.dac.LauroDac.model.enums.UserRole;

public record RegisterDto(String email,String password,UserRole role ) {
    
}
