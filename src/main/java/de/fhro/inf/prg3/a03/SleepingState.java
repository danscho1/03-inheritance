package de.fhro.inf.prg3.a03;

/**
 * Created by Daniel Herzinger on 10/18/17.
 */
public class SleepingState extends State{
     public SleepingState(Animal animal, int duration) {
           super(animal, duration);
       }

       @Override
       State successor() {
           logger.info("Yoan... getting hungry!");
           return new HungryState(animal, animal.getAwake());
       }
}
