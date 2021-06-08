package learn.lhb.common.constant;

import learn.lhb.jdk.source.java.math.BigDecimalEnum;

import java.math.BigDecimal;

/**
 * @Author lianghongbin
 * @Date 15:18 2021/6/3
 * @Description Long 或者 long 常量类
 */
public class LongConstant {
    /**
     * Long
     */
    public static final Long LONG_BIG_TYPE_1 = 123456L;
    public static final Long LONG_BIG_TYPE_2 = 7890L;
    public static final Long LONG_BIG_TYPE_3 = BigDecimal.valueOf(0.1243).longValue();
    public static final Long LONG_BIG_TYPE_4 = BigDecimal.valueOf(1234.5678).longValue();
    public static final Long LONG_BIG_TYPE_5 = 1234567890L;

    /**
     * long
     */
    public static final Long LONG_SMALL_TYPE_1 = 123456L;
    public static final Long LONG_SMALL_TYPE_2 = 7890L;
    public static final Long LONG_SMALL_TYPE_3 = BigDecimal.valueOf(0.1243).longValue();
    public static final Long LONG_SMALL_TYPE_4 = BigDecimal.valueOf(1234.5678).longValue();
    public static final Long LONG_SMALL_TYPE_5 = 1234567890L;
}
