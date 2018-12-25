package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_group")
public class UserGroup extends AbstractAuditable {

    private String no;
    private String name;
    private String description;
    private Integer managerId;

}
