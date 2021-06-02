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

    /**
     * @Description String 的使用案例
     * @Author lianghongbin
     * @Date 14:16 2021/6/1
     * @Param methodType
     * @Return {@link String}
     */
    @GetMapping("string/case")
    public String stringCase(StringEnum methodType) throws Exception{
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
            case GET_BYTES_2:
                return stringService.getBytes2(methodType);
            case GET_BYTES_3:
                return stringService.getBytes3(methodType);
            case GET_BYTES_4:
                return stringService.getBytes4(methodType);
            case EQUALS:
                return stringService.equals(methodType);
            case CONTENT_EQUALS:
                return stringService.contentEquals(methodType);
            case EQUALS_IGNORE_CASE:
                return stringService.equalsIgnoreCase(methodType);
            case COMPARE_TO:
                return stringService.compareTo(methodType);
            case COMPARE_TO_IGNORE_CASE:
                return stringService.compareToIgnoreCase(methodType);
            case REGION_MATCHES_1:
                return stringService.regionMatches1(methodType);
            case REGION_MATCHES_2:
                return stringService.regionMatches2(methodType);
            case STARTS_WITH_1:
                return stringService.startsWith1(methodType);
            case STARTS_WITH_2:
                return stringService.startsWith2(methodType);
            case ENDS_WITH:
                return stringService.endsWith(methodType);
            case HASH_CODE:
                return stringService.hashCode(methodType);
            case INDEX_OF_1:
                return stringService.indexOf1(methodType);
            case INDEX_OF_2:
                return stringService.indexOf2(methodType);
            case INDEX_OF_3:
                return stringService.indexOf3(methodType);
            case INDEX_OF_4:
                return stringService.indexOf4(methodType);
            case LAST_INDEX_OF_1:
                return stringService.lastIndexOf1(methodType);
            case LAST_INDEX_OF_2:
                return stringService.lastIndexOf2(methodType);
            case LAST_INDEX_OF_3:
                return stringService.lastIndexOf3(methodType);
            case LAST_INDEX_OF_4:
                return stringService.lastIndexOf4(methodType);
            case SUBSTRING_1:
                return stringService.subString1(methodType);
            case SUBSTRING_2:
                return stringService.subString2(methodType);
            case SUB_SEQUENCE:
                return stringService.subSequence(methodType);
            case CONCAT:
                return stringService.concat(methodType);
            case REPLACE_1:
                return stringService.replace1(methodType);
            case REPLACE_2:
                return stringService.replace2(methodType);
            case MATCHES:
                return stringService.matches(methodType);
            case CONTAINS:
                return stringService.contains(methodType);
            case REPLACE_FIRST:
                return stringService.replaceFirst(methodType);
            case REPLACE_ALL:
                return stringService.replaceAll(methodType);
            case SPLIT_1:
                return stringService.split1(methodType);
            case SPLIT_2:
                return stringService.split2(methodType);
            default:
                return ResponseConstant.RESPONSE_ERROR_PRINT_MSG;
        }
    }
}
