package learn.lhb.common.constant;

/**
 * @Author lianghongbin
 * @Date 15:44 2021/5/28
 * @Description 字符串常量
 */
public class StringConstant {
    /**
     * 数字相关的字符串常量
     */
    public static final String STRING_NUMBER = "0123456789";
    public static final String STRING_NUMBER_PREFIX_4 = "0123";
    public static final String STRING_NUMBER_SUFFIX_4 = "6789";
    public static final String STRING_NUMBER_REVERSE = "9876543210";
    public static final String STRING_NUMBER_REVERSE_PREFIX_4 = "9876";
    public static final String STRING_NUMBER_REVERSE_SUFFIX_4 = "3210";
    /**
     * 小写字母相关的字符串常量
     */
    public static final String STRING_SMALL_LETTER = "abcdefghijklmnopqrstuvwxyz";
    public static final String STRING_SMALL_LETTER_12 = "abcdefghijklmn";
    public static final String STRING_SMALL_LETTER_PREFIX_4 = "abcd";
    public static final String STRING_SMALL_LETTER_SUFFIX_4 = "wxyz";
    /**
     * 大写字母相关的字符串常量
     */
    public static final String STRING_BIG_LETTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String STRING_BIG_LETTER_12 = "ABCDEFGHIJKLMN";
    public static final String STRING_BIG_LETTER_PREFIX_4 = "ABCD";
    public static final String STRING_BIG_LETTER_SUFFIX_4 = "WXYZ";
    /**
     * 邮箱相关的字符串常量
     */
    public static final String STRING_ERROR_MAIL_TYPE_1 = "7822.com";
    public static final String STRING_ERROR_MAIL_TYPE_2 = "7822@com";
    public static final String STRING_ERROR_MAIL_TYPE_3 = "7822@.";
    public static final String STRING_ERROR_MAIL_TYPE_4 = "7822@qq.";
    public static final String STRING_ERROR_MAIL_TYPE_5 = "7822@qq";
    public static final String STRING_ERROR_MAIL_TYPE_6 = "@.com";
    public static final String STRING_CORRECT_MAIL = "782272323@qq.com";
    /**
     * 手机相关的字符串常量
     */
    public static final String STRING_ERROR_PHONE_TYPE_1 = "1300000111";
    public static final String STRING_ERROR_PHONE_TYPE_2 = "130000011112";
    public static final String STRING_CORRECT_PHONE = "18570001234";
    /**
     * 用于分割的字符串
     */
    public static final String STRING_SPLIT_TYPE_1 = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
    public static final String STRING_SPLIT_TYPE_2 = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
    public static final String STRING_SPLIT_TYPE_3 = "0.1.3.4.5.6.7.8.9";
    public static final String STRING_SPLIT_TYPE_4 = "9.8.7.6.5.4.3.2.1.0";
    /**
     * 字符串数组
     */
    public static final String[] STRINGS_SMALL_LETTER = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};
    public static final String[] STRINGS_BIG_LETTER = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU", "VWX", "YZ"};
    public static final String[] STRINGS_NUMBER = {"01", "23", "45", "67", "89"};
    public static final String[] STRINGS_NUMBER_REVERSE = {"98", "76", "54", "32", "10"};

}
