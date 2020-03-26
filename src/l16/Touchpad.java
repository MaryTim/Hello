package l16;

import java.io.Serializable;

public class Touchpad implements Serializable {

    protected boolean hasTouchpad;

    public Touchpad (boolean t) {
        this.hasTouchpad = t;
    }
}
