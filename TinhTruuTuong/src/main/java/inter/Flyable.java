package inter;

public interface Flyable { // k phải là class => là 1 bản mô tả tập hợp tính năng của các class
    public abstract String bayCao();
    abstract  String tangToc();
    String giamToc();
}
// Interface thì chứa các phương thức abstract
// Mặc định đi cùng các method trong interface thì là public abstract
