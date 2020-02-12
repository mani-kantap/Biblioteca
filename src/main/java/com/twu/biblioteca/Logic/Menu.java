package com.twu.biblioteca.Logic;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuOption> menuOptions = new ArrayList<>();

    public Menu() {
        menuOptions.add(new ListBooks());
        menuOptions.add(new CheckOut());
        menuOptions.add(new ReturnBook());
    }

    public List<MenuOption> getOptions() {
        return menuOptions;
    }

}