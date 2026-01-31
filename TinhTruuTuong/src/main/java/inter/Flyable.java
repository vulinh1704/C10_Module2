package inter;

public interface Flyable { // k phải là class => là 1 bản mô tả tập hợp tính năng của các class
    public static final int SO_CANH = 10;

    public abstract String bayCao();
    abstract  String tangToc();
    String giamToc();

    static void show(){
        System.out.println("Flyable static Method");
    }

    default void go() {
        System.out.println("Go go");
    }
}
// Interface thì chứa các phương thức abstract
// Mặc định đi cùng các method trong interface thì là public abstract
