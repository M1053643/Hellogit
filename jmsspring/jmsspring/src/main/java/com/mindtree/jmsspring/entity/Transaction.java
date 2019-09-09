package com.mindtree.jmsspring.entity;

public class Transaction
{
private int tid;
private String from;
private String to;
private int amt;

public Transaction(int tid,String from,String to,int amt)
{
	super();
	this.tid=tid;
	this.from=from;
	this.to=to;
	this.amt=amt;
}

public int getTid() {
	return tid;
}

public void setTid(int tid) {
	this.tid = tid;
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public int getAmt() {
	return amt;
}

public void setAmt(int amt) {
	this.amt = amt;
}

@Override
public String toString() {
	return "Transaction [tid=" + tid + ", from=" + from + ", to=" + to + ", amt=" + amt + "]";
}


}
