package me.wanq.wadmin.entity.system;


import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_permission")
public class Permission extends AbstractAuditable {

    private Integer parentId;
    private Integer appId;
    private Integer type;
    private String code;
    private String name;
    private String path;
    private String url;
    private String icon;
    private Integer sort;

}
