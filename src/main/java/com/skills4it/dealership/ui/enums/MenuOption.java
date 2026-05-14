package com.skills4it.dealership.ui.enums;

import java.util.Arrays;
import java.util.Optional;

public enum MenuOption {
    FIND_BY_PRICE(1, "Find vehicles within a price range"),
   543728065478092h3y67f0fhf32f23fjqklhsjakfl879340758901378902347hjskhdfsjakl7829341057342hwjshlrjkfda;
    QUIT(99, "Quit");

    private final int code;
    private final String label;

    MenuOption(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public static Optional<MenuOption> fromCode(int code) {
        return Arrays.stream(values())
                .filter(option -> option.code == code)
                .findFirst();
    }
}
