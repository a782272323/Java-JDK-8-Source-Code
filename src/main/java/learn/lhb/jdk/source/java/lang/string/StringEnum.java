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
    LENGTH("public int length()"),
    IS_EMPTY("public boolean isEmpty()"),
    CHAR_AT("public char charAt(int index)"),
    CODE_POINT_AT("public int codePointAt(int index)"),
    CODE_POINT_BEFORE("public int codePointBefore(int index)"),
    OFFSET_BY_CODE_POINTS("public int offsetByCodePoints(int index, int codePointOffset)"),
    CODE_POINT_COUNT("public int codePointCount(int beginIndex, int endIndex)"),
    GET_CHARS("public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)"),
    GET_BYTES_1("public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)"),
    GET_BYTES_2("public byte[] getBytes(String charsetName) throws UnsupportedEncodingException"),
    GET_BYTES_3("public byte[] getBytes(Charset charset)"),
    GET_BYTES_4("public byte[] getBytes()"),
    EQUALS("public boolean equals(Object anObject)"),
    CONTENT_EQUALS("public boolean contentEquals(StringBuffer sb)"),
    EQUALS_IGNORE_CASE("public boolean equalsIgnoreCase(String anotherString)"),
    COMPARE_TO("public int compareTo(String anotherString)"),
    COMPARE_TO_IGNORE_CASE("public int compareToIgnoreCase(String str)");

    public String methodName;

    public String getMethodName() {
        return this.methodName;
    }

    StringEnum(String methodName) {
        this.methodName = methodName;
    }
}
