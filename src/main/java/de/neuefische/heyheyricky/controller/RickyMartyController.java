package de.neuefische.heyheyricky.controller;

import de.neuefische.heyheyricky.model.RickyMortyResults;
import de.neuefische.heyheyricky.service.RickyMartyService;
import lombok.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@RestController
@RequestMapping("/")
public class RickyMartyController {
    private RickyMartyService service;

    public RickyMartyController(RickyMartyService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<RickyMortyResults> getAllCharacters() {
        return service.getListofAllCharacters();
    }

    @GetMapping("/alive")
    public List<RickyMortyResults> getAllAliveCharacters() {
        return service.getListOfAllAliveCharacters();
    }

}
