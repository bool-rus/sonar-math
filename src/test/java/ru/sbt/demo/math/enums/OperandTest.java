package ru.sbt.demo.math.enums;

import org.junit.Assert;
import org.junit.Test;

public class OperandTest {
    @Test
    public void of() throws Exception {
        assert Operand.of("+").equals(Operand.PLUS);
    }

    @Test
    public void calclulate() throws Exception {
        double a = 11;
        double b = 13;
        assert (Operand.MINUS.calclulate(a,b) == -2);
    }

}