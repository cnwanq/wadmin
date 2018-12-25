package me.wanq.wadmin.common.audit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import me.wanq.wadmin.common.enums.DataStatus;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractAuditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @CreatedDate
    @Column(name = "create_time", nullable = true)
    @JsonIgnore
    private Date createTime;

    @CreatedBy
    @Column(name = "cteate_user_id", nullable = true)
    @JsonIgnore
    private Integer createUserId;

    @LastModifiedDate
    @Column(name = "last_modified_time", nullable = true)
    @JsonIgnore
    private Date lastModifiedTime;

    @LastModifiedBy
    @Column(name = "last_modified_user_id", nullable = true)
    @JsonIgnore
    private Integer lastModifiedUserId;

    @Column(insertable = false, columnDefinition = "int default 1")
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Integer getLastModifiedUserId() {
        return lastModifiedUserId;
    }

    public void setLastModifiedUserId(Integer lastModifiedUserId) {
        this.lastModifiedUserId = lastModifiedUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
