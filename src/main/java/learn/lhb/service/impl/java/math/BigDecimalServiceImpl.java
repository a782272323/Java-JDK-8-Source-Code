package learn.lhb.service.impl.java.math;

import learn.lhb.common.constant.DoubleConstant;
import learn.lhb.common.constant.LongConstant;
import learn.lhb.common.constant.ResponseConstant;
import learn.lhb.common.constant.StringConstant;
import learn.lhb.jdk.source.java.math.BigDecimalEnum;
import learn.lhb.jdk.source.java.time.LocalDateTimeEnum;
import learn.lhb.service.java.math.BigDecimalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @Author lianghongbin
 * @Date 19:15 2021/6/8
 * @Description 
 */
@Service
@Slf4j
public class BigDecimalServiceImpl implements BigDecimalService {

    private static String responseStr = ResponseConstant.METHOD_PARENTHESES + ResponseConstant.RESPONSE_OK_PRINT_MSG;

    @Override
    public String valueOf1(BigDecimalEnum methodType) {
        Long long1 = LongConstant.LONG_BIG_TYPE_1;
        Long long2 = LongConstant.LONG_SMALL_TYPE_1;
        Long long3 = LongConstant.LONG_SMALL_TYPE_5;
        int offset = 3;
        log.info("变量 = {}，方法 = {}，结果 = {}", long1, methodType.getMethodName(), BigDecimal.valueOf(long1, offset));
        log.info("变量 = {}，方法 = {}，结果 = {}", long2, methodType.getMethodName(), BigDecimal.valueOf(long2, offset));
        log.info("变量 = {}，方法 = {}，结果 = {}", long3, methodType.getMethodName(), BigDecimal.valueOf(long3, offset));
        return responseStr(methodType);
    }

