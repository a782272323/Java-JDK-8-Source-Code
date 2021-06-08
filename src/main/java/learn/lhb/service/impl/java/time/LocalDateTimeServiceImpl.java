package learn.lhb.service.impl.java.time;

import learn.lhb.common.constant.ResponseConstant;
import learn.lhb.jdk.source.java.time.LocalDateTimeEnum;
import learn.lhb.service.java.time.LocalDateTimeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Author lianghongbin
 * @Date 11:51 2021/6/4
 * @Description
 */
@Slf4j
@Service
public class LocalDateTimeServiceImpl implements LocalDateTimeService {

    private static String responseStr = ResponseConstant.METHOD_PARENTHESES + ResponseConstant.RESPONSE_OK_PRINT_MSG;

    /**
     * @Description public static LocalDateTime now()
     * 获取当前的日期时间，从默认时区的系统时钟中
     * @Author lianghongbin
     * @Date 14:46 2021/6/4
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String now1(LocalDateTimeEnum methodType) {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("当前时间为 = {}", LocalDateTime.now());
        log.info("当前时间为 = {}", localDateTime);
        return responseStr(methodType);
    }

    /**
     * @Description public static LocalDateTime now(ZoneId zone)
     * 从指定时区的系统时钟获取当前的日期时间
     * @Author lianghongbin
     * @Date 19:01 2021/6/8
     * @Param methodType
     * @Return {@link String}
     */
    @Override
    public String now2(LocalDateTimeEnum methodType) {
        return responseStr(methodType);
    }

    private String responseStr(LocalDateTimeEnum methodType) {
        return methodType.getMethodName() + responseStr;
    }
}
