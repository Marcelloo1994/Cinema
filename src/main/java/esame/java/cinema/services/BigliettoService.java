package esame.java.cinema.services;

import esame.java.cinema.dtos.BigliettoDto;
import esame.java.cinema.dtos.ResponseDto;
import esame.java.cinema.models.Biglietto;

import java.util.List;

public interface BigliettoService {

    ResponseDto<BigliettoDto> insert(Biglietto biglietto);
    ResponseDto<BigliettoDto> update(Biglietto biglietto);
    ResponseDto<BigliettoDto> delete(int idBiglietto);
    ResponseDto<List<BigliettoDto>> getAll();
    ResponseDto<BigliettoDto> getById(int idBiglietto);

    ResponseDto<BigliettoDto> scontoBiglietto(int idBiglietto);
}
