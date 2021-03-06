package com.tima.admin.dto;


import com.tima.admin.validateInterface.IAddWeb;
import com.tima.admin.validateInterface.IDeleteWeb;
import com.tima.admin.validateInterface.IUpdateWeb;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 版本记录表
 * </p>
 *
 * @author YYF
 * @since 2018-11-28
 */
@Getter
@Setter
 public class VersionRecordDTO extends BaseDTO implements Serializable{
   private static final long serialVersionUID = 1L;
   private Long id;
   
    @ApiModelProperty(value = "编码")
    @NotBlank(groups = {IDeleteWeb.class,IUpdateWeb.class})
   private String no;
   
    @ApiModelProperty(value = "版本名称")  
   private String versionName;
   
    @ApiModelProperty(value = "版本号")
    @NotBlank(groups = {IAddWeb.class, IUpdateWeb.class})
   private String versionNumber;
   
    @ApiModelProperty(value = "版本类型（1.安卓  2.H5  3.IOS）")
    @NotBlank(groups = {IAddWeb.class, IUpdateWeb.class})
   private String versionType;
   
    @ApiModelProperty(value = "描述")  
   private String description;
   
    @ApiModelProperty(value = "创建人")  
   private String createdBy;
   
    @ApiModelProperty(value = "创建时间")  
   private Date createdDate;
   
    @ApiModelProperty(value = "修改人")  
   private String lastModifiedBy;
   
    @ApiModelProperty(value = "最后修改时间")  
   private Date lastModifiedDate;
   
    @ApiModelProperty(value = "版本号")  
   private Long version;
   
    @ApiModelProperty(value = "逻辑删除")  
   private String deleteFlag;
   
 }
