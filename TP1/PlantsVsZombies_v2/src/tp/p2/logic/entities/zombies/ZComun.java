package tp.p2.logic.entities.zombies;

import tp.p2.logic.Game;

public class ZComun extends Zombie{
	
	public ZComun() {
		initialise();
	}
	
	public ZComun(int coor_x, int coor_y, Game currentGame) {
		super(coor_x, coor_y, currentGame);
		initialise();
	}
	
	private void initialise() {
		maxHealth = 5;
		health = maxHealth;
		cycle = 0;
		freq = 2;
		damage = 1;
		symbol = "Z";
		name = "zcomun";
		infoName = "[Z]ombie comun";
	}
	
	public Zombie parse(String name, int x, int y, Game game) {
		if(name.equals(this.name)) {
			return new ZComun(x, y, game);
		}
		else {
			return null;
		}
	}
	
}
