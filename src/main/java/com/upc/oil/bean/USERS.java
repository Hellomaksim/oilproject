package com.upc.oil.bean;

import java.math.BigDecimal;

public class USERS {
    //空参构造
    public USERS(){

    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column U_USERS.ID
     *
     * @mbg.generated
     */
    private BigDecimal id  ;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column U_USERS.USERNAME
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column U_USERS.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    private String danwei;
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column U_USERS.REALNAME
     *
     * @mbg.generated
     */


    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }



    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column U_USERS.ID
     *
     * @param id the value for U_USERS.ID
     *
     * @mbg.generated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column U_USERS.USERNAME
     *
     * @return the value of U_USERS.USERNAME
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column U_USERS.USERNAME
     *
     * @param username the value for U_USERS.USERNAME
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column U_USERS.PASSWORD
     *
     * @return the value of U_USERS.PASSWORD
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column U_USERS.PASSWORD
     *
     * @param password the value for U_USERS.PASSWORD
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column U_USERS.REALNAME
     *
     * @return the value of U_USERS.REALNAME
     *
     * @mbg.generated
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column U_USERS.REALNAME
     *
     * @param realname the value for U_USERS.REALNAME
     *
     * @mbg.generated
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }
    @Override
    public String toString() {
        return "USERS{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", danwei='" + danwei + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}