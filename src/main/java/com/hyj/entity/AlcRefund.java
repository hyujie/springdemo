package com.hyj.entity;

import javax.persistence.*;

@Table(name = "alc_refund")
public class AlcRefund {
    @Id
    private Integer id;

    /**
     * 业务类型
     */
    @Column(name = "busType")
    private String bustype;

    /**
     * 核减类型
     */
    @Column(name = "subType")
    private String subtype;

    /**
     * 工单流水号
     */
    @Column(name = "workOrderNum")
    private String workordernum;

    /**
     * 计费用户号码
     */
    @Column(name = "billUserNum")
    private String billusernum;

    /**
     * SP代码
     */
    @Column(name = "spCode")
    private String spcode;

    /**
     * 业务代码
     */
    @Column(name = "busCode")
    private String buscode;

    /**
     * 计费类型
     */
    @Column(name = "chargeType")
    private String chargetype;

    /**
     * 业务使用时间
     */
    @Column(name = "serviceUsageTime")
    private String serviceusagetime;

    /**
     * 退费时间
     */
    @Column(name = "refundTime")
    private String refundtime;

    /**
     * 退费金额
     */
    @Column(name = "refundAmount")
    private String refundamount;

    /**
     * 内容ID
     */
    @Column(name = "contentId")
    private String contentid;

    /**
     * 第三方标识
     */
    @Column(name = "hirdPartyLogo")
    private String hirdpartylogo;

    /**
     * 序列号
     */
    @Column(name = "serialNum")
    private String serialnum;

    /**
     * 附加查重关键字一
     */
    @Column(name = "duplicateKey1")
    private String duplicatekey1;

    /**
     * 附加查重关键字二
     */
    @Column(name = "duplicateKey2")
    private String duplicatekey2;

    /**
     * 订购方式
     */
    @Column(name = "orderMode")
    private String ordermode;

    /**
     * 充值序列号
     */
    @Column(name = "rechargeSeqNum")
    private String rechargeseqnum;

    /**
     * 用户归属省代码
     */
    @Column(name = "uAttriProvCode")
    private String uattriprovcode;

    /**
     * 支付方式
     */
    @Column(name = "paymentMet")
    private String paymentmet;

    /**
     * 渠道号（内码）
     */
    @Column(name = "ChannelNum")
    private String channelnum;

    /**
     * 创建时间
     */
    @Column(name = "creationTime")
    private String creationtime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取业务类型
     *
     * @return busType - 业务类型
     */
    public String getBustype() {
        return bustype;
    }

    /**
     * 设置业务类型
     *
     * @param bustype 业务类型
     */
    public void setBustype(String bustype) {
        this.bustype = bustype == null ? null : bustype.trim();
    }

    /**
     * 获取核减类型
     *
     * @return subType - 核减类型
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * 设置核减类型
     *
     * @param subtype 核减类型
     */
    public void setSubtype(String subtype) {
        this.subtype = subtype == null ? null : subtype.trim();
    }

    /**
     * 获取工单流水号
     *
     * @return workOrderNum - 工单流水号
     */
    public String getWorkordernum() {
        return workordernum;
    }

    /**
     * 设置工单流水号
     *
     * @param workordernum 工单流水号
     */
    public void setWorkordernum(String workordernum) {
        this.workordernum = workordernum == null ? null : workordernum.trim();
    }

    /**
     * 获取计费用户号码
     *
     * @return billUserNum - 计费用户号码
     */
    public String getBillusernum() {
        return billusernum;
    }

    /**
     * 设置计费用户号码
     *
     * @param billusernum 计费用户号码
     */
    public void setBillusernum(String billusernum) {
        this.billusernum = billusernum == null ? null : billusernum.trim();
    }

    /**
     * 获取SP代码
     *
     * @return spCode - SP代码
     */
    public String getSpcode() {
        return spcode;
    }

    /**
     * 设置SP代码
     *
     * @param spcode SP代码
     */
    public void setSpcode(String spcode) {
        this.spcode = spcode == null ? null : spcode.trim();
    }

    /**
     * 获取业务代码
     *
     * @return busCode - 业务代码
     */
    public String getBuscode() {
        return buscode;
    }

    /**
     * 设置业务代码
     *
     * @param buscode 业务代码
     */
    public void setBuscode(String buscode) {
        this.buscode = buscode == null ? null : buscode.trim();
    }

    /**
     * 获取计费类型
     *
     * @return chargeType - 计费类型
     */
    public String getChargetype() {
        return chargetype;
    }

    /**
     * 设置计费类型
     *
     * @param chargetype 计费类型
     */
    public void setChargetype(String chargetype) {
        this.chargetype = chargetype == null ? null : chargetype.trim();
    }

    /**
     * 获取业务使用时间
     *
     * @return serviceUsageTime - 业务使用时间
     */
    public String getServiceusagetime() {
        return serviceusagetime;
    }

    /**
     * 设置业务使用时间
     *
     * @param serviceusagetime 业务使用时间
     */
    public void setServiceusagetime(String serviceusagetime) {
        this.serviceusagetime = serviceusagetime == null ? null : serviceusagetime.trim();
    }

    /**
     * 获取退费时间
     *
     * @return refundTime - 退费时间
     */
    public String getRefundtime() {
        return refundtime;
    }

    /**
     * 设置退费时间
     *
     * @param refundtime 退费时间
     */
    public void setRefundtime(String refundtime) {
        this.refundtime = refundtime == null ? null : refundtime.trim();
    }

    /**
     * 获取退费金额
     *
     * @return refundAmount - 退费金额
     */
    public String getRefundamount() {
        return refundamount;
    }

