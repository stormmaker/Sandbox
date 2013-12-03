import java.util.ArrayList;

public class Invalid {
	public static void main(String args[]) {
		ArrayList<Ink> inks = new ArrayList<Ink>();
		inks.add(new ColorInk());
		Ink ink = (BlackInk) inks.get(0);
	}
}

class Ink {
	public static void main(String args[]) {
		ArrayList<Ink> inks = new ArrayList<Ink>();
		inks.add(new ColorInk());
		Ink ink = (BlackInk) inks.get(0);
	}
}

class ColorInk extends Ink {
}

class BlackInk extends Ink {
}