package ru.qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance(){
    Point p1 = new Point(4, 6);
    Point p2 = new Point(10, 14);
    Assert.assertEquals(p1.distance(p2), 10.0);
  }

  @Test
  public void testDistanceBackward(){
    Point p1 = new Point(10, 14);
    Point p2 = new Point(4, 6);
    Assert.assertEquals(p2.distance(p1), 10.0);
  }
}
