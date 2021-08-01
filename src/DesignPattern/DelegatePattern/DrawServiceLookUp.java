package DesignPattern.DelegatePattern;

/**
 * 실제 두개의 서비스 중 하나를 리턴하는 클래스입니다.
 */
public class DrawServiceLookUp {

   public DrawService getDrawService(String drawType) {
      if(drawType.equalsIgnoreCase("CIRCLE")){
         return new CircleDrawService();
      }
      else {
         return new RectangleDrawService();
      }
   }

}