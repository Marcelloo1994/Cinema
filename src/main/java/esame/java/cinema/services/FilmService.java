package esame.java.cinema.services;

import esame.java.cinema.dtos.FilmDto;
import esame.java.cinema.dtos.ResponseDto;
import esame.java.cinema.models.Film;

import java.util.List;

public interface FilmService {

    ResponseDto<FilmDto> insert(Film film);
    ResponseDto<FilmDto> update(Film film);
    ResponseDto<FilmDto> delete(int idFilm);
    ResponseDto<List<FilmDto>> getAll();
    ResponseDto<FilmDto> getById(int idFilm);

}
