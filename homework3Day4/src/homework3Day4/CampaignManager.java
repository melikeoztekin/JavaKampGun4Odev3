package homework3Day4;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("%" + campaign.getDiscountRate() +" oranýnda "+campaign.getCampaignName() +" kampanyasý baþarýyla eklendi.");
		System.out.println("Kampanya kodu oluþturuldu --> " + campaign.getCampaignCode());
	}

	@Override
	public void campaignDelete(String campaignCode) {
		System.out.println(campaignCode +" kodlu kampanya sistemden silindi.");
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" kampanya bilgileri güncellendi.");
	}

}
