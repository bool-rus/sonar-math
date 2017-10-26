package ru.sbt.demo.math;

import ru.sbt.demo.math.enums.Operand;

public class Math {
    public static void main(String[] args) {
        for(String s:args) System.out.println(s);
        double a = Double.valueOf(args[0]);
        Operand operand = Operand.of(args[1]);
        double b = Double.valueOf(args[2]);
        System.out.println("= "+operand.calclulate(a,b));
    }
}
