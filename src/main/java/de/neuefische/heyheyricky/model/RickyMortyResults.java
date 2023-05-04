package de.neuefische.heyheyricky.model;

import lombok.*;

import java.util.List;

@Data
public class RickyMortyResults {
    int id;
    String name;
    String status;
    String species;
    String type;
    String gender;
    RickyMortyOrigin origin;
    RickyMortyLocation location;
    String image;
    List<String> episode;
    String url;
    String created;
}
