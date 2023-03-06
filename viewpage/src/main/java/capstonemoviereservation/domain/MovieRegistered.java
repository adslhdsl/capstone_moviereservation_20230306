package capstonemoviereservation.domain;

import capstonemoviereservation.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class MovieRegistered extends AbstractEvent {

    private Long movieId;
    private String status;
    private String desc;
    private Long reviewCnt;
    private String lastAction;
    private Integer numberOfSeats;
}
