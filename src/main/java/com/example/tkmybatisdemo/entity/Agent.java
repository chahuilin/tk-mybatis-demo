package com.example.tkmybatisdemo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "agent")
@Data
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
}