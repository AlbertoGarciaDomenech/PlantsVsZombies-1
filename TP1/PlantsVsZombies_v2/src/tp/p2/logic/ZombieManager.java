package tp.p2.logic;

import 	java.util.Random;

public class ZombieManager {
	
	private double freq;
	private int numZombies;
	private long seed;
	private Random rand;
	
	ZombieManager(Level level, long new_seed){
		freq = level.getFreq();
		numZombies = level.getNumZombies();
		seed = new_seed;
		rand = new Random();
		rand.setSeed(seed);
	}
	
	public int getNumZom() {
		return numZombies;
	}
	
	public boolean isZombieAdded() {
		boolean added = false;
		
		if(rand.nextDouble() <= freq && numZombies > 0) {
			numZombies--;
			added = true;
		}
		
		return added;
	}
}
