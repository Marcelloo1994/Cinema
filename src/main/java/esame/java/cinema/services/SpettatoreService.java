package esame.java.cinema.services;

import esame.java.cinema.dtos.ResponseDto;
import esame.java.cinema.dtos.SpettatoreDto;
import esame.java.cinema.models.Spettatore;

import java.time.LocalDate;
import java.util.List;

public interface SpettatoreService {

    ResponseDto<SpettatoreDto> insert(Spettatore spettatore);
    ResponseDto<SpettatoreDto> update(Spettatore spettatore);
    ResponseDto<SpettatoreDto> delete(int idSpettatore);
    ResponseDto<List<SpettatoreDto>> getAll();
    ResponseDto<List<SpettatoreDto>> getById(int idSpettatore);

    Boolean maggiorenne(LocalDate dataNascita);


}
