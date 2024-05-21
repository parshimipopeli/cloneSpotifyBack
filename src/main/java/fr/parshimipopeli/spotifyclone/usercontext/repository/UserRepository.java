package fr.parshimipopeli.spotifyclone.usercontext.repository;

import fr.parshimipopeli.spotifyclone.usercontext.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
