 

public class Level1Factory extends Creator {

	public ISnack getExtraSnack() {
		return new PowerUp();
	}
}



