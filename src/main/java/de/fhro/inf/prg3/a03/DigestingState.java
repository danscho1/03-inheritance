package de.fhro.inf.prg3.a03;

/**
 * Created by Daniel Herzinger on 10/18/17.
 */
public class DigestingState extends State {
    int awakeTime;
    public DigestingState(Animal animal, int duration, int awakeTime) {
        super(animal, duration);
        this.awakeTime = awakeTime;
    }

    @Override
    State successor() {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(animal, animal.getAwake() - (t + awakeTime));
    }
}
