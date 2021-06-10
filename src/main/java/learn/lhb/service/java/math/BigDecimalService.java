package learn.lhb.service.java.math;

import learn.lhb.jdk.source.java.math.BigDecimalEnum;

import java.math.BigDecimal;

/**
 * @Author lianghongbin
 * @Date 19:14 2021/6/8
 * @Description
 */
public interface BigDecimalService {

    /**
     * @Description public static BigDecimal valueOf(long unscaledVal, int scale)
     *
     * @Author lianghongbin
     * @Date 19:27 2021/6/8
     * @Param methodType
     * @Return {@link String}
     */
    public String valueOf1(BigDecimalEnum methodType);

    /**
     * @Description public static BigDecimal valueOf(long val)
     * 将long值转换为BigDecimal
     * @Author lianghongbin
     * @Date 9:38 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    public String valueOf2(BigDecimalEnum methodType);

    /**
     * @Description public static BigDecimal valueOf(double val)
     * 转换一个double成BigDecimal
     * @Author lianghongbin
     * @Date 10:27 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    public String valueOf3(BigDecimalEnum methodType);

    /**
     * @Description public BigDecimal add(BigDecimal augend)
     * 返回 BigDecimal ，其值是 (this + augend)
     * 进行加法运算
     * @Author lianghongbin
     * @Date 10:43 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    public String add1(BigDecimalEnum methodType);

    /**
     * @Description public BigDecimal add(BigDecimal augend, MathContext mc)
     * 返回 BigDecimal ，其值是 (this + augend)
     * 进行加法运算，根据上下文进行舍入
     * @Author lianghongbin
     * @Date 10:58 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    public String add2(BigDecimalEnum methodType);

    /**
     * @Description public BigDecimal subtract(BigDecimal subtrahend)
     * 返回 BigDecimal ，其值是 (this - subtrahend)
     * 进行减法运算
     * @Author lianghongbin
     * @Date 14:58 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    public String subtract1(BigDecimalEnum methodType);

    /**
     * @Description public BigDecimal subtract(BigDecimal subtrahend, MathContext mc)
     * 返回 BigDecimal ，其值是 (this - subtrahend)
     * 进行减法运算，根据上下文进行舍入
     * @Author lianghongbin
     * @Date 15:02 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    public String subtract2(BigDecimalEnum methodType);

    /**
     * @Description public BigDecimal multiply(BigDecimal multiplicand)
     * 返回 BigDecimal ，其值是 (this × multiplicand)
     * 进行乘法运算
     * @Author lianghongbin
     * @Date 15:08 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    public String multiply1(BigDecimalEnum methodType);

    /**
     * @Description public BigDecimal multiply(BigDecimal multiplicand, MathContext mc)
     * 进行乘法运算，根据上下文进行舍入
     * @Author lianghongbin
     * @Date 17:12 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    public String multiply2(BigDecimalEnum methodType);

    /**
     * @Description public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
     * 返回一个BigDecimal ，其值为(this / divisor)
     * divisor - 这个 BigDecimal要被划分的值。
     * scale - 要返回的 BigDecimal商的比例。
     * roundingMode - 舍入模式申请。
     * 进行除法运算
     * @Date 10:54 2021/6/10
     * @Param methodType
     * @Return {@link String}
     */
    public String divide1(BigDecimalEnum methodType);
}
