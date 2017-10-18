package de.fhro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Daniel Herzinger on 10/18/17.
 */
public abstract class State {
    protected static final Logger logger = LogManager.getLogger();
    protected static Animal animal;

    private int t = 0;
    private int duration;

    protected State(Animal animal, int duration) {
        State.animal = animal;
        this.duration = duration;
    }

    final State tick(){
        logger.info("tick()");
        t++;

        return (t >= duration ? successor() : this);
    }

    abstract State successor();
}
