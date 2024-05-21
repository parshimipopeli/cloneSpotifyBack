package fr.parshimipopeli.spotifyclone.catalogcontext.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "song_content")
public class SongContent implements Serializable {

    @Id
    @Column(name = "song_id")
    private Long songId;

    /* On dit a hibernate d'utiliser le même id pour ces deux tables */
    @MapsId
    @OneToOne
    @JoinColumn(name = "song_id", referencedColumnName = "id")
    private Song song;

    @Lob
    @Column(name = "file", nullable = false)
    private byte[] file;

    @Column(name = "file_content_type")
    private String fileContentType;

    public SongContent() {}

    public SongContent(Long songId, Song song, byte[] file, String fileContentType) {
        this.songId = songId;
        this.song = song;
        this.file = file;
        this.fileContentType = fileContentType;
    }

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
}
