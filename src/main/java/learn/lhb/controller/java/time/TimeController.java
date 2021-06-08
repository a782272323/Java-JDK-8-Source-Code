package learn.lhb.controller.java.time;

import learn.lhb.common.constant.ResponseConstant;
import learn.lhb.jdk.source.java.time.LocalDateTimeEnum;
import learn.lhb.service.java.time.LocalDateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lianghongbin
 * @Date 9:30 2021/6/4
 * @Description
 */
@RestController
@RequestMapping("java/time")
public class TimeController {

    @Autowired
    private LocalDateTimeService localDateTimeService;

    @GetMapping("localDateTime/case")
    public String localDateTimeCase(LocalDateTimeEnum methodType) {
        switch (methodType) {
            case NOW_1:
                return localDateTimeService.now1(methodType);
            default:
                return ResponseConstant.RESPONSE_ERROR_PRINT_MSG;
        }
    }
}
