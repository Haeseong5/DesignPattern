package DesignPattern.DelegatePattern;

public class Demo {
   public static void main(String[] args) {
     DrawDelegate drawDelegate = new DrawDelegate();
     drawDelegate.draw("CIRCLE");
   }
}