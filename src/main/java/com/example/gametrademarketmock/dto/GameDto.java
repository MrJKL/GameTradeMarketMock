package com.example.gametrademarketmock.dto;

import com.example.gametrademarketmock.enums.Platform;

import java.time.Year;
import java.util.Objects;

public class GameDto {

    private final String id;
    private final String title;
    private final Platform platform;
    private final Year releaseYear;

    public GameDto(String id, String title, Platform platform, Year releaseYear) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.releaseYear = releaseYear;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "GameDto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", platform=" + platform +
                ", releaseYear=" + releaseYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameDto gameDto = (GameDto) o;
        return Objects.equals(id, gameDto.id) && Objects.equals(title, gameDto.title) && platform == gameDto.platform && Objects.equals(releaseYear, gameDto.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, platform, releaseYear);
    }
}