package cn.gjing.tools.excel.util;

/**
 * 参数工具
 * @author Gjing
 **/
public class ParamUtils {

    /**
     * 判断数组是否包含某个值
     * @param t 数据
     * @param u 值
     * @return true is 包含
     */
    public static boolean contains(Object[] t, Object u) {
        for (Object o : t) {
            if (o == u || o.equals(u)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断是否相等
     * @param t 参数1
     * @param u 参数2
     * @return true is 相等
     */
    public static boolean equals(Object t, Object u) {
        return t == u || t.equals(u);
    }

}