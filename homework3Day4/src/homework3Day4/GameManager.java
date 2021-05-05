package homework3Day4;

public class GameManager implements GameService{

	@Override
	public void gameAdd(Game game) {
		System.out.println(game.getSoftwareCompany()+ " tarafýndan sunulan " + game.getGameName() +" oyunu -"+ 
	game.getGameCode() +"- kodu ile "+ game.getGamePrice() +"TL fiyatýndan satýþa sunuldu.");
	}

	@Override
	public void gameDelete(String gameName) {
		System.out.println(gameName +" oyunu sistemden silindi.");
	}

	@Override
	public void gameUpdate(Game game) {
		System.out.println(game.getGameName() +" oyunu üzerinde sitem güncellemsleri yapýldý.");
	}

}