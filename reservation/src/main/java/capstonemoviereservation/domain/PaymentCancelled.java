package capstonemoviereservation.domain;

import capstonemoviereservation.domain.*;
import capstonemoviereservation.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PaymentCancelled extends AbstractEvent {

    private Long payId;
    private Long rsvId;
    private Long movieId;
    private String status;
}


