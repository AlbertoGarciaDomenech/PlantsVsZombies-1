// Tecnologia de la Programacion, Practica_1 (PlantasVsZombies)
// Alumnos: Alberto García Doménech y Pablo Daurell Marina

package tp.p2.logic.entities.zombies;

import tp.p2.logic.Game;
import tp.p2.logic.entities.GameObject;

public abstract class Zombie extends GameObject {
		
	protected Zombie() {
			
	}
	
	protected Zombie(int coor_x, int coor_y, Game currentGame) {
		super(coor_x, coor_y, currentGame);
	}
	
	public abstract Zombie parse(String name, int x, int y, Game game);
	
	public String getInfo() {
		return (infoName + " Speed: " + freq + " Harm: " + damage + " Life: " + maxHealth + "\n");
	}
	
	protected void move() {
		this.cycle++;
		if(this.cycle % freq == 0) {
			if(game.isEmpty(x, y-1)) {
				y -= 1;
			}
		}
	}
	
	public void update() {
		if(!game.isEmpty(x, y-1)) {
			if(game.isPlant(x, y-1)) {
				game.zombieAttacks(x, y-1,damage);
			}
			// else { theres a zombie, dont move }
		}
		else {
			move();		
		}
	}
}