    /**
     * @Description public static BigDecimal valueOf(long val)
     * 将long值转换为BigDecimal
     * @Author lianghongbin
     * @Date 9:38 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String valueOf2(BigDecimalEnum methodType) {
        Long long1 = LongConstant.LONG_BIG_TYPE_1;
        Long long2 = LongConstant.LONG_SMALL_TYPE_1;
        Long long3 = LongConstant.LONG_SMALL_TYPE_5;
        log.info("变量 = {}，方法 = {}，结果 = {}", long1, methodType.getMethodName(), BigDecimal.valueOf(long1));
        log.info("变量 = {}，方法 = {}，结果 = {}", long2, methodType.getMethodName(), BigDecimal.valueOf(long2));
        log.info("变量 = {}，方法 = {}，结果 = {}", long3, methodType.getMethodName(), BigDecimal.valueOf(long3));
        return responseStr(methodType);
    }

    /**
     * @Description public static BigDecimal valueOf(double val)
     * 转换一个double成BigDecimal
     * @Author lianghongbin
     * @Date 10:27 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String valueOf3(BigDecimalEnum methodType) {
        Double double1 = DoubleConstant.DOUBLE_BIG_TYPE_1;
        double double2 = DoubleConstant.DOUBLE_SMALL_TYPE_1;
        Double d1 = DoubleConstant.DOUBLE_BIG_TYPE_4;
        double d2 = DoubleConstant.DOUBLE_SMALL_TYPE_4;
        Double d = DoubleConstant.DOUBLE_BIG_TYPE_5;
        log.info("变量 = {}，方法 = {}，结果 = {}", double1, methodType.getMethodName(), BigDecimal.valueOf(double1));
        log.info("变量 = {}，方法 = {}，结果 = {}", double2, methodType.getMethodName(), BigDecimal.valueOf(double2));
        log.info("变量 = {}，方法 = {}，结果 = {}", d1, methodType.getMethodName(), BigDecimal.valueOf(d1));
        log.info("变量 = {}，方法 = {}，结果 = {}", d2, methodType.getMethodName(), BigDecimal.valueOf(d2));
        log.info("变量 = {}，方法 = {}，结果 = {}", d, methodType.getMethodName(), BigDecimal.valueOf(d));
        return responseStr(methodType);
    }

    /**
     * @Description public BigDecimal add(BigDecimal augend)
     * 返回 BigDecimal ，其值是 (this + augend)
     * 进行加法运算
     * @Author lianghongbin
     * @Date 10:43 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String add1(BigDecimalEnum methodType) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_3);
        BigDecimal bigDecimal3 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_4);
        BigDecimal bd1 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_1);
        BigDecimal bd2 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_3);
        BigDecimal bd3 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_4);
        log.info("BigDecimal加法运算，方法 = {}，{}.add({}) = {}", methodType.getMethodName(), bigDecimal1, bigDecimal2, bigDecimal1.add(bigDecimal2));
        log.info("BigDecimal加法运算，方法 = {}，{}.add({}) = {}", methodType.getMethodName(), bigDecimal1, bigDecimal3, bigDecimal1.add(bigDecimal3));
        log.info("BigDecimal加法运算，方法 = {}，{}.add({}) = {}", methodType.getMethodName(), bigDecimal1, bd1, bigDecimal1.add(bd1));
        log.info("BigDecimal加法运算，方法 = {}，{}.add({}) = {}", methodType.getMethodName(), bigDecimal1, bd2, bigDecimal1.add(bd2));
        log.info("BigDecimal加法运算，方法 = {}，{}.add({}) = {}", methodType.getMethodName(), bigDecimal1, bd3, bigDecimal1.add(bd3));
        log.info("BigDecimal加法运算，方法 = {}，{}.add({}) = {}", methodType.getMethodName(), bd1, bd3, bd1.add(bd3));
        log.info("BigDecimal加法运算，方法 = {}，{}.add({}) = {}", methodType.getMethodName(), bd2, bd3, bd2.add(bd3));
        return responseStr(methodType);
    }

    /**
     * @Description public BigDecimal add(BigDecimal augend, MathContext mc)
     * 返回 BigDecimal ，其值是 (this + augend)
     * 进行加法运算，根据上下文进行舍入
     * @Author lianghongbin
     * @Date 10:58 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String add2(BigDecimalEnum methodType) {
        BigDecimal bg1, bg2, bg3, bg4;
        bg1 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_2);
        bg2 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_3);
        bg3 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_4);
        bg4 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_1);
        MathContext mc1 = new MathContext(3);
        MathContext mc2 = new MathContext(2);
        log.info("方法 = {}，{}.add({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc1, bg1.add(bg2, mc1));
        log.info("方法 = {}，{}.add({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc2, bg1.add(bg2, mc2));
        log.info("方法 = {}，{}.add({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc1, bg1.add(bg2, mc1));
        log.info("方法 = {}，{}.add({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc2, bg1.add(bg2, mc2));
        log.info("方法 = {}，{}.add({}, {}) = {}", methodType.getMethodName(), bg1, bg3, mc1, bg1.add(bg3, mc1));
        log.info("方法 = {}，{}.add({}, {}) = {}", methodType.getMethodName(), bg1, bg3, mc2, bg1.add(bg3, mc2));
        log.info("方法 = {}，{}.add({}, {}) = {}", methodType.getMethodName(), bg1, bg4, mc1, bg1.add(bg4, mc1));
        log.info("方法 = {}，{}.add({}, {}) = {}", methodType.getMethodName(), bg1, bg4, mc2, bg1.add(bg4, mc2));
        return responseStr(methodType);
    }

    /**
     * @Description public BigDecimal subtract(BigDecimal subtrahend)
     * 返回 BigDecimal ，其值是 (this - subtrahend)
     * 进行减法运算
     * @Author lianghongbin
     * @Date 14:58 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String subtract1(BigDecimalEnum methodType) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_3);
        BigDecimal bigDecimal3 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_4);
        BigDecimal bd1 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_1);
        BigDecimal bd2 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_3);
        BigDecimal bd3 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_4);
        log.info("BigDecimal加法运算，方法 = {}，{}.subtract({}) = {}", methodType.getMethodName(), bigDecimal1, bigDecimal2, bigDecimal1.subtract(bigDecimal2));
        log.info("BigDecimal加法运算，方法 = {}，{}.subtract({}) = {}", methodType.getMethodName(), bigDecimal1, bigDecimal3, bigDecimal1.subtract(bigDecimal3));
        log.info("BigDecimal加法运算，方法 = {}，{}.subtract({}) = {}", methodType.getMethodName(), bigDecimal1, bd1, bigDecimal1.subtract(bd1));
        log.info("BigDecimal加法运算，方法 = {}，{}.subtract({}) = {}", methodType.getMethodName(), bigDecimal1, bd2, bigDecimal1.subtract(bd2));
        log.info("BigDecimal加法运算，方法 = {}，{}.subtract({}) = {}", methodType.getMethodName(), bigDecimal1, bd3, bigDecimal1.subtract(bd3));
        log.info("BigDecimal加法运算，方法 = {}，{}.subtract({}) = {}", methodType.getMethodName(), bd1, bd3, bd1.subtract(bd3));
        log.info("BigDecimal加法运算，方法 = {}，{}.subtract({}) = {}", methodType.getMethodName(), bd2, bd3, bd2.subtract(bd3));
        return responseStr(methodType);
    }

    /**
     * @Description public BigDecimal subtract(BigDecimal subtrahend, MathContext mc)
     * 返回 BigDecimal ，其值是 (this - subtrahend)
     * 进行减法运算，根据上下文进行舍入
     * @Author lianghongbin
     * @Date 15:02 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String subtract2(BigDecimalEnum methodType) {
        BigDecimal bg1, bg2, bg3, bg4;
        bg1 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_2);
        bg2 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_3);
        bg3 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_4);
        bg4 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_1);
        MathContext mc1 = new MathContext(3);
        MathContext mc2 = new MathContext(2);
        log.info("方法 = {}，{}.subtract({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc1, bg1.subtract(bg2, mc1));
        log.info("方法 = {}，{}.subtract({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc2, bg1.subtract(bg2, mc2));
        log.info("方法 = {}，{}.subtract({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc1, bg1.subtract(bg2, mc1));
        log.info("方法 = {}，{}.subtract({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc2, bg1.subtract(bg2, mc2));
        log.info("方法 = {}，{}.subtract({}, {}) = {}", methodType.getMethodName(), bg1, bg3, mc1, bg1.subtract(bg3, mc1));
        log.info("方法 = {}，{}.subtract({}, {}) = {}", methodType.getMethodName(), bg1, bg3, mc2, bg1.subtract(bg3, mc2));
        log.info("方法 = {}，{}.subtract({}, {}) = {}", methodType.getMethodName(), bg1, bg4, mc1, bg1.subtract(bg4, mc1));
        log.info("方法 = {}，{}.subtract({}, {}) = {}", methodType.getMethodName(), bg1, bg4, mc2, bg1.subtract(bg4, mc2));
        return responseStr(methodType);
    }

    /**
     * @Description public BigDecimal multiply(BigDecimal multiplicand)
     * 返回 BigDecimal ，其值是 (this × multiplicand)
     * 进行乘法运算
     * @Author lianghongbin
     * @Date 15:08 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String multiply1(BigDecimalEnum methodType) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_3);
        BigDecimal bigDecimal3 = BigDecimal.valueOf(LongConstant.LONG_BIG_TYPE_4);
        BigDecimal bd1 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_1);
        BigDecimal bd2 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_3);
        BigDecimal bd3 = BigDecimal.valueOf(DoubleConstant.DOUBLE_BIG_TYPE_4);
        log.info("BigDecimal加法运算，方法 = {}，{}.multiply({}) = {}", methodType.getMethodName(), bigDecimal1, bigDecimal2, bigDecimal1.multiply(bigDecimal2));
        log.info("BigDecimal加法运算，方法 = {}，{}.multiply({}) = {}", methodType.getMethodName(), bigDecimal1, bigDecimal3, bigDecimal1.multiply(bigDecimal3));
        log.info("BigDecimal加法运算，方法 = {}，{}.multiply({}) = {}", methodType.getMethodName(), bigDecimal1, bd1, bigDecimal1.multiply(bd1));
        log.info("BigDecimal加法运算，方法 = {}，{}.multiply({}) = {}", methodType.getMethodName(), bigDecimal1, bd2, bigDecimal1.multiply(bd2));
        log.info("BigDecimal加法运算，方法 = {}，{}.multiply({}) = {}", methodType.getMethodName(), bigDecimal1, bd3, bigDecimal1.multiply(bd3));
        log.info("BigDecimal加法运算，方法 = {}，{}.multiply({}) = {}", methodType.getMethodName(), bd1, bd3, bd1.multiply(bd3));
        log.info("BigDecimal加法运算，方法 = {}，{}.multiply({}) = {}", methodType.getMethodName(), bd2, bd3, bd2.multiply(bd3));
        return responseStr(methodType);
    }

    /**
     * @Description public BigDecimal multiply(BigDecimal multiplicand, MathContext mc)
     * 进行乘法运算，根据上下文进行舍入
     * @Author lianghongbin
     * @Date 17:12 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String multiply2(BigDecimalEnum methodType) {
        BigDecimal bg1, bg2, bg3, bg4;
        bg1 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_2);
        bg2 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_3);
        bg3 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_4);
        bg4 = new BigDecimal(StringConstant.STRING_BIG_DECIMAL_TYPE_1);
        MathContext mc1 = new MathContext(3);
        MathContext mc2 = new MathContext(2);
        log.info("方法 = {}，{}.multiply({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc1, bg1.multiply(bg2, mc1));
        log.info("方法 = {}，{}.multiply({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc2, bg1.multiply(bg2, mc2));
        log.info("方法 = {}，{}.multiply({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc1, bg1.multiply(bg2, mc1));
        log.info("方法 = {}，{}.multiply({}, {}) = {}", methodType.getMethodName(), bg1, bg2, mc2, bg1.multiply(bg2, mc2));
        log.info("方法 = {}，{}.multiply({}, {}) = {}", methodType.getMethodName(), bg1, bg3, mc1, bg1.multiply(bg3, mc1));
        log.info("方法 = {}，{}.multiply({}, {}) = {}", methodType.getMethodName(), bg1, bg3, mc2, bg1.multiply(bg3, mc2));
        log.info("方法 = {}，{}.multiply({}, {}) = {}", methodType.getMethodName(), bg1, bg4, mc1, bg1.multiply(bg4, mc1));
        log.info("方法 = {}，{}.multiply({}, {}) = {}", methodType.getMethodName(), bg1, bg4, mc2, bg1.multiply(bg4, mc2));
        return responseStr(methodType);
    }

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
    @Override
    public String divide1(BigDecimalEnum methodType) {

        return responseStr(methodType);
    }

    private String responseStr(BigDecimalEnum methodType) {
        return methodType.getMethodName() + responseStr;
    }

}
