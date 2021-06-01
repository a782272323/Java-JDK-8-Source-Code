package learn.lhb.service.java.string;

import learn.lhb.jdk.source.java.lang.string.StringEnum;

/**
 * @Author lianghongbin
 * @Date 11:01 2021/5/31
 * @Description
 */
public interface StringService {

    /**
     * @Description public int length()方法
     * 返回字符串的长度
     * @Author lianghongbin
     * @Date 11:17 2021/5/31
     * @param methodType
     * @Return {@link String}
     */
    public String length(StringEnum methodType);

    /**
     * @Description public boolean isEmpty()方法
     * 判断字符串是否是空字符串，前提是字符串不能为 null
     * @Author lianghongbin
     * @Date 11:19 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    public String isEmpty(StringEnum methodType);

    /**
     * @Description public char charAt(int index)方法
     * 返回指定索引处的值
     * @Author lianghongbin
     * @Date 12:14 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    public String charAt(StringEnum methodType);

    /**
     * @Description public int codePointAt(int index)方法
     * 返回指定索引处的 Unicode 值
     * @Author lianghongbin
     * @Date 14:58 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    public String codePointAt(StringEnum methodType);

    /**
     * @Description public int codePointBefore(int index)方法
     * 返回指定索引处的前一个字符的 Unicode 值，索引值从1到length
     * @Author lianghongbin
     * @Date 15:08 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    public String codePointBefore(StringEnum methodType);

    /**
     * @Description public int offsetByCodePoints(int index, int codePointOffset)方法
     * 返回此 String 中从给定的 index 处偏移 codePointOffset 个代码点的索引。
     * @Author lianghongbin
     * @Date 15:24 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    public String offsetByCodePoints(StringEnum methodType);

    /**
     * @Description public int codePointCount(int beginIndex, int endIndex)
     * 返回 beginIndex 到 endIndex 的长度
     * @Author lianghongbin
     * @Date 15:35 2021/5/31
     * @Param methodType
     * @Return {@link String}
     */
    public String codePointCount(StringEnum methodType);

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
    public String getChars(StringEnum methodType);

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
    public String getBytes1(StringEnum methodType);

    /**
     * @Description public byte[] getBytes(String charsetName) throws UnsupportedEncodingException
     * 使用命名的字符集将此String编码为字节序列，将结果存储到新的字节数组中
     * @Author lianghongbin
     * @Date 14:13 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    public String getBytes2(StringEnum methodType) throws Exception;

    /**
     * @Description public byte[] getBytes(Charset charset)
     * 使用平台的默认字符集将此String编码为字节序列，将结果存储到新的字节数组中
     * @Author lianghongbin
     * @Date 14:25 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    public String getBytes3(StringEnum methodType) throws Exception;

    /**
     * @Description public byte[] getBytes()
     * 使用平台的默认字符集将此String编码为字节序列，将结果存储到新的字节数组中。
     * @Author lianghongbin
     * @Date 14:30 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    public String getBytes4(StringEnum methodType);

    /**
     * @Description public boolean equals(Object anObject)
     * 将此字符串与指定对象进行比较。 其结果是true当且仅当该参数不是null并且是String对象，表示相同的字符序列作为该对象。
     * @Author lianghongbin
     * @Date 14:35 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    public String equals(StringEnum methodType);

    /**
     * @Description public boolean contentEquals(StringBuffer sb)
     * 将此字符串与指定的StringBuffer进行StringBuffer 。
     * @Author lianghongbin
     * @Date 14:53 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    public String contentEquals(StringEnum methodType);

    /**
     * @Description public boolean equalsIgnoreCase(String anotherString)
     * 将此String与其他String比较,判断两个字符串是不是同一个，不仅仅是值一样
     * @Author lianghongbin
     * @Date 15:00 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    public String equalsIgnoreCase(StringEnum methodType);

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
    public String compareTo(StringEnum methodType);
}
