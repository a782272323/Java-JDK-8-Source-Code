package learn.lhb.service.impl.java.lang;

import learn.lhb.common.constant.IntegerConstant;
import learn.lhb.common.constant.RegexConstant;
import learn.lhb.common.constant.ResponseConstant;
import learn.lhb.common.constant.StringConstant;
import learn.lhb.jdk.source.java.lang.string.StringEnum;
import learn.lhb.service.java.string.StringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author lianghongbin
 * @Date 11:01 2021/5/31
 * @Description
 */
@Service
@Slf4j
public class StringServiceImpl implements StringService {

    private static String responseStr = ResponseConstant.METHOD_PARENTHESES + ResponseConstant.RESPONSE_OK_PRINT_MSG;

    /**
     * @Description public int length()方法
     * 返回字符串的长度
     * @Author lianghongbin
     * @Date 11:17 2021/5/31
     * @param methodType
     * @Return {@link String}
     */
    @Override
    public String length(StringEnum methodType) {
        String string = StringConstant.STRING_SMALL_LETTER;
        log.info("字符串 = {}, 方法 = {}, 长度length = {}", string, methodType.getMethodName(), string.length());
        return responseStr(methodType);
    }

    /**
     * @Description public boolean isEmpty()方法
     * 判断字符串是否是空字符串，前提是字符串不能为 null
     * @Author lianghongbin
     * @Date 11:19 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String isEmpty(StringEnum methodType) {
        String emptyString = "";
        String nullString = null;
        String string = StringConstant.STRING_BIG_LETTER;
        log.info("字符串 = {}, 方法 = {}, 结果 = {}", emptyString, methodType.getMethodName(), emptyString.isEmpty());
        if (nullString != null && nullString.isEmpty()) {
            log.info("字符串 = {}, 方法 = {}", nullString, methodType.getMethodName());
        } else {
            log.info("字符串 = {}, 为空, 不能使用isEmpty()方法", nullString);
        }
        log.info("字符串 = {}, 方法 = {}, 结果 = {}", string, methodType.getMethodName(), string.isEmpty());
        return responseStr(methodType);
    }

    /**
     * @Description public char charAt(int index)方法
     * 返回指定索引处的值
     * @Author lianghongbin
     * @Date 12:14 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String charAt(StringEnum methodType) {
        String string = StringConstant.STRING_BIG_LETTER;
        for (int i = 0; i < string.length(); i++) {
            log.info("字符串 = {}, 方法 = {}, 索引 = {}, 结果 = {}", string, methodType.getMethodName(), i, string.charAt(i));
        }
        return responseStr(methodType);
    }

    /**
     * @Description public int codePointAt(int index)方法
     * 返回指定索引处的 Unicode 值
     * @Author lianghongbin
     * @Date 14:58 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String codePointAt(StringEnum methodType) {
        String string = StringConstant.STRING_NUMBER_REVERSE;
        for (int i = 0; i < string.length(); i++) {
            log.info("字符串 = {}, 方法 = {}, 索引 = {}, 结果 = {}", string, methodType.getMethodName(), i, string.codePointAt(i));
        }
        return responseStr(methodType);
    }

    /**
     * @Description public int codePointBefore(int index)方法
     * 返回指定索引处的前一个字符的 Unicode 值，索引值从1到length
     * @Author lianghongbin
     * @Date 15:08 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String codePointBefore(StringEnum methodType) {
        String string = StringConstant.STRING_BIG_LETTER;
        for (int i = 0; i < string.length(); i++) {
            log.info("字符串 = {}, 方法 = {}, 索引 = {}, 结果 = {}", string, methodType.getMethodName(), i + 1, string.codePointBefore(i + 1));
        }
        return responseStr(methodType);
    }

    /**
     * @Description public int offsetByCodePoints(int index, int codePointOffset)方法
     * 返回此 String 中从给定的 index 处偏移 codePointOffset 个代码点的索引。
     * @Author lianghongbin
     * @Date 15:24 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String offsetByCodePoints(StringEnum methodType) {
        String string = StringConstant.STRING_SMALL_LETTER;
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.offsetByCodePoints(0, 15));
        return responseStr(methodType);
    }

    /**
     * @Description public int codePointCount(int beginIndex, int endIndex)
     * 返回 beginIndex 到 endIndex 的长度
     * @Author lianghongbin
     * @Date 15:35 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String codePointCount(StringEnum methodType) {
        String string = StringConstant.STRING_SMALL_LETTER;
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.codePointCount(0, 15));
        return responseStr(methodType);
    }

    /**
     * @Description public void getChars(int srcBegin,
     *                      int srcEnd,
     *                      char[] dst,
     *                      int dstBegin)
     * srcBegin - 要复制的字符串中第一个字符的索引。
     * srcEnd - 要复制的字符串中最后一个字符后面的索引。
     * dst - 目标数组。
     * dstBegin - 目标数组中的起始偏移量。
     * 用于将此字符串中的字符复制到目标字符数组中。
     * @Author lianghongbin
     * @Date 15:45 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String getChars(StringEnum methodType) {
        String string = StringConstant.STRING_BIG_LETTER;
        char[] copyChar = new char[string.length()];
        log.info("复制前，字符串 = {}，方法 = {}， 复制后的copyChar数组的值 = {}", string, methodType.getMethodName(), copyChar);
        string.getChars(0, 15, copyChar, 0);
        log.info("复制后，字符串 = {}，方法 = {}， 复制后的copyChar数组的值 = {}", string, methodType.getMethodName(), copyChar);
        return responseStr(methodType);
    }

    /**
     * @Description public void getBytes(int srcBegin,
     *                                  int srcEnd,
     *                                  byte[] dst,
     *                                  int dstBegin)
     * srcBegin - 要复制的字符串中第一个字符的索引
     * srcEnd - 要复制的字符串中最后一个字符后的索引
     * dst - 目的数组
     * dstBegin - 目标数组中的起始偏移量
     * 将此字符串中的字符复制到目标字节数组中。 每个字节接收相应字符的8个低位。 每个字符的八个高位不被复制，也不以任何方式参与转移。
     * 此方法已过时
     * @Author lianghongbin
     * @Date 15:54 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String getBytes1(StringEnum methodType) {
        String string = StringConstant.STRING_SMALL_LETTER;
        byte[] copyByte = new byte[string.length()];
        log.info("复制前，字符串 = {}，方法 = {}， 复制后的copyChar数组的值 = {}", string, methodType.getMethodName(), copyByte);
        string.getBytes(0, 15, copyByte, 0);
        log.info("复制后，字符串 = {}，方法 = {}， 复制后的copyChar数组的值 = {}", string, methodType.getMethodName(), copyByte);
        return responseStr(methodType);
    }

    /**
     * @Description public byte[] getBytes(String charsetName) throws UnsupportedEncodingException
     * 使用命名的字符集将此String编码为字节序列，将结果存储到新的字节数组中(设置字符串的编码模式)
     * @Author lianghongbin
     * @Date 14:13 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String getBytes2(StringEnum methodType) throws Exception{
        String string = StringConstant.STRING_SMALL_LETTER;
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.getBytes("ISO-8859-1"));
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.getBytes("UTF-8"));
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.getBytes("US-ASCII"));
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.getBytes("UTF-16"));
        return responseStr(methodType);
    }

    /**
     * @Description public byte[] getBytes(Charset charset)
     * 使用平台的默认字符集将此String编码为字节序列，将结果存储到新的字节数组中
     * @Author lianghongbin
     * @Date 14:25 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String getBytes3(StringEnum methodType) throws Exception {
        String string = StringConstant.STRING_BIG_LETTER;
        byte[] copyByte = new byte[string.length()];
        copyByte = string.getBytes("UTF-8");
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string, methodType.getMethodName(), copyByte);
        return responseStr(methodType);
    }

    /**
     * @Description public byte[] getBytes()
     * 使用平台的默认字符集将此String编码为字节序列，将结果存储到新的字节数组中。
     * @Author lianghongbin
     * @Date 14:30 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String getBytes4(StringEnum methodType) {
        String string = StringConstant.STRING_NUMBER_REVERSE;
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.getBytes());
        return responseStr(methodType);
    }

    /**
     * @Description public boolean equals(Object anObject)
     * 将此字符串与指定对象进行比较。 其结果是true当且仅当该参数不是null并且是String对象，表示相同的字符序列作为该对象。
     * @Author lianghongbin
     * @Date 14:35 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String equals(StringEnum methodType) {
        String string1 = StringConstant.STRING_BIG_LETTER;
        String string2 = StringConstant.STRING_BIG_LETTER;
        String nullString1 = null;
        String nullString2 = null;
        String str1 = "";
        String str2 = "";
        String string = StringConstant.STRING_NUMBER_REVERSE;
        log.info("使用的方法 = {}" + methodType.getMethodName());
        log.info("比较是否相等, {}.equals({}), 结果 = {}", string1, string2, string1.equals(string1));
        log.info("比较是否相等, {}.equals({}), 结果 = {}", string1, string, string1.equals(string));
        log.info("比较两个空字符串是否相等, {}.equals({}), 结果 = {}" , str1, str2, str1.equals(str2));
        return responseStr(methodType);
    }

    /**
     * @Description public boolean contentEquals(StringBuffer sb)
     * 将此字符串与指定的StringBuffer进行StringBuffer 。
     * @Author lianghongbin
     * @Date 14:53 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String contentEquals(StringEnum methodType) {
        String string1 = StringConstant.STRING_NUMBER_REVERSE;
        String string2 = StringConstant.STRING_NUMBER_REVERSE;
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(string1);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(string2);
        log.info("方法 = {}， 结果 = {}", methodType.getMethodName(), string1.contentEquals(stringBuffer1));
        log.info("方法 = {}， 结果 = {}", methodType.getMethodName(), string1.contentEquals(stringBuffer2));
        return responseStr(methodType);
    }

    /**
     * @Description public boolean equalsIgnoreCase(String anotherString)
     * 将此String与其他String比较,判断两个字符串是不是同一个，不仅仅是值一样
     * 不区分大小写比较字符串
     * @Author lianghongbin
     * @Date 15:00 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String equalsIgnoreCase(StringEnum methodType) {
        String string = StringConstant.STRING_NUMBER_REVERSE;
        String string2 = StringConstant.STRING_NUMBER_REVERSE;
        String string1 = StringConstant.STRING_NUMBER;
        String str1 = StringConstant.STRING_BIG_LETTER;
        String str2 = StringConstant.STRING_SMALL_LETTER;
        log.info("方法 = {}， 结果 = {}", methodType.getMethodName(), string.equalsIgnoreCase(string1));
        log.info("方法 = {}， 结果 = {}", methodType.getMethodName(), string2.equalsIgnoreCase(string1));
        log.info("方法 = {}， 结果 = {}", methodType.getMethodName(), string2.equalsIgnoreCase(string2));
        log.info("方法 = {}， 结果 = {}", methodType.getMethodName(), str1.equalsIgnoreCase(str2));
        return responseStr(methodType);
    }

    /**
     * @Description public int compareTo(String anotherString)
     * 按照字典顺序比较两个字符串，anotherString 代表参数字符串
     * 如果值为0，代表参数字符串等于此字符串
     * 如果值小于0，代表参数字符串大于此字符串
     * 如果值大于0，代表参数字符串小于此字符串
     * @Author lianghongbin
     * @Date 19:18 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String compareTo(StringEnum methodType) {
        String string1 = StringConstant.STRING_NUMBER_REVERSE;
        String string2 = StringConstant.STRING_NUMBER;
        String str1 = StringConstant.STRING_BIG_LETTER;
        String str2 = StringConstant.STRING_SMALL_LETTER;
        log.info("字符串 ，方法 = {}，{}.compareTo({}) = {}", methodType.getMethodName(), string1, string2, string1.compareTo(string2));
        log.info("字符串 ，方法 = {}，{}.compareTo({}) = {}", methodType.getMethodName(), string1, string1, string1.compareTo(string1));
        log.info("字符串 ，方法 = {}，{}.compareTo({}) = {}", methodType.getMethodName(), string2, string1, string2.compareTo(string1));
        log.info("字符串 ，方法 = {}，{}.compareTo({}) = {}", methodType.getMethodName(), string1, str1, string1.compareTo(str1));
        log.info("字符串 ，方法 = {}，{}.compareTo({}) = {}", methodType.getMethodName(), str1, string1, str1.compareTo(string1));
        return responseStr(methodType);
    }

    /**
     * @Description public int compareToIgnoreCase(String str)
     * 按字典顺序比较两个字符串
     * @Author lianghongbin
     * @Date 19:50 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String compareToIgnoreCase(StringEnum methodType) {
        String string1 = StringConstant.STRING_NUMBER_REVERSE;
        String string2 = StringConstant.STRING_NUMBER;
        String str1 = StringConstant.STRING_BIG_LETTER;
        String str2 = StringConstant.STRING_SMALL_LETTER;
        log.info("字符串 ，方法 = {}，{}.compareToIgnoreCase({}) = {}", methodType.getMethodName(), string1, string2, string1.compareToIgnoreCase(string2));
        log.info("字符串 ，方法 = {}，{}.compareToIgnoreCase({}) = {}", methodType.getMethodName(), string1, string1, string1.compareToIgnoreCase(string1));
        log.info("字符串 ，方法 = {}，{}.compareToIgnoreCase({}) = {}", methodType.getMethodName(), string2, string1, string2.compareToIgnoreCase(string1));
        log.info("字符串 ，方法 = {}，{}.compareToIgnoreCase({}) = {}", methodType.getMethodName(), string1, str1, string1.compareToIgnoreCase(str1));
        log.info("字符串 ，方法 = {}，{}.compareToIgnoreCase({}) = {}", methodType.getMethodName(), str1, string1, str1.compareToIgnoreCase(string1));
        return responseStr(methodType);
    }

    @Override
    public String regionMatches1(StringEnum methodType) {
        String string1 = StringConstant.STRING_BIG_LETTER;
        String string2 = StringConstant.STRING_BIG_LETTER_12;
        String str1 = StringConstant.STRING_SMALL_LETTER;
        String str2 = StringConstant.STRING_SMALL_LETTER_12;
        int toffset = 3;
        int len = 5;
        log.info("方法 = {}， 同为大写的两个字符串比较 = {}", methodType.getMethodName(), string1.regionMatches(toffset, string2, toffset, len));
        log.info("方法 = {}， 同为小写的两个字符串比较 = {}", methodType.getMethodName(), str1.regionMatches(toffset, string2, toffset, len));
        log.info("方法 = {}， 大小写不同的两个字符串比较 = {}", methodType.getMethodName(), string1.regionMatches(toffset, str2, toffset, len));
        return responseStr(methodType);
    }

    /**
     * @Description public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
     * toffset - 该字符串 toffset的起始偏移量。
     * other - 字符串参数。
     * ooffset - 字符串参数 ooffset的起始偏移量。
     * len - 要比较的字符数
     * 测试两个字符串指定区域的子字符串是否相等（从 toffset 开始到 len 长度的字符 = 子字符串）,同时支持忽略大小写（不区分大小写）。
     * 这个String对象的子字符串与其他参数的子字符串进行比较。 如果这些子串表示相同的字符序列，结果是真的。 要比较的String对象的子String从索引toffset开始，长度为len 。 其他要比较的ooffset始于索引ooffset ，长度为len 。 结果是false当且仅当以下至少有一个是真的：
     * ignoreCase true - 不区分大小写，false - 区分大小写
     * toffset为负数。
     * ooffset是否定的。
     * toffset+len大于此String对象的长度。
     * ooffset+len大于另一个参数的长度。
     * @Author lianghongbin
     * @Date 9:32 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String regionMatches2(StringEnum methodType) {
        String string1 = StringConstant.STRING_BIG_LETTER;
        String string2 = StringConstant.STRING_BIG_LETTER_12;
        String str1 = StringConstant.STRING_SMALL_LETTER;
        String str2 = StringConstant.STRING_SMALL_LETTER_12;
        int toffset = 3;
        int len = 5;
        log.info("方法 = {}， 同为大写的两个字符串比较 = {}", methodType.getMethodName(), string1.regionMatches(true, toffset, string2, toffset, len));
        log.info("方法 = {}， 同为小写的两个字符串比较 = {}", methodType.getMethodName(), str1.regionMatches(true, toffset, string2, toffset, len));
        log.info("方法 = {}， 大小写不同的两个字符串比较 = {}", methodType.getMethodName(), string1.regionMatches(true, toffset, str2, toffset, len));
        log.info("方法 = {}， 大小写不同的两个字符串比较 = {}", methodType.getMethodName(), string1.regionMatches(false, toffset, str2, toffset, len));
        return responseStr(methodType);
    }

    /**
     * @Description public boolean startsWith(String prefix, int toffset)
     * 判断在指定索引处开始的此字符串的子字符串是否以指定的前缀开头。
     * prefix - 前缀。
     * toffset - 在哪里开始查找这个字符串。
     * @Author lianghongbin
     * @Date 9:44 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String startsWith1(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_BIG_LETTER_PREFIX_4;
        String str2 = StringConstant.STRING_BIG_LETTER;
        int toffset1 = 0;
        int toffset2 = 2;
        log.info("字符串 = {}，前缀字符串 = {}，方法 = {}，结果 = {}", string1, string2, methodType.getMethodName(), string2.startsWith(string1, toffset1));
        log.info("字符串 = {}，前缀字符串 = {}，方法 = {}，结果 = {}", str1, str2, methodType.getMethodName(), str2.startsWith(str1, toffset1));
        log.info("字符串 = {}，前缀字符串 = {}，方法 = {}，结果 = {}", str1, string2, methodType.getMethodName(), string2.startsWith(str1, toffset1));
        return responseStr(methodType);
    }

    /**
     * @Description public boolean startsWith(String prefix)
     * 测试此字符串是否以指定的前缀开头。
     * @Author lianghongbin
     * @Date 9:55 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String startsWith2(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_BIG_LETTER_PREFIX_4;
        String str2 = StringConstant.STRING_BIG_LETTER;
        log.info("字符串 = {}，前缀字符串 = {}，方法 = {}，结果 = {}", string2, string1, methodType.getMethodName(), string2.startsWith(string1));
        log.info("字符串 = {}，前缀字符串 = {}，方法 = {}，结果 = {}", str2, str1, methodType.getMethodName(), str2.startsWith(str1));
        log.info("字符串 = {}，前缀字符串 = {}，方法 = {}，结果 = {}", str2, string1, methodType.getMethodName(), string2.startsWith(str1));
        return responseStr(methodType);
    }

    /**
     * @Description public boolean endsWith(String suffix)
     * 此字符串是否以指定的后缀结尾
     * @Author lianghongbin
     * @Date `9:58` 2021/6/2
     * @Param methodType
     * @Return {@link java.lang.String}
     */
    @Override
    public String endsWith(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_BIG_LETTER_SUFFIX_4;
        String str2 = StringConstant.STRING_BIG_LETTER;
        log.info("字符串 = {}，后缀字符串 = {}，方法 = {}，结果 = {}", string2, string1, methodType.getMethodName(), string2.startsWith(string1));
        log.info("字符串 = {}，后缀字符串 = {}，方法 = {}，结果 = {}", str2, str1, methodType.getMethodName(), str2.startsWith(str1));
        log.info("字符串 = {}，后缀字符串 = {}，方法 = {}，结果 = {}", string2, str1, methodType.getMethodName(), string2.startsWith(str1));

        return responseStr(methodType);
    }

