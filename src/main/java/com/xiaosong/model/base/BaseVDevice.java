package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseVDevice<M extends BaseVDevice<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setDeviceName(java.lang.String deviceName) {
		set("device_name", deviceName);
		return (M)this;
	}
	
	public java.lang.String getDeviceName() {
		return getStr("device_name");
	}

	public M setIp(java.lang.String ip) {
		set("ip", ip);
		return (M)this;
	}
	
	public java.lang.String getIp() {
		return getStr("ip");
	}

	public M setType(java.lang.String type) {
		set("type", type);
		return (M)this;
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}

	public M setGate(java.lang.String gate) {
		set("gate", gate);
		return (M)this;
	}
	
	public java.lang.String getGate() {
		return getStr("gate");
	}

	public M setFloors(java.lang.String floors) {
		set("floors", floors);
		return (M)this;
	}
	
	public java.lang.String getFloors() {
		return getStr("floors");
	}

	public M setCreatetime(java.lang.String createtime) {
		set("createtime", createtime);
		return (M)this;
	}
	
	public java.lang.String getCreatetime() {
		return getStr("createtime");
	}

	public M setExtra1(java.lang.String extra1) {
		set("extra1", extra1);
		return (M)this;
	}
	
	public java.lang.String getExtra1() {
		return getStr("extra1");
	}

	public M setExtra2(java.lang.String extra2) {
		set("extra2", extra2);
		return (M)this;
	}
	
	public java.lang.String getExtra2() {
		return getStr("extra2");
	}

	public M setExtra3(java.lang.String extra3) {
		set("extra3", extra3);
		return (M)this;
	}
	
	public java.lang.String getExtra3() {
		return getStr("extra3");
	}

}
