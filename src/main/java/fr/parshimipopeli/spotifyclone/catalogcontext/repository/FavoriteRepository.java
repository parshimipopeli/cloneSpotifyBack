package fr.parshimipopeli.spotifyclone.catalogcontext.repository;

import fr.parshimipopeli.spotifyclone.catalogcontext.entity.Favorite;
import fr.parshimipopeli.spotifyclone.catalogcontext.entity.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}