    /**
     * @Description public int hashCode()
     * 返回该字符串的hashCode
     * @Author lianghongbin
     * @Date 14:30 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String hashCode(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER;
        String string2 = StringConstant.STRING_NUMBER;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string1.hashCode());
        log.info("字符串 = {}，方法 = {}，结果 = {}", string2, methodType.getMethodName(), string2.hashCode());
        return responseStr(methodType);
    }

    /**
     * @Description public int indexOf(int ch)
     * 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 14:36 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String indexOf1(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string3 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        String str3 = StringConstant.STRING_NUMBER_SUFFIX_4;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(string1));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(string2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(str1));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.indexOf(str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.indexOf(str3));
        return responseStr(methodType);
    }

    /**
     * @Description public int indexOf(int ch, int fromIndex)
     * 从指定的索引处开始搜索，返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:13 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String indexOf2(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string3 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        String str3 = StringConstant.STRING_NUMBER_SUFFIX_4;
        int index = 3;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(string1, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(string2, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(str1, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.indexOf(str2, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.indexOf(str3, index));
        return responseStr(methodType);
    }

    /**
     * @Description public int indexOf(String str)
     * 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 14:36 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String indexOf3(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string3 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        String str3 = StringConstant.STRING_NUMBER_SUFFIX_4;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(string1));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(string2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(str1));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.indexOf(str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.indexOf(str3));
        return responseStr(methodType);
    }

    /**
     * @Description public int indexOf(String str, int fromIndex)
     * 从指定的索引处开始搜索，返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:13 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String indexOf4(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string3 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        String str3 = StringConstant.STRING_NUMBER_SUFFIX_4;
        int index = 3;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(string1, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(string2, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.indexOf(str1, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.indexOf(str2, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.indexOf(str3, index));
        return responseStr(methodType);
    }

    /**
     * @Description public int lastIndexOf(int ch)
     * 返回指定字符的最后一次出现的字符串中的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:23 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String lastIndexOf1(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string3 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        String str3 = StringConstant.STRING_NUMBER_SUFFIX_4;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(string1));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(string2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(str1));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.lastIndexOf(str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.lastIndexOf(str3));
        return responseStr(methodType);
    }

    /**
     * @Description public int lastIndexOf(int ch, int fromIndex)
     * 从指定的索引开始，返回指定字符的最后一次出现的字符串中的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:23 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String lastIndexOf2(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string3 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        String str3 = StringConstant.STRING_NUMBER_SUFFIX_4;
        int index = 3;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(string1, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(string2, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(str1, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.lastIndexOf(str2, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.lastIndexOf(str3, index));
        return responseStr(methodType);
    }

    /**
     * @Description public int lastIndexOf(String str)
     * 返回指定字符的最后一次出现的字符串中的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:23 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String lastIndexOf3(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string3 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        String str3 = StringConstant.STRING_NUMBER_SUFFIX_4;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(string1));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(string2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(str1));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.lastIndexOf(str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.lastIndexOf(str3));
        return responseStr(methodType);
    }

    /**
     * @Description public int lastIndexOf(String str, int fromIndex)
     * 从指定的索引开始，返回指定字符的最后一次出现的字符串中的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:23 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String lastIndexOf4(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER_PREFIX_4;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String string3 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        String str3 = StringConstant.STRING_NUMBER_SUFFIX_4;
        int index = 3;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(string1, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(string2, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string3, methodType.getMethodName(), string3.lastIndexOf(str1, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.lastIndexOf(str2, index));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.lastIndexOf(str3, index));
        return responseStr(methodType);
    }

    /**
     * @Description public String substring(int beginIndex)
     * 从指定索引处开始，返回一个字符串，该字符串是此字符串的子字符串。
     * @Author lianghongbin
     * @Date 15:29 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String subString1(StringEnum methodType) {
        int index = 3;
        String string = StringConstant.STRING_BIG_LETTER;
        String str = StringConstant.STRING_NUMBER;
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.substring(index));
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", str, methodType.getMethodName(), str.substring(index));
        return responseStr(methodType);
    }

    /**
     * @Description public String substring(int beginIndex, int endIndex)
     * 从初始索引处开始，到初始索引结束。返回一个字符串，该字符串是此字符串的子字符串。
     * @Author lianghongbin
     * @Date 15:32 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String subString2(StringEnum methodType) {
        int indexOf = 3;
        int indexEnd = 8;
        String string = StringConstant.STRING_BIG_LETTER;
        String str = StringConstant.STRING_NUMBER;
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.substring(indexOf, indexEnd));
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", str, methodType.getMethodName(), str.substring(indexOf, indexEnd));
        return responseStr(methodType);
    }

    /**
     * @Description public CharSequence subSequence(int beginIndex, int endIndex)
     * 从初始索引处开始，到初始索引结束。返回一个字符串序列，该字符串是此字符串的子字符串。
     * @Author lianghongbin
     * @Date 15:37 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String subSequence(StringEnum methodType) {
        int indexOf = 3;
        int indexEnd = 9;
        String string = StringConstant.STRING_BIG_LETTER;
        String str = StringConstant.STRING_NUMBER;
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.substring(indexOf, indexEnd));
        log.info("字符串 = {}， 方法 = {}， 结果 = {}", str, methodType.getMethodName(), str.substring(indexOf, indexEnd));
        return responseStr(methodType);
    }

    /**
     * @Description public String concat(String str)
     * 将指定的字符串连接到该字符串的末尾。
     * 如果参数字符串的长度为0 ，则返回此String对象。
     * @Author lianghongbin
     * @Date 15:40 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String concat(StringEnum methodType) {
        String string = StringConstant.STRING_SMALL_LETTER;
        String str = StringConstant.STRING_NUMBER_REVERSE;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string, methodType.getMethodName(), string.concat(str));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str, methodType.getMethodName(), str.concat(string));
        return responseStr(methodType);
    }

    /**
     * @Description public String replace(char oldChar, char newChar)
     * 用新字符newChar 替换所有的 旧字符oldChar 。
     * @Author lianghongbin
     * @Date 15:45 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String replace1(StringEnum methodType) {
        char numberChar = '3';
        char stringChar = 'a';
        String string = StringConstant.STRING_SMALL_LETTER;
        String str = StringConstant.STRING_NUMBER;
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.replace(stringChar, numberChar));
        log.info("字符串 = {}，方法 = {}， 结果 = {}", str, methodType.getMethodName(), str.replace(numberChar, stringChar));
        return responseStr(methodType);
    }

    /**
     * @Description public String replace(CharSequence target, CharSequence replacement)
     * 将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列。
     * 替换从字符串开始到结束，例如，在字符串“aaa”中用“b”替换“aa”将导致“ba”而不是“ab”。
     * @Author lianghongbin
     * @Date 15:55 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String replace2(StringEnum methodType) {
        String aaa = "aaa";
        String aa = "aa";
        String b = "b";
        String numberChar = "3";
        String stringChar = "a";
        String string = StringConstant.STRING_SMALL_LETTER;
        String str = StringConstant.STRING_NUMBER;
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string, methodType.getMethodName(), string.replace(stringChar, numberChar));
        log.info("字符串 = {}，方法 = {}， 结果 = {}", str, methodType.getMethodName(), str.replace(numberChar, stringChar));
        log.info("字符串 = {}，方法 = {}， 结果 = {}", aaa, methodType.getMethodName(), aaa.replace(aa, b));
        return responseStr(methodType);
    }

    /**
     * @Description public boolean matches(String regex)
     * 返回是否匹配指定的字符串，如果匹配则为true,否则为false
     * 若正则表达式的语法错误，则抛异常 PatternSyntaxException
     * @Author lianghongbin
     * @Date 16:00 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String matches(StringEnum methodType) {
        String regex = RegexConstant.CHINA_PHONE;
        String errorPhone = StringConstant.STRING_ERROR_PHONE_TYPE_2;
        String correctPhone = StringConstant.STRING_CORRECT_PHONE;
        log.info("字符串 = {}，方法 = {}，正确匹配的结果 = {}", errorPhone, methodType.getMethodName(), errorPhone.matches(regex));
        log.info("字符串 = {}，方法 = {}，错误匹配的结果 = {}", correctPhone, methodType.getMethodName(), correctPhone.matches(regex));
        return responseStr(methodType);
    }

    /**
     * @Description public boolean contains(CharSequence s)
     * 判断字符串是否包含某个字符串，若包含则返回true，反之返回false
     * @Author lianghongbin
     * @Date 16:19 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String contains(StringEnum methodType) {
        String string1 = StringConstant.STRING_SMALL_LETTER;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String str1 = StringConstant.STRING_NUMBER;
        String str2 = StringConstant.STRING_NUMBER_PREFIX_4;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string1.contains(string2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.contains(str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string1.contains(str2));
        return responseStr(methodType);
    }

    /**
     * @Description public String replaceFirst(String regex, String replacement)
     * 通过regex的正则表达式来匹配，如果匹配了则将原来的字符串替换为新的字符串replacement
     * @Author lianghongbin
     * @Date 17:08 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String replaceFirst(StringEnum methodType) {
        String string1 = "我是字符串 = " + StringConstant.STRING_SMALL_LETTER;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String str1 = StringConstant.STRING_NUMBER_REVERSE;
        String str2 = StringConstant.STRING_NUMBER_REVERSE_SUFFIX_4;
        String regex = "(.*)";
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string2.replaceFirst(regex + string1 + regex, string2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str2, methodType.getMethodName(), str2.replaceFirst(regex + str1 + regex, str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str2, methodType.getMethodName(), str2.replaceFirst(regex + string1 + regex, str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string2.replaceFirst(regex + string1 + regex, str1));
        return responseStr(methodType);
    }

    /**
     * @Description public String replaceAll(String regex, String replacement)
     * 通过regex的正则表达式来匹配，如果匹配了则将原来的字符串替换为新的字符串replacement
     * @Author lianghongbin
     * @Date 17:30 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String replaceAll(StringEnum methodType) {
        String string1 = "我是字符串 = " + StringConstant.STRING_SMALL_LETTER;
        String string2 = StringConstant.STRING_SMALL_LETTER_SUFFIX_4;
        String str1 = StringConstant.STRING_NUMBER_REVERSE;
        String str2 = StringConstant.STRING_NUMBER_REVERSE_SUFFIX_4;
        String regex = "(.*)";
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string2.replaceAll(regex + string1 + regex, string2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str2, methodType.getMethodName(), str2.replaceAll(regex + str1 + regex, str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", str2, methodType.getMethodName(), str2.replaceAll(regex + string1 + regex, str2));
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string2.replaceAll(regex + string1 + regex, str1));
        return responseStr(methodType);
    }

    /**
     * @Description public String[] split(String regex, int limit)
     * 按照正则表达式分割字段
     * regex - 分隔正则表达式
     * limit - 现在返回的结果数
     * @Author lianghongbin
     * @Date 18:06 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String split1(StringEnum methodType) {
        String string1 = StringConstant.STRING_SPLIT_TYPE_1;
        String string2 = StringConstant.STRING_SPLIT_TYPE_2;
        String str1 = StringConstant.STRING_SPLIT_TYPE_3;
        String str2 = StringConstant.STRING_SPLIT_TYPE_4;
        int limit1 = 4;
        int limit2 = 8;
        String[] strArray1 = string1.split(",", limit1);
        String[] strArray2 = string2.split(",", limit2);
        String[] strArray3 = str1.split(",", limit1);
        String[] strArray4 = str2.split(",", limit2);

        for (String string : strArray1) {
            log.info("strArray1: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string);
        }
        for (String string : strArray2) {
            log.info("strArray2: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string);
        }
        for (String string : strArray3) {
            log.info("strArray3: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string);
        }
        for (String string : strArray4) {
            log.info("strArray4: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string);
        }
        log.error("strArray1: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), strArray1);
        log.error("strArray2: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), strArray2);
        log.error("strArray3: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), strArray3);
        log.error("strArray4: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), strArray4);
        return responseStr(methodType);
    }

    /**
     * @Description public String[] split(String regex)
     * 按照正则表达式分割字段
     * @Author lianghongbin
     * @Date 18:18 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String split2(StringEnum methodType) {
        String string1 = StringConstant.STRING_SPLIT_TYPE_1;
        String string2 = StringConstant.STRING_SPLIT_TYPE_2;
        String str1 = StringConstant.STRING_SPLIT_TYPE_3;
        String str2 = StringConstant.STRING_SPLIT_TYPE_4;
        int limit1 = 4;
        int limit2 = 8;
        String[] strArray1 = string1.split(",");
        String[] strArray2 = string2.split(",");
        String[] strArray3 = str1.split(",");
        String[] strArray4 = str2.split(",");

        for (String string : strArray1) {
            log.info("strArray1: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string);
        }
        for (String string : strArray2) {
            log.info("strArray2: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string);
        }
        for (String string : strArray3) {
            log.info("strArray3: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string);
        }
        for (String string : strArray4) {
            log.info("strArray4: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string);
        }
        log.error("strArray1: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), strArray1);
        log.error("strArray2: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), strArray2);
        log.error("strArray3: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), strArray3);
        log.error("strArray4: 字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), strArray4);
        return responseStr(methodType);
    }

    /**
     * @Description public static String join(CharSequence delimiter, CharSequence... elements)
     * 通过某个符合连接一个或者多个字符串
     * @Author lianghongbin
     * @Date 18:22 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String join1(StringEnum methodType) {
        String[] strArray1 = StringConstant.STRINGS_SMALL_LETTER;
        String[] strArray2 = StringConstant.STRINGS_NUMBER;
        String string1 = String.join("-", strArray1);
        String string2 = String.join("+", strArray2);
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), string1);
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), string2);
        return responseStr(methodType);
    }

    /**
     * @Description public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
     * 通过某个符合连接一个或者多个字符串
     * @Author lianghongbin
     * @Date 20:45 2021/6/2
     * @Param methodType
     * @Return {@link java.lang.String}
     */
    @Override
    public String join2(StringEnum methodType) {
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("is");
        list.add("cool");
        String listMsg = String.join(" ", list);
        log.info("list: 方法 = {}， 结果 = {}", methodType.getMethodName(), listMsg);

        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("is");
        set.add("very");
        set.add("cool");
        String setMsg = String.join("-", set);
        log.info("set: 方法 = {}， 结果 = {}", methodType.getMethodName(), setMsg);
        return responseStr(methodType);
    }

