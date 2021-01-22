package com.renatomateusx.arch.ticket;

import com.renatomateusx.arch.ticket.dto.TicketOut;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RefreshScope
public interface ITicketOut {
    TicketOut openTicket(TicketOut ticket);
    List<TicketOut> listTickets();
}
