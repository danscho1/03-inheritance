package de.fhro.inf.prg3.a03;

/**
 * Created by Daniel Herzinger on 10/18/17.
 */
public class PlayfulState extends State {
    public PlayfulState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    State successor() {
        logger.info("Yoan... getting tired!");
        return new SleepingState(animal, animal.getSleep());
    }
}
