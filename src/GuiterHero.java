
public class GuiterHero {
	static GuitarString[] notes = new GuitarString[];
	static String keyboardString = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.'/' ";
	static GuitarString[] gS;
	public static void main(String[] args) {
		for (int i = 0; i<notes.length; i++) {
			notes[i] = new GuitarString(440*2*(i-24)/12);
		}
	}
}
