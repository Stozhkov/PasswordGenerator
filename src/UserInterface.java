import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    public int getCountPassword() {

        int count;

        System.out.println("Сколько паролей генерировать?");
        System.out.print("Ожидается ввод пользователя:");

        Scanner in = new Scanner(System.in);

        try {
            count = in.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Тычеупоротыйштоле?");
            count = getCountPassword();

        }

        return count;
    }

    public String getPasswordMask() {

        String passwordMask;

        do {
            System.out.println("Введите маску пароля.");
            System.out.println("с - буква маленькая, C - буква большая, n - число");
            System.out.print("Ожидается ввод пользователя:");

            Scanner in = new Scanner(System.in);
            passwordMask = in.next();
        } while (!checkMask(passwordMask));

        return passwordMask;
    }

    private boolean checkMask(String passwordMask) {

        boolean checkPasswordResult = false;

        for (int i = 0; i < passwordMask.length(); i++) {
            if (passwordMask.charAt(i) != 'c' && passwordMask.charAt(i) != 'C' && passwordMask.charAt(i) != 'n') {
                checkPasswordResult = false;
                break;
            } else {
                checkPasswordResult = true;
            }
        }

        if (!checkPasswordResult) {
            System.out.println("Тычеупоротыйштоле? Буквычитатьнеумеещщщ!");
        }

        return checkPasswordResult;
    }
}