    /**
     * 设置退费金额
     *
     * @param refundamount 退费金额
     */
    public void setRefundamount(String refundamount) {
        this.refundamount = refundamount == null ? null : refundamount.trim();
    }

    /**
     * 获取内容ID
     *
     * @return contentId - 内容ID
     */
    public String getContentid() {
        return contentid;
    }

    /**
     * 设置内容ID
     *
     * @param contentid 内容ID
     */
    public void setContentid(String contentid) {
        this.contentid = contentid == null ? null : contentid.trim();
    }

    /**
     * 获取第三方标识
     *
     * @return hirdPartyLogo - 第三方标识
     */
    public String getHirdpartylogo() {
        return hirdpartylogo;
    }

    /**
     * 设置第三方标识
     *
     * @param hirdpartylogo 第三方标识
     */
    public void setHirdpartylogo(String hirdpartylogo) {
        this.hirdpartylogo = hirdpartylogo == null ? null : hirdpartylogo.trim();
    }

    /**
     * 获取序列号
     *
     * @return serialNum - 序列号
     */
    public String getSerialnum() {
        return serialnum;
    }

    /**
     * 设置序列号
     *
     * @param serialnum 序列号
     */
    public void setSerialnum(String serialnum) {
        this.serialnum = serialnum == null ? null : serialnum.trim();
    }

    /**
     * 获取附加查重关键字一
     *
     * @return duplicateKey1 - 附加查重关键字一
     */
    public String getDuplicatekey1() {
        return duplicatekey1;
    }

    /**
     * 设置附加查重关键字一
     *
     * @param duplicatekey1 附加查重关键字一
     */
    public void setDuplicatekey1(String duplicatekey1) {
        this.duplicatekey1 = duplicatekey1 == null ? null : duplicatekey1.trim();
    }

    /**
     * 获取附加查重关键字二
     *
     * @return duplicateKey2 - 附加查重关键字二
     */
    public String getDuplicatekey2() {
        return duplicatekey2;
    }

    /**
     * 设置附加查重关键字二
     *
     * @param duplicatekey2 附加查重关键字二
     */
    public void setDuplicatekey2(String duplicatekey2) {
        this.duplicatekey2 = duplicatekey2 == null ? null : duplicatekey2.trim();
    }

    /**
     * 获取订购方式
     *
     * @return orderMode - 订购方式
     */
    public String getOrdermode() {
        return ordermode;
    }

    /**
     * 设置订购方式
     *
     * @param ordermode 订购方式
     */
    public void setOrdermode(String ordermode) {
        this.ordermode = ordermode == null ? null : ordermode.trim();
    }

    /**
     * 获取充值序列号
     *
     * @return rechargeSeqNum - 充值序列号
     */
    public String getRechargeseqnum() {
        return rechargeseqnum;
    }

    /**
     * 设置充值序列号
     *
     * @param rechargeseqnum 充值序列号
     */
    public void setRechargeseqnum(String rechargeseqnum) {
        this.rechargeseqnum = rechargeseqnum == null ? null : rechargeseqnum.trim();
    }

    /**
     * 获取用户归属省代码
     *
     * @return uAttriProvCode - 用户归属省代码
     */
    public String getUattriprovcode() {
        return uattriprovcode;
    }

    /**
     * 设置用户归属省代码
     *
     * @param uattriprovcode 用户归属省代码
     */
    public void setUattriprovcode(String uattriprovcode) {
        this.uattriprovcode = uattriprovcode == null ? null : uattriprovcode.trim();
    }

    /**
     * 获取支付方式
     *
     * @return paymentMet - 支付方式
     */
    public String getPaymentmet() {
        return paymentmet;
    }

    /**
     * 设置支付方式
     *
     * @param paymentmet 支付方式
     */
    public void setPaymentmet(String paymentmet) {
        this.paymentmet = paymentmet == null ? null : paymentmet.trim();
    }

    /**
     * 获取渠道号（内码）
     *
     * @return ChannelNum - 渠道号（内码）
     */
    public String getChannelnum() {
        return channelnum;
    }

    /**
     * 设置渠道号（内码）
     *
     * @param channelnum 渠道号（内码）
     */
    public void setChannelnum(String channelnum) {
        this.channelnum = channelnum == null ? null : channelnum.trim();
    }

    /**
     * 获取创建时间
     *
     * @return creationTime - 创建时间
     */
    public String getCreationtime() {
        return creationtime;
    }

    /**
     * 设置创建时间
     *
     * @param creationtime 创建时间
     */
    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    @Override
    public String toString() {
        return "AlcRefund{" +
                "id=" + id +
                ", bustype='" + bustype + '\'' +
                ", subtype='" + subtype + '\'' +
                ", workordernum='" + workordernum + '\'' +
                ", billusernum='" + billusernum + '\'' +
                ", spcode='" + spcode + '\'' +
                ", buscode='" + buscode + '\'' +
                ", chargetype='" + chargetype + '\'' +
                ", serviceusagetime='" + serviceusagetime + '\'' +
                ", refundtime='" + refundtime + '\'' +
                ", refundamount='" + refundamount + '\'' +
                ", contentid='" + contentid + '\'' +
                ", hirdpartylogo='" + hirdpartylogo + '\'' +
                ", serialnum='" + serialnum + '\'' +
                ", duplicatekey1='" + duplicatekey1 + '\'' +
                ", duplicatekey2='" + duplicatekey2 + '\'' +
                ", ordermode='" + ordermode + '\'' +
                ", rechargeseqnum='" + rechargeseqnum + '\'' +
                ", uattriprovcode='" + uattriprovcode + '\'' +
                ", paymentmet='" + paymentmet + '\'' +
                ", channelnum='" + channelnum + '\'' +
                ", creationtime='" + creationtime + '\'' +
                '}';
    }
}