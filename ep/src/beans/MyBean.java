package beans;

public class MyBean {

	private int i;
	
	public String getText(){
		return "Text " + i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
