
public class PuntoVO {
	Integer x;
	Integer y;
	
	public PuntoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PuntoVO(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "PuntoVO [x=" + x + ", y=" + y + "]";
	}
	
}
