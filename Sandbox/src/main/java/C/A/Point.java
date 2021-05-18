package C.A;

public class Point {

  public double x1;
  public double y1;
  public double x2;
  public double y2;

  public Point(double p1, double p2) {
  }


  public Point p1(double x1, double y1) {
    this.x1=x1;
    this.y1=y1;
    return null;
  }

  public Point p2(double x2, double y2) {
    this.x2=x2;
    this.y2=y2;
    return null;
  }

 public double distance(Point p1, Point p2) {

    double d1 = (p2.x2 - p1.x1) * (p2.x2 - p1.x1);
    double d2 = (p2.y2 - p1.y1) * (p2.y2 - p1.y1);
    double dist;
    dist = abs(d1 + d2);
    double ab = Math.sqrt(dist);


//    System.out.println("The distance between point A:( " + p1.x1 + "," + p1.y1 + " ) " + " and point B: ( " + p2.x2 + "," + p2.y2 + " ) is " + ab);

   return ab;
 }
  private double abs(double dist) {
    return dist;
  }


}



