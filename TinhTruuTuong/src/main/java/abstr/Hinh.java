package abstr;

public abstract class Hinh { // khai báo 1 abstract class
    public abstract double getS(); // Phương thức abstract thì k có phần thân
    public abstract double getC();
    // abstract method nằm abstract class

    private String name; // có thuộc tính

    public Hinh(String name) {
        this.name = name;
    }

    public Hinh() {
    }

    public void showName() { // non-abstract
        System.out.println("Day la " + this.name);
    }
}

// final k đi đc cùng abstract
