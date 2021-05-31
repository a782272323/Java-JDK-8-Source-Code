package learn.lhb.jdk.source.java.lang.string;

import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Author lianghongbin
 * @Date 15:53 2021/5/28
 * @Description String 方法尝试枚举类
 */
public enum StringEnum {
    /**
     * 枚举字段
     */
    LENGTH("length"),
    IS_EMPTY("isEmpty"),
    CHAR_AT("charAt"),
    CODE_POINT_AT("codePointAt"),
    CODE_POINT_BEFORE("codePointBefore"),
    OFFSET_BY_CODE_POINTS("offsetByCodePoints"),
    CODE_POINT_COUNT("code_point_count"),
    GET_CHARS("getChars"),
    GET_BYTES_1("getBytes");

    public String methodName;

    public String getMethodName() {
        return this.methodName;
    }

    StringEnum(String methodName) {
        this.methodName = methodName;
    }
}
