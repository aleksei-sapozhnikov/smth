package com.github.vermucht.smth.exception.bean;

public class EmployeeErrorBean {

  private String info;

  public EmployeeErrorBean(String info) {
    this.info = info;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}
