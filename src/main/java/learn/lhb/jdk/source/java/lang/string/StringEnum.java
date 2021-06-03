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
    COMPARE_TO_IGNORE_CASE("public int compareToIgnoreCase(String str)"),
    REGION_MATCHES_1("public boolean regionMatches(int toffset, String other, int ooffset, int len)"),
    REGION_MATCHES_2("public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)"),
    STARTS_WITH_1("public boolean startsWith(String prefix, int toffset)"),
    STARTS_WITH_2("public boolean startsWith(String prefix)"),
    ENDS_WITH("public boolean endsWith(String suffix)"),
    HASH_CODE("public int hashCode()"),
    INDEX_OF_1("public int indexOf(int ch)"),
    INDEX_OF_2("public int indexOf(int ch, int fromIndex)"),
    INDEX_OF_3("public int indexOf(String str)"),
    INDEX_OF_4("public int indexOf(String str, int fromIndex)"),
    LAST_INDEX_OF_1("public int lastIndexOf(int ch)"),
    LAST_INDEX_OF_2("public int lastIndexOf(int ch, int fromIndex)"),
    LAST_INDEX_OF_3("public int lastIndexOf(String str)"),
    LAST_INDEX_OF_4("public int lastIndexOf(String str, int fromIndex)"),
    SUBSTRING_1("public String substring(int beginIndex)"),
    SUBSTRING_2("public String substring(int beginIndex, int endIndex)"),
    SUB_SEQUENCE("public CharSequence subSequence(int beginIndex, int endIndex)"),
    CONCAT("public String concat(String str)"),
    REPLACE_1("public String replace(char oldChar, char newChar)"),
    REPLACE_2("public String replace(CharSequence target, CharSequence replacement)"),
    MATCHES("public boolean matches(String regex)"),
    CONTAINS("public boolean contains(CharSequence s)"),
    REPLACE_FIRST("public String replaceFirst(String regex, String replacement)"),
    REPLACE_ALL("public String replaceAll(String regex, String replacement)"),
    SPLIT_1("public String[] split(String regex, int limit)"),
    SPLIT_2("public String[] split(String regex)"),
    JOIN_1("public static String join(CharSequence delimiter, CharSequence... elements)"),
    JOIN_2("public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)"),
    TO_LOWER_CASE_1("public String toLowerCase(Locale locale)"),
    TO_LOWER_CASE_2("public String toLowerCase()"),
    TO_UPPER_CASE_1("public String toUpperCase(Locale locale)"),
    TO_UPPER_CASE_2("public String toUpperCase()"),
    TRIM("public String trim()"),
    TO_STRING("public String toString()"),
    TO_CHAR_ARRAY("public char[] toCharArray()"),
    FORMAT_1("public static String format(String format, Object... args)"),
    FORMAT_2("public static String format(Locale l, String format, Object... args)"),
    VALUE_OF_1("public static String valueOf(Object obj)"),
    VALUE_OF_2("public static String valueOf(char[] data)"),
    VALUE_OF_3("public static String valueOf(char[] data, int offset, int count)"),
    VALUE_OF_4("public static String valueOf(boolean b)"),
    VALUE_OF_5("public static String valueOf(char c)"),
    VALUE_OF_6("public static String valueOf(int i)"),
    VALUE_OF_7("public static String valueOf(long l)"),
    VALUE_OF_8("public static String valueOf(float f)"),
    VALUE_OF_9("public static String valueOf(double d)"),
    COPY_VALUE_OF_1("public static String copyValueOf(char[] data, int offset, int count)"),
    COPY_VALUE_OF_2("public static String copyValueOf(char[] data)"),
    INTERN("public String intern()");

    public String methodName;

    public String getMethodName() {
        return this.methodName;
    }

    StringEnum(String methodName) {
        this.methodName = methodName;
    }
}
