public class CircularSingly {
	public static void main(String[] args) {
	LetsTryCircular yo=new LetsTryCircular();
	yo.InsCS(5, 0);
	yo.InsCS(10, 1);
	yo.InsCS(56, 2);
	yo.InsCS(5, 3);
	yo.InsCS(100, 2);
	yo.InsCS(500, 0);
	yo.InsCS(59, 7);
	yo.print();
	yo.Del(3);
	yo.print();
	}
}
