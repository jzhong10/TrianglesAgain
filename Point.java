public class Point {
    private double x,y;

    public Point(double X, double Y) {
      x = X;
      y = Y;
    }

    public Point(Point p) {
      x = p.x;
      y = p.y;
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }

    public double distanceTo(Point other) {
      double dx = this.x - other.x;
      double dy = this.y - other.y;
      return Math.sqrt(dx*dx + dy*dy);
    }

    public boolean equals(Point other) {
      return (other != null && this.x==other.x && this.y==other.y);
    }
}
