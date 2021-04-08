ESTO ES UN CAMBIOS MANUAL

public class PuntoVO {
	Integer x;
	Integer y;
	Integer c;
	
	public PuntoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PuntoVO [x=" + x + ", y=" + y + ", c=" + c + "]";
	}

	public PuntoVO(Integer x, Integer y, Integer c) {
		super();
		this.x = x;
		this.y = y;
		this.c = c;
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

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}
	

	
}
