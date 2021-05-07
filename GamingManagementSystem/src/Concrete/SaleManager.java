package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sell(Game game, User user, Campaign campaign) {
		Sale sale = new Sale();
		sale.setDiscount(campaign.getDiscount());
		sale.setGameId(game.getId());
		sale.setPrice(game.getPrice());
		sale.setUserId(user.getId());
		// ustteki nesne db ye kayit edilir

		System.out.println("------------------");
		System.out.println("satis gerceklesti");
		System.out.println(sale.getGameId() + " numarali oyun " + sale.getUserId() + " kisisine" + sale.getDiscountedPrice() + " tl karsiliginda satildi");
		
	}

}
