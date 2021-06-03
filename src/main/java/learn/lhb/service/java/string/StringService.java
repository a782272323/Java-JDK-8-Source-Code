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
     * 不区分大小写比较字符串
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

    /**
     * @Description public int compareToIgnoreCase(String str)
     * 按字典顺序比较两个字符串
     * @Author lianghongbin
     * @Date 19:50 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    public String compareToIgnoreCase(StringEnum methodType);

    /**
     * @Description public boolean regionMatches(int toffset, String other, int ooffset, int len)
     * toffset - 该字符串 toffset的起始偏移量。
     * other - 字符串参数。
     * ooffset - 字符串参数 ooffset的起始偏移量。
     * len - 要比较的字符数
     * 测试两个字符串指定区域的子字符串是否相等（从 toffset 开始到 len 长度的字符 = 子字符串）。
     * 这个String对象的子字符串与其他参数的子字符串进行比较。 如果这些子串表示相同的字符序列，结果是真的。 要比较的String对象的子String从索引toffset开始，长度为len 。 其他要比较的ooffset始于索引ooffset ，长度为len 。 结果是false当且仅当以下至少有一个是真的：
     * toffset为负数。
     * ooffset是否定的。
     * toffset+len大于此String对象的长度。
     * ooffset+len大于另一个参数的长度。
     * @Author lianghongbin
     * @Date 8:51 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String regionMatches1(StringEnum methodType);

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
    public String regionMatches2(StringEnum methodType);

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
    public String startsWith1(StringEnum methodType);

    /**
     * @Description public boolean startsWith(String prefix)
     * 测试此字符串是否以指定的前缀开头。
     * @Author lianghongbin
     * @Date 9:55 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String startsWith2(StringEnum methodType);

    /**
     * @Description public boolean endsWith(String suffix)
     * 此字符串是否以指定的后缀结尾
     * @Author lianghongbin
     * @Date `9:58` 2021/6/2
     * @Param methodType
     * @Return {@link java.lang.String}
     */
    public String endsWith(StringEnum methodType);

    /**
     * @Description public int hashCode()
     * 返回该字符串的hashCode
     * @Author lianghongbin
     * @Date 14:30 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String hashCode(StringEnum methodType);

    /**
     * @Description public int indexOf(int ch)
     * 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 14:36 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String indexOf1(StringEnum methodType);

    /**
     * @Description public int indexOf(int ch, int fromIndex)
     * 从指定的索引处开始搜索，返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:13 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String indexOf2(StringEnum methodType);

    /**
     * @Description public int indexOf(String str)
     * 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 14:36 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String indexOf3(StringEnum methodType);

    /**
     * @Description public int indexOf(String str, int fromIndex)
     * 从指定的索引处开始搜索，返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:13 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String indexOf4(StringEnum methodType);

    /**
     * @Description public int lastIndexOf(int ch)
     * 返回指定字符的最后一次出现的字符串中的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:23 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String lastIndexOf1(StringEnum methodType);

    /**
     * @Description public int lastIndexOf(int ch, int fromIndex)
     * 从指定的索引开始，返回指定字符的最后一次出现的字符串中的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:23 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String lastIndexOf2(StringEnum methodType);

    /**
     * @Description public int lastIndexOf(String str)
     * 返回指定字符的最后一次出现的字符串中的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:23 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String lastIndexOf3(StringEnum methodType);

    /**
     * @Description public int lastIndexOf(String str, int fromIndex)
     * 从指定的索引开始，返回指定字符的最后一次出现的字符串中的索引，如果此字符串中没有这样的字符，则返回 -1
     * @Author lianghongbin
     * @Date 15:23 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String lastIndexOf4(StringEnum methodType);

    /**
     * @Description public String substring(int beginIndex)
     * 从指定索引处开始，返回一个字符串，该字符串是此字符串的子字符串。
     * @Author lianghongbin
     * @Date 15:29 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String subString1(StringEnum methodType);

    /**
     * @Description public String substring(int beginIndex, int endIndex)
     * 从初始索引处开始，到初始索引结束。返回一个字符串，该字符串是此字符串的子字符串。
     * @Author lianghongbin
     * @Date 15:32 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String subString2(StringEnum methodType);

    /**
     * @Description public CharSequence subSequence(int beginIndex, int endIndex)
     * 从初始索引处开始，到初始索引结束。返回一个字符串序列，该字符串是此字符串的子字符串。
     * @Author lianghongbin
     * @Date 15:37 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String subSequence(StringEnum methodType);

    /**
     * @Description public String concat(String str)
     * 将指定的字符串连接到该字符串的末尾。
     * 如果参数字符串的长度为0 ，则返回此String对象。
     * @Author lianghongbin
     * @Date 15:40 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String concat(StringEnum methodType);

    /**
     * @Description public String replace(char oldChar, char newChar)
     * 用新字符newChar 替换所有的 旧字符oldChar 。
     * @Author lianghongbin
     * @Date 15:45 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String replace1(StringEnum methodType);

    /**
     * @Description public String replace(CharSequence target, CharSequence replacement)
     * 将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列。
     * 替换从字符串开始到结束，例如，在字符串“aaa”中用“b”替换“aa”将导致“ba”而不是“ab”。
     * @Author lianghongbin
     * @Date 15:55 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String replace2(StringEnum methodType);

    /**
     * @Description public boolean matches(String regex)
     * 返回是否匹配指定的字符串，如果匹配则为true,否则为false
     * 若正则表达式的语法错误，则抛异常 PatternSyntaxException
     * @Author lianghongbin
     * @Date 16:00 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String matches(StringEnum methodType);

    /**
     * @Description public boolean contains(CharSequence s)
     * 判断字符串是否包含某个字符串，若包含则返回true，反之返回false
     * @Author lianghongbin
     * @Date 16:19 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String contains(StringEnum methodType);

    /**
     * @Description public String replaceFirst(String regex, String replacement)
     * 通过regex的正则表达式来匹配，如果匹配了则将原来的字符串替换为新的字符串replacement
     * @Author lianghongbin
     * @Date 17:08 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String replaceFirst(StringEnum methodType);

    /**
     * @Description public String replaceAll(String regex, String replacement)
     * 通过regex的正则表达式来匹配，如果匹配了则将原来的字符串替换为新的字符串replacement
     * @Author lianghongbin
     * @Date 17:30 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String replaceAll(StringEnum methodType);

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
    public String split1(StringEnum methodType);

    /**
     * @Description public String[] split(String regex)
     * 按照正则表达式分割字段
     * @Author lianghongbin
     * @Date 18:18 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String split2(StringEnum methodType);

    /**
     * @Description public static String join(CharSequence delimiter, CharSequence... elements)
     * 通过某个符合连接一个或者多个字符串
     * @Author lianghongbin
     * @Date 18:22 2021/6/2
     * @Param methodType
     * @Return {@link String}
     */
    public String join1(StringEnum methodType);

    /**
     * @Description public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
     * 通过某个符合连接一个或者多个字符串
     * @Author lianghongbin
     * @Date 20:45 2021/6/2
     * @Param methodType
     * @Return {@link java.lang.String}
     */
    public String join2(StringEnum methodType);

    /**
     * @Description public String toLowerCase(Locale locale)
     * 将字符串全部转换为小写, Locale表示可以设置语言环境
     * @Author lianghongbin
     * @Date 9:15 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String toLowerCase1(StringEnum methodType);

    /**
     * @Description public String toLowerCase()
     * 将字符串全部转换为小写,使用默认的语言环境
     * @Author lianghongbin
     * @Date 10:20 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String toLowerCase2(StringEnum methodType);

    /**
     * @Description public String toUpperCase(Locale locale)
     * 将字符串全部转换为大写, Locale表示可以设置语言环境
     * @Author lianghongbin
     * @Date 10:24 2021/6/3
     * @Param methodType
     * @Return {@link java.lang.String}
     */
    public String toUpperCase1(StringEnum methodType);

    /**
     * @Description public String toUpperCase()
     * 将字符串全部转换为大写,使用默认的语言环境
     * @Author lianghongbin
     * @Date 10:26 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String toUpperCase2(StringEnum methodType);

    /**
     * @Description public String trim()
     * 删除字符串前后的空格
     * @Author lianghongbin
     * @Date 10:29 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String trim(StringEnum methodType);

    /**
     * @Description public String toString()
     * 将某个对象作为字符串返回，若此对象已经是字符串则返回对象本身
     * @Author lianghongbin
     * @Date 10:38 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String toString(StringEnum methodType);

    /**
     * @Description public char[] toCharArray()
     * 将此字符串转换为新的字符数组。
     * @Author lianghongbin
     * @Date 10:58 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String toCharArray(StringEnum methodType);

    /**
     * @Description format
     * 格式化字符串
     * @Author lianghongbin
     * @Date 11:52 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String format(StringEnum methodType);

    /**
     * @Description public static String valueOf(Object obj)
     * 返回 Object参数的字符串 Object形式。
     * @Author lianghongbin
     * @Date 11:58 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String valueOf1(StringEnum methodType);

    /**
     * @Description public static String valueOf(char[] data)
     * 返回char数组参数的字符串char形式。
     * 字符数组的内容被复制; 字符数组的后续修改不会影响返回的字符串。
     * @Author lianghongbin
     * @Date 12:06 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String valueOf2(StringEnum methodType);

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
    public String valuesOf3(StringEnum methodType);

    /**
     * @Description public static String valueOf(boolean b)
     * 返回boolean参数的字符串形式的值 true/false
     * @Author lianghongbin
     * @Date 15:10 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String valueOf4(StringEnum methodType);

    /**
     * @Description public static String valueOf(char c)
     * 返回 char参数的字符串 char形式。
     * @Author lianghongbin
     * @Date 15:13 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String valueOf5(StringEnum methodType);

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
    public String copyValueOf1(StringEnum methodType);

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
    public String copyValueOf2(StringEnum methodType);

    /**
     * @Description public String intern()
     * （1） 当常量池中不存在字符串的引用，将这个对象的引用加入常量池，返回这个对象的引用。
     * （2） 当常量池中存在字符串的引用，返回这个对象的引用；
     * @Author lianghongbin
     * @Date 15:23 2021/6/3
     * @Param methodType
     * @Return {@link String}
     */
    public String intern(StringEnum methodType);
}
