package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game Game) {
		System.out.println(Game.getName() + " oyunu eklendi.");
		
	}

	@Override
	public void delete(Game Game) {
		System.out.println(Game.getName() + " oyunu silindi.");
		
	}

	@Override
	public void update(Game Game) {
		System.out.println(Game.getName() + " oyunu güncellendi.");
		
	}

}
