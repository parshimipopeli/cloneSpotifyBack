package fr.parshimipopeli.spotifyclone.catalogcontext.application.dto;

import fr.parshimipopeli.spotifyclone.catalogcontext.application.valueObject.SongAuthorVO;
import fr.parshimipopeli.spotifyclone.catalogcontext.application.valueObject.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO(@Valid SongTitleVO songTitleVO,
                          @Valid SongAuthorVO songAuthorVO,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {
}
