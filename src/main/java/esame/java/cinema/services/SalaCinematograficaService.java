package esame.java.cinema.services;

import esame.java.cinema.dtos.ResponseDto;
import esame.java.cinema.dtos.SalaCinematograficaDto;
import esame.java.cinema.models.SalaCinematografica;

import java.util.List;

public interface SalaCinematograficaService {

    ResponseDto<SalaCinematograficaDto> insert(SalaCinematografica salaCinematografica);
    ResponseDto<SalaCinematograficaDto> update(SalaCinematografica salaCinematografica);
    ResponseDto<SalaCinematograficaDto> delete(int idSalaCinematografica);
    ResponseDto<List<SalaCinematograficaDto>> getAll();
    ResponseDto<SalaCinematograficaDto> getById(int idSalaCinematografica);
    ResponseDto<SalaCinematograficaDto> svuotaSala(int idSalaCinematografica);



}
