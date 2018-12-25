package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_role_group_ref")
public class RoleGroupRef extends AbstractAuditable {

    private Integer roleGroupId;
    private Integer roleId;
}
