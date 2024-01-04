package pl.lotto.domain.resultchecker;

import java.time.LocalDateTime;
import java.util.Set;

public record ResultDto(
        String hash,
        Set<Integer> numbers,
        Set<Integer> hitNumbers,
        LocalDateTime drawDate,
        boolean isWinner
) {
}
