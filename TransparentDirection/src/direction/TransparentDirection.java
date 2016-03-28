package direction;

public class TransparentDirection {


	/**
	 * 代码主要实现了半透明的装饰模式
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document doc1;
		Approve doc2;
		doc1 = new PurcaseRequested();
		doc2 = new Approve(doc1);
		doc2.display();
		doc2.appro();
	}

}
