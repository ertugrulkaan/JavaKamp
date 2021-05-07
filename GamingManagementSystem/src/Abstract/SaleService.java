package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SaleService {
	void sell(Game game, User user, Campaign campaign);
}
