package ru.sbt.demo.math.enums;

public enum Operand {
    PLUS("+") {
        public double calclulate(double a, double b) {
            return a + b;
        }
    },
    MINUS("-") {
        public double calclulate(double a, double b) {
            return a - b;
        }
    };

    private final String operand;

    Operand(String operand) {
        this.operand = operand;
    }

    public static Operand of(String s) {
        for (Operand value : values())
            if (value.operand.equals(s)) return value;
        throw new IllegalArgumentException();
    }

    public abstract double calclulate(double a, double b);
}
