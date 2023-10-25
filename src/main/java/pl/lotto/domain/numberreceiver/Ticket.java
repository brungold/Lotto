package pl.lotto.domain.numberreceiver;

import java.util.Set;

// encaj do bazy
record Ticket(String hash, java.time.LocalDateTime drawDate, Set<Integer> numbersFromUser) {
}
