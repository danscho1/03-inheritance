package de.fhro.inf.prg3.a03;

/**
 * Created by Daniel Herzinger on 10/18/17.
 */
public class DigestingState extends State {
    public DigestingState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    State successor() {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(animal, animal.getAwake());
    }
}
