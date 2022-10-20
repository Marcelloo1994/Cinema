package esame.java.cinema.services;

import esame.java.cinema.dtos.CinemaDto;
import esame.java.cinema.dtos.ResponseDto;
import esame.java.cinema.models.Cinema;

import java.util.List;

public interface CinemaService {

    ResponseDto<CinemaDto> insert(Cinema cinema);
    ResponseDto<CinemaDto> update(Cinema cinema);
    ResponseDto<CinemaDto> delete(int idCinema);
    ResponseDto<List<CinemaDto>> getAll();
    ResponseDto<CinemaDto> getById(int idCinema);
    
}
