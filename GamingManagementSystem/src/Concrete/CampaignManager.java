package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası eklendi.");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası silindi.");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası güncellendi.");
	}
}
