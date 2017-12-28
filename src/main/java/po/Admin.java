/**
 * Copyright (C), 2015-2017
 * FileName: Admin
 * Author:   dell
 * Date:     2017/11/10 23:12
 * Description: 管理员实体类
 */
package po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/10.
 */
public class Admin implements Serializable {
    public static  final String IS_NORMAL="normal";
    public static  final String IS_NO_NORMAL="no_normal";
    public static final  int IS_LOGIND=1;
    public static final  int IS_NO_LOGIND=0;
    private Long id;
    private String adminName;
    private String adminPassword;
    private String adminState;

    public Integer getAdminIsLogind() {
        return adminIsLogind;
    }

    public void setAdminIsLogind(Integer adminIsLogind) {
        this.adminIsLogind = adminIsLogind;
    }

    private Integer adminIsLogind;
    private Timestamp adminLoginTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

    public Timestamp getAdminLoginTime() {
        return adminLoginTime;
    }

    public void setAdminLoginTime(Timestamp adminLoginTime) {
        this.adminLoginTime = adminLoginTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminState='" + adminState + '\'' +
                ", adminLoginTime=" + adminLoginTime +
                '}';
    }
}
