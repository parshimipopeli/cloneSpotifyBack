package fr.parshimipopeli.spotifyclone.catalogcontext.repository;

import fr.parshimipopeli.spotifyclone.catalogcontext.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Songrepository extends JpaRepository<Song, Long> {
}
