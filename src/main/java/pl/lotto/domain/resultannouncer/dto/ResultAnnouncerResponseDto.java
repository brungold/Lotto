package pl.lotto.domain.resultannouncer.dto;

import pl.lotto.domain.resultannouncer.dto.ResponseDto;

public record ResultAnnouncerResponseDto(
        ResponseDto responseDto,
        String message
) {
}
