package DesignPattern.DelegatePattern;

/**
 * Business delegate
 * client는 이 클래스에게 모든 것을 위임을 합니다. 이 클래스는 lookup을 해서 리턴된 서비스에게 일을 전달을 합니다.
 */
public class DrawDelegate {
   private DrawServiceLookUp lookupService = new DrawServiceLookUp();

   public void draw(String serviceType){
      DrawService drawService = lookupService.getDrawService(serviceType);
      drawService.draw();
   }
}