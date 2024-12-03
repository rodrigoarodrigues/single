package com.m4ricu.single.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m4ricu.single.model.Artist;
import com.m4ricu.single.service.ArtistService;

@RestController
public class SingleAPI {
    @Autowired
    private ArtistService artistService;

    @GetMapping("/api/randomartist")
    public ResponseEntity<Artist> getArtist() {
        Artist artist = artistService.getRandomArtist();
        if (artist != null) {
            return ResponseEntity.ok(artist); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

}
