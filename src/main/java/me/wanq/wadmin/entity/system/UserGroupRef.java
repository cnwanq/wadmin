package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_group_ref")
public class UserGroupRef extends AbstractAuditable {

    private Integer userId;
    private Integer groupId;

}
