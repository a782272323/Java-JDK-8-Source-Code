package learn.lhb.controller.java.lang;

import learn.lhb.common.constant.ResponseConstant;
import learn.lhb.jdk.source.java.lang.string.StringEnum;
import learn.lhb.service.java.string.StringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("java/lang")
@Slf4j
public class LangController {

    @Autowired
    private StringService stringService;

    @GetMapping("string/case")
    public String stringCase(StringEnum methodType) {
        switch (methodType) {
            case LENGTH:
                return stringService.length(methodType);
            case IS_EMPTY:
                return stringService.isEmpty(methodType);
            case CHAR_AT:
                return stringService.charAt(methodType);
            case CODE_POINT_AT:
                return stringService.codePointAt(methodType);
            case CODE_POINT_BEFORE:
                return stringService.codePointBefore(methodType);
            case OFFSET_BY_CODE_POINTS:
                return stringService.offsetByCodePoints(methodType);
            case CODE_POINT_COUNT:
                return stringService.codePointCount(methodType);
            case GET_CHARS:
                return stringService.getChars(methodType);
            case GET_BYTES_1:
                return stringService.getBytes1(methodType);
            default:
                return ResponseConstant.RESPONSE_ERROR_PRINT_MSG;
        }
    }
}
