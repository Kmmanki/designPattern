package singtonPattern;

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
