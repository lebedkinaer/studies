package ru.qa.sandbox;

public class MyFirstProg {

  public static void main(String[] args) {
    System.out.println("Hello, world!");

    Point p1 = new Point(0, 0);
    Point p2 = new Point(2, 16);

    System.out.println("Координаты первой точки по стороне x = " + p1.x + " по стороне y = " + p1.y);
    System.out.println("Координаты второй точки по стороне x = " + p2.x + " по стороне y = " + p2.y);
    System.out.println("Расстояние между точками = " + p1.distance(p2));
  }
}