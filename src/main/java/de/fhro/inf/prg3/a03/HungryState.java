package de.fhro.inf.prg3.a03;

/**
 * Created by Daniel Herzinger on 10/18/17.
 */
public class HungryState extends State {
    public HungryState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State feed(){
        State.logger.info("You feed the cat...");
        return new DigestingState(animal, animal.getDigest(), t);
    }


    @Override
    State successor(){
		logger.info("I've starved for a too long time...good bye...");
        return new DeathState(animal, Integer.MAX_VALUE);
    }

}
