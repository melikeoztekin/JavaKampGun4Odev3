package homework3Day4;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("****Oyuncu Ýþlemleri***");
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		Gamer gamer1 = new Gamer(1,"Melike","Öztekin","ateseden",1996,"11111111111");
		gamerManager.gamerAdd(gamer1);
		gamerManager.gamerDelete("savasacan");
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("****Kampanya Ýþlemleri***");
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign(1,"hosgeldin","Ben Geldim Hoþgeldim",50);
		campaignManager.campaignAdd(campaign1);
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("****Oyun Ýþlemleri***");
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1,"powerbmin","PowerB","MINGAMES",400);
		gameManager.gameAdd(game1);
		gameManager.gameDelete("PowerXL");
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("****Oyun Satýn Alma Ýþlemleri***");
		SaleManager saleManager = new SaleManager();
		saleManager.gameBuying(game1, gamer1, campaign1);
		System.out.println("-------------------------------------------------------");
	}

}
