package cc.sanmeng.core.entity;

import java.util.List;

/**
 * DataListValue
 */
public class DataListValue<T> extends ReturnValue {

    /**
     * 返回的数据对象列表
     */
    private List<T> dataList;

    public DataListValue() {
    }

    public DataListValue(String code, String desc) {
        super(code, desc);
    }

    public DataListValue(String code, String desc, List<T> dataList) {
        super(code, desc);
        this.dataList = dataList;
    }

    public DataListValue(Enum<?> en, List<T> dataList) {
        super(en.name(), en.toString());
        this.dataList = dataList;
    }

    public static <T> DataListValue<T> success(List<T> dataList) {
        DataListValue<T> returnData = new DataListValue("200", "success");
        returnData.setDataList(dataList);
        return returnData;
    }

    public List<T> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
