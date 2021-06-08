package learn.lhb.controller.java.math;

import learn.lhb.common.constant.ResponseConstant;
import learn.lhb.jdk.source.java.math.BigDecimalEnum;
import learn.lhb.service.java.math.BigDecimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lianghongbin
 * @Date 19:15 2021/6/8
 * @Description
 */
@RestController
@RequestMapping("java/math")
public class MathController {
    @Autowired
    private BigDecimalService bigDecimalService;

    @GetMapping("bigDecimal/case")
    public String bigDecimalCase(BigDecimalEnum methodType) {
        switch (methodType) {
            case VALUE_OF_1:
                return bigDecimalService.valueOf1(methodType);
            default:
                return ResponseConstant.RESPONSE_ERROR_PRINT_MSG;
        }
    }
}
