package com.hst.codegenerator.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
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
 * 促销活动子表
 * </p>
 *
 * @author wangqichang
 * @since 2021-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("jsh_sales_promotion_item")
public class SalesPromotionItem extends Model<SalesPromotionItem> {

    private static final long serialVersionUID = 1L;

    /**
     * id;主键自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动编号(通用);活动编号(通用)
     */
    @TableField("activity_code")
    private String activityCode;

    /**
     * 活动类型(通用);活动类型(通用)
     */
    @TableField("activity_type")
    private String activityType;

    /**
     * 商品编码(通用);商品编码(通用)
     */
    @TableField("material_bar_code")
    private String materialBarCode;

    /**
     * 商品编码A(购买)-买A赠B;商品编码A(购买)-买A赠B
     */
    @TableField("material_bar_code_a")
    private String materialBarCodeA;

    /**
     * 商品编码B(赠送)-买A赠B;商品编码B(赠送)-买A赠B
     */
    @TableField("material_bar_code_b")
    private String materialBarCodeB;

    /**
     * 商品名称(通用);商品名称(通用)
     */
    @TableField("material_name")
    private String materialName;

    /**
     * 商品名称A(购买)-买A赠B;商品名称A(购买)-买A赠B
     */
    @TableField("material_name_a")
    private String materialNameA;

    /**
     * 商品名称B(赠送)-买A赠B;商品名称B(赠送)-买A赠B
     */
    @TableField("material_name_b")
    private String materialNameB;

    /**
     * 数量(购买)-买A赠B;数量(购买)-买A赠B
     */
    @TableField("amount_a")
    private Integer amountA;

    /**
     * 数量(赠送)-买A赠B;数量(赠送)-买A赠B
     */
    @TableField("amount_b")
    private Integer amountB;

    /**
     * 买满金额-单品满减;买满金额-单品满减
     */
    @TableField("full_purchase_m")
    private BigDecimal fullPurchaseM;

    /**
     * 售价-单品促销;售价-单品促销
     */
    private BigDecimal price;

    /**
     * 促销价-单品促销;促销价-单品促销
     */
    @TableField("promot_price")
    private BigDecimal promotPrice;

    /**
     * 促销折扣(%)-单品促销;促销折扣(%)-单品促销
     */
    @TableField("promot_dis")
    private BigDecimal promotDis;

    /**
     * 再买优惠(%)-奇偶促销;再买优惠(%)-奇偶促销
     */
    @TableField("buy_again_dis")
    private BigDecimal buyAgainDis;

    /**
     * 满减金额-整单优惠;满减金额-整单优惠
     */
    @TableField("full_minus_m")
    private BigDecimal fullMinusM;

    /**
     * 减免金额(通用);减免金额(通用)
     */
    @TableField("deduction_m")
    private BigDecimal deductionM;

    /**
     * 减免折扣-整单优惠;减免折扣-整单优惠
     */
    @TableField("deduction_dis")
    private BigDecimal deductionDis;

    /**
     * 生效规则-整单优惠;生效规则-整单优惠
     */
    @TableField("effective_rules")
    private Integer effectiveRules;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
