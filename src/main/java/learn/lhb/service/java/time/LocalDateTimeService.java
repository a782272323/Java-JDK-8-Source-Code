package learn.lhb.service.java.time;

import learn.lhb.jdk.source.java.time.LocalDateTimeEnum;

/**
 * @Author lianghongbin
 * @Date 11:50 2021/6/4
 * @Description 
 */
public interface LocalDateTimeService {

    /**
     * @Description public static LocalDateTime now()
     * 获取当前的日期时间，从默认时区的系统时钟中
     * @Author lianghongbin
     * @Date 14:46 2021/6/4
     * @Param methodType
     * @Return {@link String}
     */
    public String now1(LocalDateTimeEnum methodType);

    /**
     * @Description public static LocalDateTime now(ZoneId zone)
     * 从指定时区的系统时钟获取当前的日期时间
     * @Author lianghongbin
     * @Date 19:01 2021/6/8
     * @Param methodType
     * @Return {@link String}
     */
    public String now2(LocalDateTimeEnum methodType);
}
