package esame.java.cinema.services.impls;

import esame.java.cinema.dtos.BigliettoDto;
import esame.java.cinema.dtos.ResponseDto;
import esame.java.cinema.models.Biglietto;
import esame.java.cinema.repositories.BigliettoJpaRepository;
import esame.java.cinema.services.BigliettoService;

import java.util.List;

public class BigliettoServiceImpl implements BigliettoService {

    private BigliettoJpaRepository bigliettoJpaRepository;


    @Override
    public ResponseDto<BigliettoDto> insert(Biglietto biglietto) {
        ResponseDto<BigliettoDto> response = new ResponseDto<>();

        
        return null;
    }

    @Override
    public ResponseDto<BigliettoDto> update(Biglietto biglietto) {
        return null;
    }

    @Override
    public ResponseDto<BigliettoDto> delete(int idBiglietto) {
        return null;
    }

    @Override
    public ResponseDto<List<BigliettoDto>> getAll() {
        return null;
    }

    @Override
    public ResponseDto<BigliettoDto> getById(int idBiglietto) {
        return null;
    }

    @Override
    public ResponseDto<BigliettoDto> scontoBiglietto(int idBiglietto) {
        return null;
    }
}
