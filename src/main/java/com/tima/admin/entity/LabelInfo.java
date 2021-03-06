package com.tima.admin.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.*;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 标签信息
 * </p>
 *
 * @author YYF
 * @since 2018-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("label_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelInfo extends Model<LabelInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String no;
    /**
     * 标签属性分类
     */
    @TableField("attr_id")
    private Long attrId;
    /**
     * 标签名称
     */
    @TableField("label_name")
    private String labelName;
    /**
     * 0.自动标签  1.手动标签
     */
    private String type;
    /**
     * 标签描述
     */
    private String describe;
    /**
     * 状态 0.启用  1.禁用
     */
    private String status;
    /**
     * 是否展示 0.展示  1.不展示
     */
    @TableField("is_show")
    private String isShow;
    @TableField("delete_flag")
    @TableLogic
    private String deleteFlag;
    @Version
    private Long version;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
