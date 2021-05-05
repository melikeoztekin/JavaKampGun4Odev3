package homework3Day4;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfGamer(Gamer gamer) {
		if (gamer.getNationalIdentity().length() == 11) {
			System.out.println("Dogrulama baþýrýlý. "+ gamer.getGamerName()+" oyuncu bilgileri eklendi.");
			return true;
		} else {
			System.out.println("Doðrulama iþlemi baþarýsýz. Bilgilerinizi kontrol ediniz.");
			return false;
		}
	}
}
