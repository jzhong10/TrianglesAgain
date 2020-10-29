public class Tester {
    public static void main(String[] args) {
      Point p1 = new Point(4, 0);
      Point p2 = new Point(-100, 23);
      Point p3 = new Point(0, 3);
      Point p4 = new Point(0, 0);

      System.out.println(p1.getX());
      System.out.println(p1.getY());
      System.out.println(p2.getX());
      System.out.println(p2.getY());

      System.out.println();

      System.out.println(p1.distanceTo(p3)); // 5
      System.out.println(p3.distanceTo(p1)); // 5
      System.out.println(p1.distanceTo(p4)); // 4
      System.out.println(p1.distanceTo(p1)); // 0

      System.out.println();

      System.out.println(p1.equals(p1)); // T
      System.out.println(p1.equals(p2)); // F
      System.out.println(p1.equals(p4)); // F
      for (int i = 0; i < 5; i++) {
        Point pt1 = new Point(i, 0);
        Point pt2 = new Point(i, 0);
        System.out.println(pt1.equals(pt2)); // TTTTTTTTT
      }

      Triangle t1 = new Triangle(p1, p3, p4);
      Triangle t2 = new Triangle(0, 0, 10, 0, 0, 10);

      System.out.println(t1.getPerimeter()); // 12
      System.out.println(t2.getPerimeter()); //20 + 10sqrt2 ~ 34.14
      System.out.println(t1.getArea()); // 6
      System.out.println(t2.getArea()); // 50

      System.out.println();
      System.out.println(t1.classify());
      System.out.println();
      // all isoscles
      for (int i = 0; i < 5; i++) {
        Triangle a = new Triangle(0, 0, 2, 0, 1, i);
        System.out.println(a.classify());
      }

      System.out.println();

      // all equilateral
      for (int i = 0; i < 10; i++) {
        double x = Math.random()*100;
        Triangle a = new Triangle(0, 0, x, 0, x/2, (x/2)*Math.sqrt(3));
        System.out.println(a.classify());
      }
    }
}
