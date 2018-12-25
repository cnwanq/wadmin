package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_company_ref")
public class UserCompanyRef extends AbstractAuditable {

    private Integer userId;
    private Integer companyId;
}
