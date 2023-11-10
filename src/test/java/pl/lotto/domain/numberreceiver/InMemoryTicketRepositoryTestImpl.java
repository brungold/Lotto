package pl.lotto.domain.numberreceiver;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryTicketRepositoryTestImpl implements TicketRepository {

    Map<String, Ticket> tickets = new ConcurrentHashMap<>();
    @Override
    public Ticket save(Ticket savedTicket) {
        tickets.put(savedTicket.hash(), savedTicket);
        return savedTicket;
    }

    @Override
    public Ticket findByHash(String hash) {
        return tickets.get(hash);
    }

    @Override
    public List<Ticket> findAllTicketsByDrawDate(LocalDateTime data) {
        return tickets.values()
                .stream()
                .filter(ticket -> ticket.drawDate().equals(data))
                .toList();
    }
}