    /**
     * @Description public String toLowerCase(Locale locale)
     * 将字符串全部转换为小写, Locale表示可以设置语言环境
     * @Author lianghongbin
     * @Date 9:15 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String toLowerCase1(StringEnum methodType) {
        String string1 = StringConstant.STRING_MIXTURE_TYPE_1;
        String string2 = StringConstant.STRING_MIXTURE_TYPE_2;
        String str1 = StringConstant.STRING_LETTER_TYPE_1;
        String str2 = StringConstant.STRING_LETTER_TYPE_2;
        Locale zh = Locale.CHINESE;
        Locale en = Locale.ENGLISH;
        log.info("zh:字符串 = {}，方法 = {}， 结果 = {}", string1, methodType.getMethodName(), string1.toLowerCase(zh));
        log.info("zh:字符串 = {}，方法 = {}， 结果 = {}", string2, methodType.getMethodName(), string2.toLowerCase(zh));
        log.info("zh:字符串 = {}，方法 = {}， 结果 = {}", str1, methodType.getMethodName(), str1.toLowerCase(zh));
        log.info("zh:字符串 = {}，方法 = {}， 结果 = {}", str2, methodType.getMethodName(), str2.toLowerCase(zh));
        log.info("en:字符串 = {}，方法 = {}， 结果 = {}", string1, methodType.getMethodName(), string1.toLowerCase(en));
        log.info("en:字符串 = {}，方法 = {}， 结果 = {}", string2, methodType.getMethodName(), string2.toLowerCase(en));
        log.info("en:字符串 = {}，方法 = {}， 结果 = {}", str1, methodType.getMethodName(), str1.toLowerCase(en));
        log.info("en:字符串 = {}，方法 = {}， 结果 = {}", str2, methodType.getMethodName(), str2.toLowerCase(en));
        return responseStr(methodType);
    }

    /**
     * @Description public String toLowerCase()
     * 将字符串全部转换为小写,使用默认的语言环境
     * @Author lianghongbin
     * @Date 10:20 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String toLowerCase2(StringEnum methodType) {
        String string1 = StringConstant.STRING_MIXTURE_TYPE_1;
        String string2 = StringConstant.STRING_MIXTURE_TYPE_2;
        String str1 = StringConstant.STRING_LETTER_TYPE_1;
        String str2 = StringConstant.STRING_LETTER_TYPE_2;
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string1, methodType.getMethodName(), string1.toLowerCase());
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string2, methodType.getMethodName(), string2.toLowerCase());
        log.info("字符串 = {}，方法 = {}， 结果 = {}", str1, methodType.getMethodName(), str1.toLowerCase());
        log.info("字符串 = {}，方法 = {}， 结果 = {}", str2, methodType.getMethodName(), str2.toLowerCase());
        return responseStr(methodType);
    }

    /**
     * @Description public String toUpperCase(Locale locale)
     * 将字符串全部转换为大写, Locale表示可以设置语言环境
     * @Author lianghongbin
     * @Date 10:24 2021/6/3
     * @Param methodType
     * @Return {@link java.lang.String}
     */
    @Override
    public String toUpperCase1(StringEnum methodType) {
        String string1 = StringConstant.STRING_MIXTURE_TYPE_1;
        String string2 = StringConstant.STRING_MIXTURE_TYPE_2;
        String str1 = StringConstant.STRING_LETTER_TYPE_1;
        String str2 = StringConstant.STRING_LETTER_TYPE_2;
        Locale zh = Locale.CHINESE;
        Locale en = Locale.ENGLISH;
        log.info("zh:字符串 = {}，方法 = {}， 结果 = {}", string1, methodType.getMethodName(), string1.toUpperCase(zh));
        log.info("zh:字符串 = {}，方法 = {}， 结果 = {}", string2, methodType.getMethodName(), string2.toUpperCase(zh));
        log.info("zh:字符串 = {}，方法 = {}， 结果 = {}", str1, methodType.getMethodName(), str1.toUpperCase(zh));
        log.info("zh:字符串 = {}，方法 = {}， 结果 = {}", str2, methodType.getMethodName(), str2.toUpperCase(zh));
        log.info("en:字符串 = {}，方法 = {}， 结果 = {}", string1, methodType.getMethodName(), string1.toUpperCase(en));
        log.info("en:字符串 = {}，方法 = {}， 结果 = {}", string2, methodType.getMethodName(), string2.toUpperCase(en));
        log.info("en:字符串 = {}，方法 = {}， 结果 = {}", str1, methodType.getMethodName(), str1.toUpperCase(en));
        log.info("en:字符串 = {}，方法 = {}， 结果 = {}", str2, methodType.getMethodName(), str2.toUpperCase(en));
        return responseStr(methodType);
    }

