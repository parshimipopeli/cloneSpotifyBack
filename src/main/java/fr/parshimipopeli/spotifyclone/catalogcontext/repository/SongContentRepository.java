package fr.parshimipopeli.spotifyclone.catalogcontext.repository;

import fr.parshimipopeli.spotifyclone.catalogcontext.entity.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {
}
