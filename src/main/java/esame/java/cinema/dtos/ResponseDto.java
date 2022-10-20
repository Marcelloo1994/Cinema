package esame.java.cinema.dtos;

import esame.java.cinema.utils.HttpRequestType;
import esame.java.cinema.utils.HttpResponseType;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResponseDto<Model> {

    private HttpRequestType httpRequest;
    private HttpResponseType httpResponse;
    private String code;
    private String desc;
    private Model body;
}
