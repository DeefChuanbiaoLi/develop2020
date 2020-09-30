/**
 * 
 */
package teamwork;

/**
 * @author ASUS-PC
 *
 */
public class Trapezoid extends ABS_Pattern {

	/* (non-Javadoc)ASUS-PC上午11:58:25
	 * @see Main.ABS_Trapezoid#Area(int, int, int, int, int)
	 */
	@Override
	public double Area(double length, double width, double height, double TopBottom, double Bottom) {
		// TODO Auto-generated method stub
	System.out.println("55555");
		return (TopBottom+Bottom)*height/2.0;
	}

}
