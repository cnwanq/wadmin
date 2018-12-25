package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_role_ref")
public class UserRoleRef extends AbstractAuditable {

    private Integer userId;
    private Integer roleId;

}
