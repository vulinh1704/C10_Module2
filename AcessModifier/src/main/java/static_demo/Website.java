package static_demo;

public class Website {
    public String URL; // thuộc tính của đối tượng
    public int view;
    public static String doTre = "Low"; // thuộc tính của lớp

    public Website(String URL) {
        this.URL = URL;
    }

    // non-static: của đối tượng
    // có thể gọi các phương thức static
    public void incrementView() { // phương thức của đối tượng
        this.view++;
        // this: sẽ đại diện cho đối tượng đang sử dụng hàm
    }

    // Các phương thức static chỉ có thể sử dụng các thành phần static khác
    public static String getIp() { // hàm static
        return "127.0.0.1";
    }

    public static void demo() {
        getIp();
    }

    // Sử dụng static cho các thành phần dữ liệu (thuộc tính, phương thức) mà tất cả đối tượng được sinh ra từ lớp này đều có
}
