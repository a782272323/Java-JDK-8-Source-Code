package learn.lhb.service.impl.java.math;

import learn.lhb.common.constant.LongConstant;
import learn.lhb.common.constant.ResponseConstant;
import learn.lhb.jdk.source.java.math.BigDecimalEnum;
import learn.lhb.jdk.source.java.time.LocalDateTimeEnum;
import learn.lhb.service.java.math.BigDecimalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

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
        log.info("变量 = {}，方法 = {}，结果 = {}", long1, methodType.getMethodName(), BigDecimal.valueOf(long1));
        log.info("变量 = {}，方法 = {}，结果 = {}", long2, methodType.getMethodName(), BigDecimal.valueOf(long2));
        log.info("变量 = {}，方法 = {}，结果 = {}", long3, methodType.getMethodName(), BigDecimal.valueOf(long3));
        return responseStr(methodType);
    }

    private String responseStr(BigDecimalEnum methodType) {
        return methodType.getMethodName() + responseStr;
    }

}
