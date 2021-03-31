package sr.qualogy.zoo.app;

import sr.qualogy.zoo.service.*;

public class Main {

    private static Menu menuService = new Menu();
    public static void main(String[] args) {
        System.out.print("\n------------ Mini design store ------------\n");

        menuService.menu();

    }
}
