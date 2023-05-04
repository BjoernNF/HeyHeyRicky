package de.neuefische.heyheyricky.model;

import lombok.*;

import java.util.List;

@Data
public class RickyMortyContainer {
    private RickyMortyInfo info;

    private List<RickyMortyResults> results;
}
