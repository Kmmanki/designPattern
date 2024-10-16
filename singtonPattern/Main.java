package singtonPattern;

public class Main {
    public static void main(String[] args) {

        
        SingletonSetting singletonOut = SingletonSetting.getSingleton();
        System.out.println(singletonOut.getColor());
        singletonOut.setColor("white");
        System.out.println(singletonOut.getColor());

        Thread thread1 = new Thread(() -> {
            SingletonSetting singleton = SingletonSetting.getSingleton();
            System.out.println("t1: "+singleton);
            System.out.println("t1: "+singleton.getColor());
        });

        Thread thread2 = new Thread(() -> {
            SingletonSetting singleton = SingletonSetting.getSingleton();
            System.out.println("t2: "+singleton);
            System.out.println("t2: "+singleton.getColor());
        });

        Thread thread3 = new Thread(() -> {
            SingletonSetting singleton = SingletonSetting.getSingleton();
            System.out.println("t3: "+singleton);
            System.out.println("t3: "+singleton.getColor());
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
