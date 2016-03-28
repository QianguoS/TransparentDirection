package direction;

public class Direction implements Document {

	private Document document;
	
	public Direction(Document document) {
		super();
		this.document = document;
	}

	public void display() {
		// TODO Auto-generated method stub
		document.display();
	}

}
