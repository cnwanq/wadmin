package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_role_group_ref")
public class UserRoleGroupRef extends AbstractAuditable {

    private Integer userId;
    private Integer roleGroupId;

}
