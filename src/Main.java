public class Main {

    public static void main(String[] args) {

        System.out.println("#######################################");
        System.out.println("Программа паролегенератор по масске.");
        System.out.println("Powered by Stozhkov");
        System.out.println("#######################################");

        PasswordGenerator generator = new PasswordGenerator(new UserInterface().getPasswordMask());

        int countPassword = new UserInterface().getCountPassword();

        System.out.println("Начало вывода паролей.");

        for (int i = 0; i < countPassword; i++) {
            System.out.println(generator.getNewPassword());
        }

        System.out.println("Конец вывода паролей. Спасибо за внимание ;-)");
    }
}
