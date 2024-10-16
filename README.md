# 디자인 패턴
객체지향 프로그래밍 설계를 할 때 자주 발생하는 문제들을 피하기 위한 패턴

----
## 싱글톤 패턴
싱들톤 패턴은 특정 클래스의 인스턴스가 오직 하나만 생성되도록 보장하는 디장니 패턴, 인스턴스가 프로그램 전체에서 동일한 자원을 공유하도록 하는데 유용하다 (Ex: 프린터, 키보드와 같은 리소스를 전역에서 관리할 때)

### 지연 초기화
SingletonHolder는 내부 클래스(Inner Class)이며 Static으로 getInstance 호출시에 class 가 초기화되고 최초 1회만 초기화 된다.

### 스레드 안정성
내부 클래스는 클래스 로딩 시점에 초기회되므로 멀티스레드 환경에서도 인스턴스가 중복 생성될 위험이 없다.

```
public class SingletonSetting {

    private String color = "black"; 

    private SingletonSetting() {}

    // syncronized 사용하지 않고 싱글톤의 인스턴스 생성
    private static class SingletonHolder {
        private static final SingletonSetting singletoneObject = new SingletonSetting(); 
    }

    public static SingletonSetting getSingleton () {
        return SingletonHolder.singletoneObject;
    }

    public void setColor(String _color) {
        color = _color;
    } 

    public String getColor() {
        return color;
    }
}
```
--- 
## 전략패턴(strategy)
