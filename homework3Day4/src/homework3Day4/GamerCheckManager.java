package homework3Day4;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfGamer(Gamer gamer) {
		if (gamer.getNationalIdentity().length() == 11) {
			System.out.println("Dogrulama ba��r�l�. "+ gamer.getGamerName()+" oyuncu bilgileri eklendi.");
			return true;
		} else {
			System.out.println("Do�rulama i�lemi ba�ar�s�z. Bilgilerinizi kontrol ediniz.");
			return false;
		}
	}
}
