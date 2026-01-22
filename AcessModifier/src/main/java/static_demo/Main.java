package static_demo;

public class Main {
    public static void main(String[] args) {
        Website w1 = new Website("https://codegym.vn");
        w1.incrementView();
        w1.incrementView();
        w1.incrementView();
        w1.incrementView(); //
        System.out.println("Web:  " + w1.URL + " View: " + w1.view);
        System.out.println(Website.doTre);
        // Sử dụng tên lớp để truy xuất các thành phần static

        Website w2 = new Website("https://pixi.vn");
        w2.incrementView();
        w2.incrementView();
        w2.incrementView();
        w2.incrementView();
        w2.incrementView();
        System.out.println("Web: " + w2.URL + " View: " +w2.view);
        System.out.println(Website.doTre);
        Website.doTre = "high";
        System.out.println(Website.doTre);
        System.out.println(Website.getIp()); // gọi hàm static
    }
}
