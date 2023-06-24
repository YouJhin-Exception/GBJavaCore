package coreHw4.enums;

import java.util.List;
import java.util.Random;
public enum Discount {
    NONE, //0%
    LOW, //5%
    MEDIUM, //10%
    HEIGHT, //15%
    HUGE; // 20%

    private static final List<Discount> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Discount randomDiscount()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
