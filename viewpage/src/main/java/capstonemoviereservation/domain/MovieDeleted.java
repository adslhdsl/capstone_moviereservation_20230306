package capstonemoviereservation.domain;

import capstonemoviereservation.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class MovieDeleted extends AbstractEvent {

    private Long movieId;
    private String status;
    private String desc;
    private Long reviewCnt;
    private String lastAction;
    private Integer numberOfSeats;
}
