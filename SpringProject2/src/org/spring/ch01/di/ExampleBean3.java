package org.spring.ch01.di;
import java.util.*;
public class ExampleBean3 {
	private Properties emails;
	private List<String> stringList;
	private List<ExampleBean> beanList;
	private Map<String,String> someMap;
	private Set<String> someSet;
	private String whitesequence;
	private String nullObject;
	public String getWhitesequence() {
		return whitesequence;
	}
	public void setWhitesequence(String whitesequence) {
		this.whitesequence = whitesequence;
	}
	public String getNullObject() {
		return nullObject;
	}
	public void setNullObject(String nullObject) {
		this.nullObject = nullObject;
	}
	public Properties getEmails() {
		return emails;
	}
	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	public List<String> getStringList() {
		return stringList;
	}
	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
	public List<ExampleBean> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<ExampleBean> beanList) {
		this.beanList = beanList;
	}
	public Map<String, String> getSomeMap() {
		return someMap;
	}
	public void setSomeMap(Map<String, String> someMap) {
		this.someMap = someMap;
	}
	public Set<String> getSomeSet() {
		return someSet;
	}
	public void setSomeSet(Set<String> someSet) {
		this.someSet = someSet;
	}
	public String toString() {
		return "ExampleBean3:\n[emails="+emails+"\nstringList="+stringList+"\nbeanList="+beanList
				+"\nsomeMap="+someMap+"\nsomeSet="+someSet+"\nwhiteSequence="+this.whitesequence
				+"\nnullObject="+this.nullObject+"]";
	}
	
}
