package homework3Day4;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService=gamerCheckService;
	}
	
	@Override
	public void gamerAdd(Gamer gamer) {
		if(gamerCheckService.checkIfGamer(gamer)) {
			return;
		}
	}

	@Override
	public void gamerDelete(String gamerName) {
		System.out.println(gamerName+" oyuncu bilgileri sistemden silindi.");
	}

	@Override
	public void gamerUpdate(Gamer gamer) {
		System.out.println(gamer.getGamerName()+" oyuncu bilgileri baþarýyla güncellendi.");
	}

}