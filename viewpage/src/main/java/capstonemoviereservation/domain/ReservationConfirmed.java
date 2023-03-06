package capstonemoviereservation.domain;

import capstonemoviereservation.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class ReservationConfirmed extends AbstractEvent {

    private Long rsvId;
    private Long movieId;
    private String status;
    private Long payId;
    private Long customerId;
}
