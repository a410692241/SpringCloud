package com.wei.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    /**
     * [用户id]
     */
    private Integer userId;

    /**
     * [昵称]
     */
    private String nickname;

    /**
     * [头像]
     */
    private String headImage;

    /**
     * [生日]
     */
    private Date birthday;

    /**
     * [性别] 男：MALE  女：FEMALE
     */
    private String sex;

    /**
     * [联系电话]
     */
    private String mobile;

    /**
     * [qq]
     */
    private String qq;

    /**
     * [email]
     */
    private String email;

    /**
     * [真实姓名]
     */
    private String realName;

    /**
     * [是否是分享员]  是：TRUE  否：FALSE
     */
    private String isSharer;

    /**
     * [身份证正面]
     */
    private String idCardFront;

    /**
     * [身份证反面]
     */
    private String idCardBack;

    /**
     * [是否是采买员]  是：TRUE  否：FALSE
     */
    private String isProcurer;

    /**
     * [默认收货地址ID]
     */
    private Integer defaultReceiveAddressId;

    /**
     * [创建时间]
     */
    private Date createTime;

    /**
     * [更新时间]
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIsSharer() {
        return isSharer;
    }

    public void setIsSharer(String isSharer) {
        this.isSharer = isSharer;
    }

    public String getIdCardFront() {
        return idCardFront;
    }

    public void setIdCardFront(String idCardFront) {
        this.idCardFront = idCardFront;
    }

    public String getIdCardBack() {
        return idCardBack;
    }

    public void setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack;
    }

    public String getIsProcurer() {
        return isProcurer;
    }

    public void setIsProcurer(String isProcurer) {
        this.isProcurer = isProcurer;
    }

    public Integer getDefaultReceiveAddressId() {
        return defaultReceiveAddressId;
    }

    public void setDefaultReceiveAddressId(Integer defaultReceiveAddressId) {
        this.defaultReceiveAddressId = defaultReceiveAddressId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getHeadImage() == null ? other.getHeadImage() == null : this.getHeadImage().equals(other.getHeadImage()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getIsSharer() == null ? other.getIsSharer() == null : this.getIsSharer().equals(other.getIsSharer()))
            && (this.getIdCardFront() == null ? other.getIdCardFront() == null : this.getIdCardFront().equals(other.getIdCardFront()))
            && (this.getIdCardBack() == null ? other.getIdCardBack() == null : this.getIdCardBack().equals(other.getIdCardBack()))
            && (this.getIsProcurer() == null ? other.getIsProcurer() == null : this.getIsProcurer().equals(other.getIsProcurer()))
            && (this.getDefaultReceiveAddressId() == null ? other.getDefaultReceiveAddressId() == null : this.getDefaultReceiveAddressId().equals(other.getDefaultReceiveAddressId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getHeadImage() == null) ? 0 : getHeadImage().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getIsSharer() == null) ? 0 : getIsSharer().hashCode());
        result = prime * result + ((getIdCardFront() == null) ? 0 : getIdCardFront().hashCode());
        result = prime * result + ((getIdCardBack() == null) ? 0 : getIdCardBack().hashCode());
        result = prime * result + ((getIsProcurer() == null) ? 0 : getIsProcurer().hashCode());
        result = prime * result + ((getDefaultReceiveAddressId() == null) ? 0 : getDefaultReceiveAddressId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", nickname=").append(nickname);
        sb.append(", headImage=").append(headImage);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", mobile=").append(mobile);
        sb.append(", qq=").append(qq);
        sb.append(", email=").append(email);
        sb.append(", realName=").append(realName);
        sb.append(", isSharer=").append(isSharer);
        sb.append(", idCardFront=").append(idCardFront);
        sb.append(", idCardBack=").append(idCardBack);
        sb.append(", isProcurer=").append(isProcurer);
        sb.append(", defaultReceiveAddressId=").append(defaultReceiveAddressId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}