package com.m4ricu.single.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.m4ricu.single.model.Artist;
import com.m4ricu.single.model.Lyrics;
import com.m4ricu.single.service.ArtistService;
import com.m4ricu.single.service.LyricsService;

@RestController
public class SingleAPI {
    @Autowired
    private ArtistService artistService;
    @Autowired
    private LyricsService lyricsService;

    @GetMapping("/api/randomartist")
    public ResponseEntity<Artist> getArtist() {
        Artist artist = artistService.getRandomArtist();
        if (artist != null) {
            return ResponseEntity.ok(artist); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @GetMapping("/api/artists")
    public ResponseEntity<List<Artist>> getAllArtists() {
        List<Artist> artists = artistService.getAllArtist();
        if (artists != null) {
            return ResponseEntity.ok(artists); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @GetMapping("/api/artist/{id}")
    public ResponseEntity<Artist> getArtistById(@PathVariable Long id) {
        Artist artist = artistService.getArtistById(id);
        if (artist != null) {
            return ResponseEntity.ok(artist); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @GetMapping("/api/lyrics/{artistId}")
    public ResponseEntity<Lyrics> getLyricByid(@PathVariable Long artistId) {
        Lyrics lyric = lyricsService.getLyricsById(artistId);
        if (lyric != null) {
            return ResponseEntity.ok(lyric); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

}
