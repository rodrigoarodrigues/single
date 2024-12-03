
package com.m4ricu.single.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m4ricu.single.model.Lyrics;

public interface LyricsRepository extends JpaRepository<Lyrics, Long> {
}
