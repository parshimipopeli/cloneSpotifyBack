package fr.parshimipopeli.spotifyclone.catalogcontext.application.valueObject;

import jakarta.validation.constraints.NotBlank;

public record SongTitleVO(@NotBlank String value) {
}
