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
    VALUE_OF_1("public static BigDecimal valueOf(long unscaledVal, int scale)");
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
