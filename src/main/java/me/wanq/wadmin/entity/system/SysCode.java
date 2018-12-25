package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "sys_code", uniqueConstraints = @UniqueConstraint(columnNames = {"code"}))
public class SysCode extends AbstractAuditable {

    private String code;

    private String name;

    private String description;
}
