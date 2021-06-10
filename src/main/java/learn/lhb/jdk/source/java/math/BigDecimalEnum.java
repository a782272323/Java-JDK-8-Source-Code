package learn.lhb.jdk.source.java.math;

/**
 * @Author lianghongbin
 * @Date 19:13 2021/6/8
 * @Description BigDecimal 方法的枚举类
 * todo BigDecimal 的几种舍入模式有空
 */
public enum  BigDecimalEnum {

    /**
     * 方法枚举
     */
    VALUE_OF_1("public static BigDecimal valueOf(long unscaledVal, int scale)"),
    VALUE_OF_2("public static BigDecimal valueOf(long val)"),
    VALUE_OF_3("public static BigDecimal valueOf(double val)"),
    ADD_1("public BigDecimal add(BigDecimal augend)"),
    ADD_2("public BigDecimal add(BigDecimal augend, MathContext mc)"),
    SUBTRACT_1("public BigDecimal subtract(BigDecimal subtrahend)"),
    SUBTRACT_2("public BigDecimal subtract(BigDecimal subtrahend, MathContext mc)"),
    MULTIPLY_1("public BigDecimal multiply(BigDecimal multiplicand)"),
    MULTIPLY_2("public BigDecimal multiply(BigDecimal multiplicand, MathContext mc)"),
    DIVIDE_1("public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)");
    private String methodName;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    BigDecimalEnum(String methodName) {
        this.methodName = methodName;
    }
}
