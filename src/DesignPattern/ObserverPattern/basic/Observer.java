package DesignPattern.ObserverPattern.basic;

/**
 * 추상화된 통보 대상
 */
public interface Observer<T> {
    void update(T value); //데이터 변경을 통보했을 때 처리하는 메서드
}