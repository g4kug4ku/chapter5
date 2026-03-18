package chapter5;

public class Code5_17 {
	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = (bottom * height) / 2;
		return triangleArea;
	}
	public static double calcCircleArea(double radius) {
		final double pi = 3.14;
		double circleArea = (radius * radius) * pi;
		return circleArea;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double triangleAreaAns = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + triangleAreaAns + "平方cm");
		double circleAreaAns = calcCircleArea(5.0);
		System.out.println("円の面積：" + circleAreaAns + "平方cm");
	}

}
