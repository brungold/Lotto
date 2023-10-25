package pl.lotto.domain.numberreceiver;

import pl.lotto.domain.numberreceiver.dto.TicketDto;

public class TicketMapper {
    public static TicketDto mapFromTicket(Ticket ticket) {
        return TicketDto.builder()
                .numbersFromUser(ticket.numbersFromUser())
                .ticketId(ticket.hash())
                .drawDate(ticket.drawDate())
                .build();
    }
}
