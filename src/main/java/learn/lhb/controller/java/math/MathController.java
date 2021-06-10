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

    /**
     * @Description BigDecimal 使用案例
     * @Author lianghongbin
     * @Date 10:24 2021/6/9
     * @Param methodType
     * @Return {@link String}
     */
    @GetMapping("bigDecimal/case")
    public String bigDecimalCase(BigDecimalEnum methodType) {
        switch (methodType) {
            case VALUE_OF_1:
                return bigDecimalService.valueOf1(methodType);
            case VALUE_OF_2:
                return bigDecimalService.valueOf2(methodType);
            case VALUE_OF_3:
                return bigDecimalService.valueOf3(methodType);
            case ADD_1:
                return bigDecimalService.add1(methodType);
            case ADD_2:
                return bigDecimalService.add2(methodType);
            case SUBTRACT_1:
                return bigDecimalService.subtract1(methodType);
            case SUBTRACT_2:
                return bigDecimalService.subtract2(methodType);
            case MULTIPLY_1:
                return bigDecimalService.multiply1(methodType);
            case MULTIPLY_2:
                return bigDecimalService.multiply2(methodType);
            default:
                return ResponseConstant.RESPONSE_ERROR_PRINT_MSG;
        }
    }
}
