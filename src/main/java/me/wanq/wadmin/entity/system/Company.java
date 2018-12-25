package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "sys_compony", uniqueConstraints = @UniqueConstraint(columnNames = {"code"}))
public class Company extends AbstractAuditable {

    @Column(unique = true)
    private String code;

    private String name;

    private String address;

    private Integer owner;

    private Integer parentCompanyId;



}
