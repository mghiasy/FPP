package FPPProject;

//ENCLOSING CLASS
public class Top {

	int t = 1;
	// outerObject
	Middle mid = new Middle();
	// WE CAN ACCESS IT THOUGH REFRENCE TYPE
	// OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	Middle.Bottom midbot = mid.new Bottom();

	int readbottom() {
		return midbot.b;
	}

//COMPOSITION
	static class stMid {
		int sm = 3;

		int addStm() {
			// return t + bot.b; OR
			return sm;
		}
	}

	class Middle {

		int m = 2;

		int addTopAndBottom() {
			return t + midbot.b;
		}

		class Bottom {
			int b = 3;

			int multiplyAllthree() {
				return t * m * b;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();
		// FOR STATIC INNER CLASSES
		System.out.println(new Top.stMid().addStm());
		// IF STMID WAS NOT STATIC
		// System.out.println(new Top().new stMid().addStm());
		System.out.println(top.readbottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllthree());
	}

}
