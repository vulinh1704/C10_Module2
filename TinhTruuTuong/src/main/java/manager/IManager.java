package manager;

public interface IManager {
    void create(String name);
    String[] getAll();
    void remove();
    void update();
    String[] findAllByName();
}
