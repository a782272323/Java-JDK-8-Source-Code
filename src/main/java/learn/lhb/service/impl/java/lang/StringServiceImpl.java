package learn.lhb.service.impl.java.lang;

import learn.lhb.common.constant.ResponseConstant;
import learn.lhb.common.constant.StringConstant;
import learn.lhb.jdk.source.java.lang.string.StringEnum;
import learn.lhb.service.java.string.StringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
     * @Description charAt()方法，返回指定索引处的值
     * @Author lianghongbin
     * @Date 12:14 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    private String responseStr(StringEnum methodType) {
        return methodType.getMethodName() + responseStr;
    }
}
