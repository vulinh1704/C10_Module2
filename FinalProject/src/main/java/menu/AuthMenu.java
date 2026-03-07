package menu;

import lib.Input;
import model.User;
import service.UserManager;

public class AuthMenu {

    private UserManager userManager;
    private CategoryMenu categoryMenu;
    private ProductMenu productMenu;

    public AuthMenu() {
        this.userManager = new UserManager();
        this.categoryMenu = new CategoryMenu();
        this.productMenu = new ProductMenu();
    }

    public void showAuthMenu() {
        int choice;
        do {
            System.out.println("========== Auth Menu =========");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exist");
            System.out.println("Pls enter your choice: ");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    showRegisterMenu();
                    break;
                case 2:
                    showLogin();
                    break;
                case 0:
                    System.out.println("Bye, See you again!");
                    break;
                default:
                    System.out.println("Pls enter choice in menu!");
            }
        } while (choice != 0);
    }

    public void showRegisterMenu() {
        System.out.println("Enter your username: ");
        String username = Input.inputString();
        System.out.println("Enter your password: ");
        String password = Input.inputString();
        User user = new User(username, password);
        userManager.register(user);
        System.out.println("Register successfully!");
    }

    public void showLogin() {
        System.out.println("Enter your username: ");
        String username = Input.inputString();
        System.out.println("Enter your password: ");
        String password = Input.inputString();
        boolean isSystemUser = this.userManager.login(username, password);
        if (isSystemUser) {
            showSystemMenu();
        } else {
            System.out.println("Wrong username or password!");
        }
    }

    public void showSystemMenu() {
        int choice;
        do {
            System.out.println("========== Admin Menu =========");
            System.out.println("1. Manager Product");
            System.out.println("2. Manger Category");
            System.out.println("2. Manger User");
            System.out.println("0. Exist");
            System.out.println("Pls enter your choice: ");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    productMenu.showMainMenu();
                    break;
                case 2:
                    categoryMenu.showMainMenu();
                    break;
                case 3:
                    System.out.println("vao user");
                    break;
                case 0:
                    System.out.println("Bye, See you again!");
                    break;
                default:
                    System.out.println("Pls enter choice in menu!");
            }
        } while (choice != 0);
    }
}
