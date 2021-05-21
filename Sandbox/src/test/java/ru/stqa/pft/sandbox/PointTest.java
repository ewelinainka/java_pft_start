package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void shouldCalculateDistanceBetweenPoints() {
    // given
    Point p1 = new Point(5, 6);
    Point p2 = new Point(5, 3);
    // when
    double result = p1.distance(p2);
    // then
    Assert.assertEquals(result, 3.0);

  }
}
