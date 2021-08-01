package DesignPattern.DelegatePattern;

/**
 * Concrete Classes
 * DrawService를 구현한 클래스는 2개를 정의합니다. 사각형과 원을 담당하는 클래스 두개를 정의합니다. 당연하지만 두 클래스 모두 DrawService를 implements를 해야합니다.
 */
public class RectangleDrawService implements DrawService {

   @Override
   public void draw() {
      System.out.println("Drawing rectangle");
   }
}

class CircleDrawService implements DrawService {

   @Override
   public void draw() {
      System.out.println("Drawing circle");
   }
}