    /**
     * @Description public String toUpperCase()
     * 将字符串全部转换为大写,使用默认的语言环境
     * @Author lianghongbin
     * @Date 10:26 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String toUpperCase2(StringEnum methodType) {
        String string1 = StringConstant.STRING_MIXTURE_TYPE_1;
        String string2 = StringConstant.STRING_MIXTURE_TYPE_2;
        String str1 = StringConstant.STRING_LETTER_TYPE_1;
        String str2 = StringConstant.STRING_LETTER_TYPE_2;
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string1, methodType.getMethodName(), string1.toUpperCase());
        log.info("字符串 = {}，方法 = {}， 结果 = {}", string2, methodType.getMethodName(), string2.toUpperCase());
        log.info("字符串 = {}，方法 = {}， 结果 = {}", str1, methodType.getMethodName(), str1.toUpperCase());
        log.info("字符串 = {}，方法 = {}， 结果 = {}", str2, methodType.getMethodName(), str2.toUpperCase());
        return responseStr(methodType);
    }

    /**
     * @Description public String trim()
     * 删除字符串前后的空格
     * @Author lianghongbin
     * @Date 10:29 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String trim(StringEnum methodType) {
        String string1 = StringConstant.STRING_SPACE_TYPE_1;
        String string2 = StringConstant.STRING_SPACE_TYPE_2;
        String str1 = StringConstant.STRING_SPACE_TYPE_3;
        String str2 = StringConstant.STRING_SPACE_TYPE_4;
        String string = StringConstant.STRING_SPACE_TYPE_5;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string1.trim());
        log.info("字符串 = {}，方法 = {}，结果 = {}", string2, methodType.getMethodName(), string2.trim());
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.trim());
        log.info("字符串 = {}，方法 = {}，结果 = {}", str2, methodType.getMethodName(), str2.trim());
        log.info("字符串 = {}，方法 = {}，结果 = {}", string, methodType.getMethodName(), string.trim());
        return responseStr(methodType);
    }

    /**
     * @Description public String toString()
     * 将某个对象作为字符串返回，若此对象已经是字符串则返回对象本身
     * @Author lianghongbin
     * @Date 10:38 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String toString(StringEnum methodType) {
        Integer integer1 = IntegerConstant.INTEGER_NUMBER_1;
        Integer integer2 = IntegerConstant.INTEGER_MIXTURE_TYPE_2;
        String string = StringConstant.STRING_SMALL_LETTER;
        log.info("原来的值 = {}，class = {}，方法 = {}，结果 = {}，class = {}", integer1, integer1.getClass(), methodType.getMethodName(), integer1.toString(), integer1.toString().getClass());
        log.info("原来的值 = {}，class = {}，方法 = {}，结果 = {}，class = {}", integer2, integer2.getClass(), methodType.getMethodName(), integer2.toString(), integer2.toString().getClass());
        log.info("原来的值 = {}，class = {}，方法 = {}，结果 = {}，class = {}", string, string.getClass(), methodType.getMethodName(), string.toString(), string.toString().getClass());
        return responseStr(methodType);
    }

    /**
     * @Description public char[] toCharArray()
     * 将此字符串转换为新的字符数组。
     * @Author lianghongbin
     * @Date 10:58 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String toCharArray(StringEnum methodType) {
        String string1 = StringConstant.STRING_BIG_LETTER;
        String string2 = StringConstant.STRING_SMALL_LETTER;
        String str1 = StringConstant.STRING_NUMBER_REVERSE;
        String str2 = StringConstant.STRING_NUMBER;
        log.info("字符串 = {}，方法 = {}，结果 = {}", string1, methodType.getMethodName(), string1.toCharArray());
        log.info("字符串 = {}，方法 = {}，结果 = {}", string2, methodType.getMethodName(), string2.toCharArray());
        log.info("字符串 = {}，方法 = {}，结果 = {}", str1, methodType.getMethodName(), str1.toCharArray());
        log.info("字符串 = {}，方法 = {}，结果 = {}", str2, methodType.getMethodName(), str2.toCharArray());
        return responseStr(methodType);
    }

    /**
     * @Description format
     * 格式化字符串
     * @Author lianghongbin
     * @Date 11:52 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String format(StringEnum methodType) {
        String str=null;
        str=String.format("Hi,%s", "王力");
        System.out.println(str);
        str=String.format("Hi,%s:%s.%s", "王南","王力","王张");
        System.out.println(str);
        System.out.printf("字母a的大写是：%c %n", 'A');
        System.out.printf("3>7的结果是：%b %n", 3>7);
        System.out.printf("100的一半是：%d %n", 100/2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50*0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'A');
        return responseStr(methodType);
    }

    /**
     * @Description public static String valueOf(Object obj)
     * 返回 Object参数的字符串 Object形式。
     * @Author lianghongbin
     * @Date 11:58 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String valueOf1(StringEnum methodType) {
        Object object1 = StringConstant.STRING_SMALL_LETTER;
        Object object2 = IntegerConstant.INTEGER_MIXTURE_TYPE_2;
        Object object3 = 34L;
        log.info("值 = {}，方法 = {}，结果 = {}", object1, methodType.getMethodName(), String.valueOf(object1));
        log.info("值 = {}，方法 = {}，结果 = {}", object2, methodType.getMethodName(), String.valueOf(object2));
        log.info("值 = {}，方法 = {}，结果 = {}", object3, methodType.getMethodName(), String.valueOf(object3));
        return responseStr(methodType);
    }

    /**
     * @Description public static String valueOf(char[] data)
     * 返回char数组参数的字符串char形式。
     * 字符数组的内容被复制; 字符数组的后续修改不会影响返回的字符串。
     * @Author lianghongbin
     * @Date 12:06 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String valueOf2(StringEnum methodType) {
        char[] chars1 = StringConstant.STRING_BIG_LETTER.toCharArray();
        char[] chars2 = StringConstant.STRING_SMALL_LETTER.toCharArray();
        char[] chars3 = StringConstant.STRING_NUMBER.toCharArray();
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), String.valueOf(chars1));
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), String.valueOf(chars2));
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), String.valueOf(chars3));
        return responseStr(methodType);
    }

    /**
     * @Description public static String valueOf(char[] data, int offset, int count)
     * data - 字符数组。
     * offset - 偏移量。
     * count - 长度。
     * 返回char数组参数的特定子阵列的字符串char形式
     * @Author lianghongbin
     * @Date 12:13 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String valuesOf3(StringEnum methodType) {
        char[] chars1 = StringConstant.STRING_BIG_LETTER.toCharArray();
        char[] chars2 = StringConstant.STRING_SMALL_LETTER.toCharArray();
        char[] chars3 = StringConstant.STRING_NUMBER.toCharArray();
        int offset = 3;
        int count = 5;
        log.info("数组 = {}，方法 = {}，结果 = {}", chars1, methodType.getMethodName(), String.valueOf(chars1, offset, count));
        log.info("数组 = {}，方法 = {}，结果 = {}", chars2, methodType.getMethodName(), String.valueOf(chars2, offset, count));
        log.info("数组 = {}，方法 = {}，结果 = {}", chars3, methodType.getMethodName(), String.valueOf(chars3, offset, count));
        return responseStr(methodType);
    }

    /**
     * @Description public static String valueOf(boolean b)
     * 返回boolean参数的字符串形式的值 true/false
     * @Author lianghongbin
     * @Date 15:10 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String valueOf4(StringEnum methodType) {
        boolean t = true;
        boolean f = false;
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), String.valueOf(t));
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), String.valueOf(f));
        return responseStr(methodType);
    }

    /**
     * @Description public static String valueOf(char c)
     * 返回 char参数的字符串 char形式。
     * @Author lianghongbin
     * @Date 15:13 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String valueOf5(StringEnum methodType) {
        char a = 'a';
        char b = 'b';
        char A = 'A';
        char B = 'b';
        char other = '+';
        log.info("字符 = {}，方法 = {}， 结果 = {}", a, methodType.getMethodName(), String.valueOf(a));
        log.info("字符 = {}，方法 = {}， 结果 = {}", b, methodType.getMethodName(), String.valueOf(b));
        log.info("字符 = {}，方法 = {}， 结果 = {}", A, methodType.getMethodName(), String.valueOf(A));
        log.info("字符 = {}，方法 = {}， 结果 = {}", B, methodType.getMethodName(), String.valueOf(B));
        log.info("字符 = {}，方法 = {}， 结果 = {}", other, methodType.getMethodName(), String.valueOf(other));
        return responseStr(methodType);
    }

    /**
     * @Description public static String copyValueOf(char[] data, int offset, int count)
     * data - 字符数组。
     * offset - 偏移量。
     * count - 长度。
     * 返回char数组参数的特定子阵列的字符串char形式 - 相等于public static String valueOf(char[] data, int offset, int count)
     * @Author lianghongbin
     * @Date 15:04 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String copyValueOf1(StringEnum methodType) {
        char[] chars1 = StringConstant.STRING_BIG_LETTER.toCharArray();
        char[] chars2 = StringConstant.STRING_SMALL_LETTER.toCharArray();
        char[] chars3 = StringConstant.STRING_NUMBER.toCharArray();
        int offset = 3;
        int count = 5;
        log.info("数组 = {}，方法 = {}，结果 = {}", chars1, methodType.getMethodName(), String.copyValueOf(chars1, offset, count));
        log.info("数组 = {}，方法 = {}，结果 = {}", chars2, methodType.getMethodName(), String.copyValueOf(chars2, offset, count));
        log.info("数组 = {}，方法 = {}，结果 = {}", chars3, methodType.getMethodName(), String.copyValueOf(chars3, offset, count));
        return responseStr(methodType);
    }

    /**
     * @Description public static String copyValueOf(char[] data)
     * 返回char数组参数的字符串char形式。
     * 字符数组的内容被复制; 字符数组的后续修改不会影响返回的字符串。
     * 相等于 - public static String valueOf(char[] data)
     * @Author lianghongbin
     * @Date 15:06 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String copyValueOf2(StringEnum methodType) {
        char[] chars1 = StringConstant.STRING_BIG_LETTER.toCharArray();
        char[] chars2 = StringConstant.STRING_SMALL_LETTER.toCharArray();
        char[] chars3 = StringConstant.STRING_NUMBER.toCharArray();
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), String.copyValueOf(chars1));
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), String.copyValueOf(chars2));
        log.info("方法 = {}，结果 = {}", methodType.getMethodName(), String.copyValueOf(chars3));
        return responseStr(methodType);
    }

    /**
     * @Description public String intern()
     * （1） 当常量池中不存在字符串的引用，将这个对象的引用加入常量池，返回这个对象的引用。
     * （2） 当常量池中存在字符串的引用，返回这个对象的引用；
     * @Author lianghongbin
     * @Date 15:23 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String intern(StringEnum methodType) {
        String str1 = "计算机";
        String str2 = "计算机";
        System.out.println("str1==str2:" + (str1 == str2));
        String str3 = new String("计算机");
        System.out.println("str1==str3:" + (str1 == str3));
        System.out.println("str1==str3.intern():" + (str1 == str3.intern()));
        System.out.println("str2==str3.intern():" + (str2 == str3.intern()));
        String str4 = new String("计算机");
        System.out.println("str3==str4:" + (str3 == str4));
        System.out.println("str3.intern()==str4.intern():" + (str3.intern() == str4.intern()));
        String str5 = new StringBuilder("软件").append("工程").toString();
        System.out.println("str5.intern() == str5:" + (str5.intern() == str5));
        String str6 = new String(new StringBuilder("物联网").append("工程").toString());
        System.out.println("str6.intern() == str6:" + (str6.intern() == str6));
        String str7 = new String("物联网");
        System.out.println("str7.intern() == str7:" + (str7.intern() == str7));
        return responseStr(methodType);
    }

    /**
     * @Description
     * @Author lianghongbin
     * @Date 12:14 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    private String responseStr(StringEnum methodType) {
        return methodType.getMethodName() + responseStr;
    }
}
