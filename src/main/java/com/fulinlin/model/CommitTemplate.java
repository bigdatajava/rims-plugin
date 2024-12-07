package com.fulinlin.model;

/**
 * @program: git-commit-message-helper
 * @author: fulin
 * @create: 2019-12-08 11:36
 **/
public class CommitTemplate {

    private String type;
    private String parentBianHao;
    private String parentBiaoTi;
    private String childBianHao;
    private String childBiaoTi;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentBianHao() {
        return parentBianHao;
    }

    public void setParentBianHao(String parentBianHao) {
        this.parentBianHao = parentBianHao;
    }

    public String getParentBiaoTi() {
        return parentBiaoTi;
    }

    public void setParentBiaoTi(String parentBiaoTi) {
        this.parentBiaoTi = parentBiaoTi;
    }

    public String getChildBianHao() {
        return childBianHao;
    }

    public void setChildBianHao(String childBianHao) {
        this.childBianHao = childBianHao;
    }

    public String getChildBiaoTi() {
        return childBiaoTi;
    }

    public void setChildBiaoTi(String childBiaoTi) {
        this.childBiaoTi = childBiaoTi;
    }

}
