package com.m4ricu.single.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m4ricu.single.model.Lyrics;
import com.m4ricu.single.repository.LyricsRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class LyricsService {
    @Autowired
    private LyricsRepository lyricsRepository;

    public <Optional> Lyrics getLyricsById(Long artistId) {
        return lyricsRepository.findRandomLyricByArtistId(artistId)
                .orElseThrow(() -> new EntityNotFoundException("Lyric não encontrado com o ID: "));
    }
}
