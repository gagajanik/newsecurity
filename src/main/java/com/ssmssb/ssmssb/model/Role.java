package com.ssmssb.ssmssb.model;


import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Integer roleId;
    @Column(name = "role_name")
    private String role;
    @Column(name = "soip_add_and_manage")
    private Integer soipAddAndManage;
    @Column(name = "soip_delete")
    private Integer soipDelete;
    @Column(name = "soip_view")
    private Integer soipView;
    @Column(name = "fp_add_and_manage")
    private Integer fpAddAndManage;
    @Column(name = "fp_delete")
    private Integer fpDelete;
    @Column(name = "fp_view")
    private Integer fpView;
    @Column(name = "blank_print")
    private Integer blankPrint;
    @Column(name = "permmit")
    private Integer permmit;

    public Role() {

    }

    public Role(Integer roleId, String role, Integer soipAddAndManage,
                Integer soipDelete, Integer soipView, Integer fpAddAndManage,
                Integer fpDelete, Integer fpView, Integer blankPrint, Integer permmit) {
        this.roleId = roleId;
        this.role = role;
        this.soipAddAndManage=soipAddAndManage;
        this.soipDelete=soipDelete;
        this.soipView=soipView;
        this.fpAddAndManage=fpAddAndManage;
        this.fpDelete=fpDelete;
        this.fpView=fpView;
        this.blankPrint=blankPrint;
        this.permmit=permmit;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSoipAddAndManage() {
        return soipAddAndManage;
    }

    public void setSoipAddAndManage(Integer soipAddAndManage) {
        this.soipAddAndManage = soipAddAndManage;
    }

    public Integer getSoipDelete() {
        return soipDelete;
    }

    public void setSoipDelete(Integer soipDelete) {
        this.soipDelete = soipDelete;
    }

    public Integer getSoipView() {
        return soipView;
    }

    public void setSoipView(Integer soipView) {
        this.soipView = soipView;
    }

    public Integer getFpAddAndManage() {
        return fpAddAndManage;
    }

    public void setFpAddAndManage(Integer fpAddAndManage) {
        this.fpAddAndManage = fpAddAndManage;
    }

    public Integer getFpDelete() {
        return fpDelete;
    }

    public void setFpDelete(Integer fpDelete) {
        this.fpDelete = fpDelete;
    }

    public Integer getFpView() {
        return fpView;
    }

    public void setFpView(Integer fpView) {
        this.fpView = fpView;
    }

    public Integer getBlankPrint() {
        return blankPrint;
    }

    public void setBlankPrint(Integer blankPrint) {
        this.blankPrint = blankPrint;
    }

    public Integer getPermmit() {
        return permmit;
    }

    public void setPermmit(Integer permmit) {
        this.permmit = permmit;
    }
}
