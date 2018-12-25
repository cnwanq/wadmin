package me.wanq.wadmin.entity.system;

import me.wanq.wadmin.common.audit.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_upload_file")
public class UploadFile extends AbstractAuditable {

    private String fileName;
    private String fileType;
    private String fileCode;
}

