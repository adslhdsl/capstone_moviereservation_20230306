package capstonemoviereservation.domain;

import capstonemoviereservation.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class PaymentCancelled extends AbstractEvent {

    private Long payId;
    private Long rsvId;
    private Long movieId;
    private String status;
}
