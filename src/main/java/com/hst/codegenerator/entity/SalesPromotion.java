package com.hst.codegenerator.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 促销活动主表
 * </p>
 *
 * @author wangqichang
 * @since 2021-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("jsh_sales_promotion")
public class SalesPromotion extends Model<SalesPromotion> {

    private static final long serialVersionUID = 1L;

    /**
     * id;促销活动主表ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动编号;活动编号 发号器统一获取
     */
    @TableField("activity_code")
    private String activityCode;

    /**
     * 活动名称;活动名称
     */
    @TableField("activity_name")
    private String activityName;

    /**
     * 活动机构;活动机构
     */
    @TableField("activity_organization")
    private String activityOrganization;

    /**
     * 活动类型;活动类型（1 买A赠B  2单品满减  3单品促销  4奇偶促销  5整单优惠）
     */
    @TableField("activity_type")
    private String activityType;

    /**
     * 活动日期-开始时间;活动日期-开始时间
     */
    @TableField("activity_time_start")
    private Date activityTimeStart;

    /**
     * 活动日期-结束时间;活动日期-结束时间
     */
    @TableField("activity_time_end")
    private Date activityTimeEnd;

    /**
     * 活动日期 具体星期;活动日期 具体星期数据类型为1-7整数以字符串分割 1,2,3,4,5,6,7返回前台转换为数组 即可
     */
    @TableField("activity_week_days")
    private String activityWeekDays;

    /**
     * 活动状态;活动状态(1待执行2执行中3已终止 默认增加后执行中)
     */
    @TableField("activity_status")
    private String activityStatus;

    /**
     * 是否删除;是否删除1删除0未删除
     */
    @TableField("is_del")
    private String isDel;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
