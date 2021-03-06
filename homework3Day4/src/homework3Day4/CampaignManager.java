package homework3Day4;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("%" + campaign.getDiscountRate() +" oranında "+campaign.getCampaignName() +" kampanyası başarıyla eklendi.");
		System.out.println("Kampanya kodu oluşturuldu --> " + campaign.getCampaignCode());
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
