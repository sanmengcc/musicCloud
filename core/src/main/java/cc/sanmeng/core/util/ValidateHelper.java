package cc.sanmeng.core.util;

import java.util.Collection;
import java.util.Map;

/**
 * 判空工具包
 */
public class ValidateHelper {
    public ValidateHelper() {
    }

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmptyString(String str) {
        return null == str || str.trim().length() == 0;
    }

    /**
     * 判断字符串是否非空
     * @param str
     * @return
     */
    public static boolean isNotEmptyString(String str) {
        return !isEmptyString(str);
    }

    /**
     * 判断集合是否为空
     * @param collection
     * @return
     */
    public static boolean isEmptyCollection(Collection<?> collection) {
        return null == collection || collection.size() == 0;
    }

    /**
     * 判断集合是否非空
     * @param collection
     * @return
     */
    public static boolean isNotEmptyCollection(Collection<?> collection) {
        return !isEmptyCollection(collection);
    }

    /**
     * 判断map是否为空
     * @param map
     * @return
     */
    public static boolean isEmptyMap(Map<?, ?> map) {
        return null == map || map.isEmpty();
    }

    /**
     * 判断map是否非空
     * @param map
     * @return
     */
    public static boolean isNotEmptyMap(Map<?, ?> map) {
        return !isEmptyMap(map);
    }
}
