package com.ljk.config;

import java.util.List;


public class MapperBean {

    // 接口名
    private String interfaceName;
    // 接口下的方法列表
    private List<Function> list;

    public String getInterfaceName() {
        return interfaceName;
    }
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }
    public List<Function> getList() {
        return list;
    }
    public void setList(List<Function> list) {
        this.list = list;
    }
}
