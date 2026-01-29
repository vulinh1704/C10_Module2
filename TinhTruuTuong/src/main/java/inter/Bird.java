package inter;

class A {
};

/*
 Một class non-abstract triển khai 1 interface thì phải
 triển khai tất cả các phương thức của interface đó.

 Interface sử dụng khi trong mối quan hệ can-do (có thể làm gì)
 */
public class Bird extends A implements Flyable, EatAble {
    // đa triển khai
    @Override
    public String bayCao() {
        return "";
    }

    @Override
    public String tangToc() {
        return "";
    }

    @Override
    public String giamToc() {
        return "";
    }

    @Override
    public void eat() {

    }

    @Override
    public void anKieuPhap() {

    }
}
