package learn.lhb.jdk.source.java.time;

/**
 * @Author lianghongbin
 * @Date 11:30 2021/6/4
 * @Description LocalDateTime 方法枚举类
 */
public enum  LocalDateTimeEnum {
    /**
     * LocalDateTime 的方法
     */
    NOW_1("public static LocalDateTime now()"),
    NOW_2("public static LocalDateTime now(ZoneId zone)")
    ;

    private String methodName;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    LocalDateTimeEnum(String methodName) {
        this.methodName = methodName;
    }
}
