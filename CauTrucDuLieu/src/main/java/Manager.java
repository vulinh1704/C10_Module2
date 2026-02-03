class Dog {

}

class Cat {
}

public interface Manager<T> { // Tương tự tham sô truyền vào nhưng là dành cho kiểu dữ liệu
    void add(T t);

    void update(int id, T t);
}

class DogManager implements Manager<Dog> {

    @Override
    public void add(Dog R) {

    }

    @Override
    public void update(int id, Dog D) {

    }
} // Quản lý dog => Truyền Dog

class CatManager implements Manager<Cat> {

    @Override
    public void add(Cat cat) {

    }

    @Override
    public void update(int id, Cat cat) {

    }

    public static void main(String[] args) {
        Object o = new Dog();
    }
}