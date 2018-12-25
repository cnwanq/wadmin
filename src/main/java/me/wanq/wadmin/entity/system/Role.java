package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_role")
public class Role extends AbstractAuditable {

    private String code;
    private String name;
    private String description;
    private Integer companyId;

}
