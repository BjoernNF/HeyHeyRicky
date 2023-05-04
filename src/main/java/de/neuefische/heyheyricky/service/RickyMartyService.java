package de.neuefische.heyheyricky.service;

import de.neuefische.heyheyricky.model.RickyMortyContainer;
import de.neuefische.heyheyricky.model.RickyMortyResults;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
public class RickyMartyService {

        private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/");

        public List<RickyMortyResults> getListofAllCharacters() {
            RickyMortyContainer response =
                    Objects.requireNonNull(webClient.get()
                            .uri("character")
                            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                            .retrieve()
                            .toEntity(RickyMortyContainer.class)
                            .block()
                            .getBody());
            return response.getResults();
        }

        public List<RickyMortyResults> getListOfAllAliveCharacters() {
            RickyMortyContainer response =
                    Objects.requireNonNull(webClient.get()
                            .uri("character?status=alive")
                            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                            .retrieve()
                            .toEntity(RickyMortyContainer.class)
                            .block()
                            .getBody());
            return response.getResults();
        }

}
