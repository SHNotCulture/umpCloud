package com.ump.entity;

import com.eparking.util.ExcelTitle;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 17:372018-12-8
 * @Modified By:
 */
public class ExcelTBusinePay {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_pay.busine_name
     *
     * @mbg.generated
     */
    private String busineName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_pay.need_pay
     *
     * @mbg.generated
     */
    private Double needPay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_pay.actual_pay
     *
     * @mbg.generated
     */
    private Double actualPay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_pay.balance
     *
     * @mbg.generated
     */
    private Double balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_pay.pay_time
     *
     * @mbg.generated
     */
    private String payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_busine_pay.order_number
     *
     * @mbg.generated
     */
    private String orderNumber;

    @ExcelTitle(value = "商户名称",order=1)
    public String getBusineName() {
        return busineName;
    }

    public void setBusineName(String busineName) {
        this.busineName = busineName;
    }
    @ExcelTitle(value = "应收",order=2)
    public Double getNeedPay() {
        return needPay;
    }

    public void setNeedPay(Double needPay) {
        this.needPay = needPay;
    }
    @ExcelTitle(value = "实收",order=3)
    public Double getActualPay() {
        return actualPay;
    }

    public void setActualPay(Double actualPay) {
        this.actualPay = actualPay;
    }
    @ExcelTitle(value = "账户余额",order=4)
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    @ExcelTitle(value = "充值时间",order=5)
    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
    @ExcelTitle(value = "订单号",order=6)
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
