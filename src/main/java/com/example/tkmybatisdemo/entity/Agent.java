package com.example.tkmybatisdemo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "agent")
public class Agent {
    @GeneratedValue(generator = "JDBC")
    @Id
    private Integer id;

    /**
     * 座席号码
     */
    private String number;

    /**
     * 名称
     */
    private String name;

    /**
     * 座席类型 0：外呼座席，1：接听座席
     */
    private Integer type;

    /**
     * 企业id
     */
    @Column(name = "enterprise_id")
    private String enterpriseId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 外线id, 多个外线用逗号隔开
     */
    @Column(name = "outbound_line_id")
    private String outboundLineId;

    /**
     * 所属坐席组的id
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 状态(0:离线;1在线:2:通话中)
     */
    private Integer status;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    @Column(name = "subscriber_id")
    private Integer subscriberId;

    /**
     * 删除标志 0：有效 ，1：已删除
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

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
     * 获取座席号码
     *
     * @return number - 座席号码
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置座席号码
     *
     * @param number 座席号码
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取座席类型 0：外呼座席，1：接听座席
     *
     * @return type - 座席类型 0：外呼座席，1：接听座席
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置座席类型 0：外呼座席，1：接听座席
     *
     * @param type 座席类型 0：外呼座席，1：接听座席
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取企业id
     *
     * @return enterprise_id - 企业id
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置企业id
     *
     * @param enterpriseId 企业id
     */
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取外线id, 多个外线用逗号隔开
     *
     * @return outbound_line_id - 外线id, 多个外线用逗号隔开
     */
    public String getOutboundLineId() {
        return outboundLineId;
    }

    /**
     * 设置外线id, 多个外线用逗号隔开
     *
     * @param outboundLineId 外线id, 多个外线用逗号隔开
     */
    public void setOutboundLineId(String outboundLineId) {
        this.outboundLineId = outboundLineId;
    }

    /**
     * 获取所属坐席组的id
     *
     * @return group_id - 所属坐席组的id
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置所属坐席组的id
     *
     * @param groupId 所属坐席组的id
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取状态(0:离线;1在线:2:通话中)
     *
     * @return status - 状态(0:离线;1在线:2:通话中)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(0:离线;1在线:2:通话中)
     *
     * @param status 状态(0:离线;1在线:2:通话中)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取账号
     *
     * @return username - 账号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置账号
     *
     * @param username 账号
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return subscriber_id
     */
    public Integer getSubscriberId() {
        return subscriberId;
    }

    /**
     * @param subscriberId
     */
    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * 获取删除标志 0：有效 ，1：已删除
     *
     * @return delete_flag - 删除标志 0：有效 ，1：已删除
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除标志 0：有效 ，1：已删除
     *
     * @param deleteFlag 删除标志 0：有效 ，1：已删除
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}