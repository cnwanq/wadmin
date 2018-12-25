package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_role_permission_ref")
public class RolePermissionRef extends AbstractAuditable {

    private Integer roleId;
    private Integer permissionId;

}
