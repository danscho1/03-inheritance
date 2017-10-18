package de.fhro.inf.prg3.a03;


import java.util.Arrays;

/**
 * @author Peter Kurfer
 * Created on 10/7/17.
 */
public class Animal {

	private State currentstate = new SleepingState(this, getSleep());

	// state durations (set via constructor), ie. the number of ticks in each state
	private final int sleep;
	private final int awake;
	private final int digest;

	private final String name;

	// money you make, when people watch your animal
	private final int collectionAmount;
	private final GenusSpecies genusSpecies;

	// those species this animal likes to eat
	private final GenusSpecies[] devours;

	public Animal(GenusSpecies genusSpecies, String name, GenusSpecies[] devours, int sleep, int awake, int digest, int collectionAmount) {
		this.name = name;
		this.genusSpecies = genusSpecies;
		this.devours = devours;
		this.sleep = sleep;
		this.awake = awake;
		this.digest = digest;
		this.collectionAmount = collectionAmount;

		Arrays.sort(this.devours);
	}

	public void tick(){
		currentstate = currentstate.tick();
	}

	public void feed(){
        currentstate = currentstate.feed();
	}

	public boolean devours(Animal other){
		return Arrays.binarySearch(this.devours, other.genusSpecies) >= 0;
	}

	public int collect() {
		if(!isPlayful()){
			throw new IllegalStateException("One does not simply collect if the animal is not playful!");
		}
		return collectionAmount;
	}

	public boolean isAsleep() {
		return currentstate instanceof SleepingState;
	}

	public boolean isPlayful() {
		return currentstate instanceof PlayfulState;
	}

	public boolean isHungry() {
		return currentstate instanceof HungryState;
	}

	public boolean isDigesting() {
		return currentstate instanceof DigestingState;
	}

	public boolean isDead() { return currentstate instanceof DeathState; }

	public int getSleep() {
		return sleep;
	}

	public int getAwake() {
		return awake;
	}

	public int getDigest() {
		return digest;
	}
    public String getName() {
        return name;
    }
}
