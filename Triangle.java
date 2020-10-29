public class Triangle {
    private Point v1, v2, v3;

    public Triangle(Point a, Point b, Point c) {
      v1 = a;
      v2 = b;
      v3 = c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
      v1 = new Point(x1, y1);
      v2 = new Point(x2, y2);
      v3 = new Point(x3, y3);
    }

    public double getPerimeter() {
      return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
    }

    public double getArea() {
      double d12 = v1.distanceTo(v2);
      double d13 = v1.distanceTo(v3);
      double d23 = v2.distanceTo(v3);
      double s = this.getPerimeter() / 2;
      return Math.sqrt(s * (s - d12) * (s - d13) * (s - d23) );
    }

    public static double roundtenthousandths(double x) {
  		return Math.round(10000 * x) / 10000.0;
  	}

    public String classify() {
      double d12 = roundtenthousandths(v1.distanceTo(v2));
      double d13 = roundtenthousandths(v1.distanceTo(v3));
      double d23 = roundtenthousandths(v2.distanceTo(v3));
      int count = 0;
      if (d12 == d13) {
        count++;
      }

      if (d12 == d23) {
        count++;
      }

      if (d13 == d23) {
        count++;
      }
      String[] types = {"scalene", "isosceles", "", "equilateral"};
      return types[count];
      // I just wanted to try another way to do this
    }

    public String toString() {
      return "v1(" + v1.getX() + ", " + v1.getY() + ") " +
             "v2(" + v2.getX() + ", " + v2.getY() + ") " +
             "v3(" + v3.getX() + ", " + v3.getY() + ")";
    }
}
