package de.fhro.inf.prg3.a03;

/**
 * Created by Daniel Herzinger on 10/18/17.
 */
public class DeathState extends State{
    public DeathState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    State successor() {
        return this;
    }
}
