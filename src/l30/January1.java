package l30;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoUnit.DAYS;

public class January1 implements TemporalAdjuster {

    @Override
    public Temporal adjustInto (Temporal temporal) {

        Temporal next = temporal.with(TemporalAdjusters.firstDayOfNextYear());
        Temporal previous = temporal.with(TemporalAdjusters.firstDayOfYear());

        long daysNext = DAYS.between(temporal , next);
        long daysPrev = DAYS.between(previous , temporal);

        if ( daysNext >= daysPrev )
            return previous;
        else return next;
    }
}
