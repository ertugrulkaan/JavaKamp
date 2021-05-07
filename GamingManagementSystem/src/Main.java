import java.sql.Date;

import Abstract.CampaignService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		GameManager gameManager = new GameManager();
		CampaignManager campingManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("AOE 2");
		game1.setPrice(50);
		Game game2 = new Game();
		game2.setId(2);
		game2.setName("CIV 5");
		game2.setPrice(100);
		
		User user = new User(1, "Ertugrul", "Ozdemir", "12345678912", new Date(1997,10,7));
		Campaign campaign = new Campaign(1, "Tam kapanma kampanyasi" , 10);
		
		userManager.add(user);
		
		gameManager.add(game1);
		gameManager.add(game2);
		
		gameManager.delete(game2);
		
		campingManager.add(campaign);
		
		saleManager.sell(game1, user, campaign);

	}

}
