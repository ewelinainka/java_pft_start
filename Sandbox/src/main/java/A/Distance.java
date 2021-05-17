package A;

public class Distance {

  public static void main (String[] args) {

    PointA a= new PointA(5,6);
    PointB b= new PointB(3,7);

    double d1 = (b.bp1-a.ap1)*(b.bp1-a.ap1);
    double d2 = (b.bp2-a.ap2)*(b.bp2-a.ap2);
    double dist;
    dist = abs(d1+d2);
    double ab = Math.sqrt(dist);

    System.out.println("The distance between point A:( " + a.ap1 + "," + a.ap2 + " ) " + " and point B: ( " + b.bp1 + "," + b.bp2 + " ) is " + ab);
  }

  private static double abs(double dist) {
    return dist;
  }


}
