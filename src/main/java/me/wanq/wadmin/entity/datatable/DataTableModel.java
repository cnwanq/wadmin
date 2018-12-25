package me.wanq.wadmin.entity.datatable;

import java.util.List;
import java.util.Map;

public class DataTableModel {

    public String action;
    public Map<String, Map<String, Object>> data;


    public boolean isAdd() {
        return this.action.equals("create");
    }

    public boolean isUpdate() {
        return this.action.equals("edit");
    }

    public boolean isDelete() {
        return this.action.equals("remove");
    }
}
