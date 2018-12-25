package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "sys_code_value", uniqueConstraints = @UniqueConstraint(columnNames = {"code", "value"}))
public class SysCodeValue extends AbstractAuditable {

    private String code;
    private String value;
    private String name;
    private String description;

}
