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
    }
}
