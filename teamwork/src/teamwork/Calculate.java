/**
 * 
 */
package teamwork;
import teamwork.ABS_Pattern;
/**
 * @author ASUS-PC
 *
 */
public class Calculate extends ABS_Calculate {

	/* (non-Javadoc)ASUS-PC下午12:00:57
	 * @see Main.ABS_Calculate#getResult(int, int, int, int, int, java.lang.String)
	 */
	ABS_Pattern pattern;
	public ABS_Pattern getTrapezoid() {
		return pattern;
	}
	public void setTrapezoid(ABS_Pattern trapezoid) {
		this.pattern = trapezoid;
	}
	@Override
	public double getResult(int length, int width, int height, int TopBottom, int Bottom, String op) {
		// TODO Auto-generated method stub
		if(op.equals("Trapezoid"))
			return pattern.Area(length, width, height, TopBottom, Bottom);
		return Integer.MIN_VALUE;
	}
	

}
