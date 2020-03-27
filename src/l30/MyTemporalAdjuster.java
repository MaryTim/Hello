package l30;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class MyTemporalAdjuster implements TemporalAdjuster {

    @Override
    public Temporal adjustInto (Temporal temporal) {
        return temporal.plus(42 , ChronoUnit.DAYS);
    }
}
