package studentManager;

public class StudentValidator {
    public static String validateName(String name) {
        while (true) {
            if (name.matches("^[a-zA-Z ]{2,42}$")) {
                return name;
            } else {
                System.out.println("Wrong format! Pls enter 2-42 character and not special char");
                name = Input.inputString();
            }
        }
    }

    public static String validateGender(String gender) {
        while (true) {
            if (gender.equalsIgnoreCase("male")
                    || gender.equalsIgnoreCase("female")) {
                return gender;
            } else {
                System.out.println("Wrong format! Pls enter gender 'male' or 'female'");
                gender = Input.inputString();
            }
        }
    }
}
