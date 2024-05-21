package fr.parshimipopeli.spotifyclone.usercontext.mapper;

import fr.parshimipopeli.spotifyclone.usercontext.dto.ReadUserDTO;
import fr.parshimipopeli.spotifyclone.usercontext.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOtoUser(User entity);

}
