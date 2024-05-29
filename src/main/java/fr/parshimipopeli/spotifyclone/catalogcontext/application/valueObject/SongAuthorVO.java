package fr.parshimipopeli.spotifyclone.catalogcontext.application.valueObject;

import jakarta.validation.constraints.NotBlank;

public record SongAuthorVO(@NotBlank String value) {
}
