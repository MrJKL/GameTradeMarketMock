package com.example.gametrademarketmock.controller;

import com.example.gametrademarketmock.dto.GameDto;
import com.example.gametrademarketmock.enums.Platform;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/games")
public class GamesController {

    //Get
    @GetMapping("/{city}")
    public Collection<GameDto> getLocallyOfferedGames(@PathVariable String city) {
        return List.of(new GameDto(UUID.randomUUID().toString(), "Call of Duty", Platform.XBOX360, Year.of(2011)),
                new GameDto(UUID.randomUUID().toString(), "Mario", Platform.NintendoSwitch, Year.of(2020)),
                new GameDto(UUID.randomUUID().toString(), "Ratchet and Clank", Platform.Playstation3, Year.of(2014)));
    }
}
