package homework3Day4;

public class SaleManager implements SaleService{

	@Override
	public void gameBuying(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Tebrikler "+ gamer.getGamerName());
		System.out.println("-" +campaign.getCampaignCode()+"- kampanya kodu ile " + game.getGameName()+ " oyununu sat�n ald�n.");
		int discountedAmount= (game.getGamePrice()-((game.getGamePrice()*campaign.getDiscountRate())/100));
		System.out.println("�denen Tutar: " + discountedAmount+"TL");
	}

}