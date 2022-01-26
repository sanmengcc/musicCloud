package cc.sanmeng.core.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * JsonUtil
 */
public class Json {

    private Json() {
    }

    /**
     * 将对象转成json格式
     * @param object
     * @return
     */
    public static String toJsonString(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    /**
     * 将json转成特定的cls的对象
     * @param string
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String string, Class<T> cls) {
        Gson gson = new Gson();
        return gson.fromJson(string, cls);
    }

    /**
     * json字符串转成list
     * @param gsonString
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> List<T> str2List(String gsonString, Class<T> cls) {
        Gson gson = new Gson();
        return gson.fromJson(gsonString, new ParameterizedTypeImpl(cls));
    }

    /**
     * json字符串转成map的
     * @param gsonString
     * @return
     */
    public static Map str2Map(String gsonString) {
        Gson gson = new Gson();
        return gson.fromJson(gsonString, new TypeToken<Map>() {
        }.getType());
    }

    /**
     * 对象转为map
     * @param obj
     * @return
     */
    public static Map bean2Map(Object obj) {
        String jsonStr = bean2JsonStr(obj);
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, Map.class);
    }

    /**
     * map转为对象
     * @param map
     * @param destClazz
     * @param <T>
     * @return
     */
    public static <T> T map2Bean(Map map, Class<T> destClazz) {
        String jsonStr = bean2JsonStr(map);
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, destClazz);
    }

    /**
     * 对象转化Json
     * @param obj
     * @return
     */
    public static String bean2JsonStr(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    /**
     * bean转换
     * @param obj
     * @param destClazz
     * @param <T>
     * @return
     */
    public static <T> T createBean(Object obj, Class<T> destClazz) {
        String jsonStr = bean2JsonStr(obj);
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, destClazz);
    }

    /**
     * 对象转List
     * @param origList
     * @param destClazz
     * @param <T>
     * @return
     */
    public static <T> List<T> createList(List<?> origList, Class<T> destClazz) {
        String jsonStr = bean2JsonStr(origList);
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, new ParameterizedTypeImpl(destClazz));
    }
}

 class ParameterizedTypeImpl implements ParameterizedType {
    Class clazz;

    public ParameterizedTypeImpl(Class clz) {
        clazz = clz;
    }
    @Override
    public Type[] getActualTypeArguments() {
        //返回实际类型组成的数据
        return new Type[]{clazz};
    }
    @Override
    public Type getRawType() {
        //返回原生类型，即HashMap
        return List.class;
    }
    @Override
    public Type getOwnerType() {
        //返回Type对象
        return null;
    }
}