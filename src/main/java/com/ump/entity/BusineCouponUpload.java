package com.ump.entity;

/**
 * @Author jin
 * @Data 2019/4/18 15:29
 **/
public class BusineCouponUpload {
    private Integer companyId;
    private Integer parkId;
    private Integer busineId;
    private Integer couponType;
    private Double couponPay;
    private Integer ticketId;
    private String carPlate;
    private String inTime;
    private String qrcodeId;//优惠二维码ID
    private Integer busineTicketId;//商户电子券批次ID
    private Integer ticketCouponId;//电子券优惠记录id，云端流水发送的值

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public Integer getBusineId() {
        return busineId;
    }

    public void setBusineId(Integer busineId) {
        this.busineId = busineId;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Double getCouponPay() {
        return couponPay;
    }

    public void setCouponPay(Double couponPay) {
        this.couponPay = couponPay;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getQrcodeId() {
        return qrcodeId;
    }

    public void setQrcodeId(String qrcodeId) {
        this.qrcodeId = qrcodeId;
    }

    public Integer getBusineTicketId() {
        return busineTicketId;
    }

    public void setBusineTicketId(Integer busineTicketId) {
        this.busineTicketId = busineTicketId;
    }

    public Integer getTicketCouponId() {
        return ticketCouponId;
    }

    public void setTicketCouponId(Integer ticketCouponId) {
        this.ticketCouponId = ticketCouponId;
    }
}
