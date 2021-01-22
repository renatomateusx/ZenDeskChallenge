package com.renatomateusx.arch.ticket;

import com.renatomateusx.arch.ticket.ports.TicketAdapter;
import com.renatomateusx.arch.ticket.ticket.ITicket;
import com.renatomateusx.arch.ticket.ticket.dto.TicketIn;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketUseCase implements ITicket {

    public TicketUseCase(){}

    @Autowired
    private ITicketOut ticketOut;

    @Autowired
    private TicketAdapter ticketAdapter;

    @Override
    public TicketIn openTicket(TicketIn ticket) {
        return ticketAdapter.toInput(ticketOut.openTicket(ticketAdapter.toOutput(ticket)));
    }

    @Override
    public List<TicketIn> listTickets() {
        return ticketAdapter.toInputList(ticketOut.listTickets());
    }
}
