package com.certusnet.fabric.chaincode.bankmaster.domain;

import java.io.Serializable;

/**
 * 客户账户交易
 * 
 * @author 	pengpeng
 * @date	2018年12月14日 下午5:24:55
 */
public class AccountTransaction implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 交易ID，同stub.getTxId()
	 */
	private String transactionId;
	
	/**
	 * 交易账户
	 */
	private String transactionAccountNo;
	
	/**
	 * 账户交易前金额
	 */
	private Double beforeAccountBalance;
	
	/**
	 * 账户交易后金额
	 */
	private Double afterAccountBalance;
	
	/**
	 * 交易金额
	 */
	private Double transactionBalance;
	
	/**
	 * 如果是转账类型，则为对方账号
	 */
	private String transferRelateAccountNo;
	
	/**
	 * 交易类型
	 */
	private String transactionType;
	
	/**
	 * 交易描述
	 */
	private String transactionDesc;
	
	/**
	 * 交易时间
	 */
	private String transactionTime;
	
	public AccountTransaction() {
		super();
	}

	public AccountTransaction(String transactionId, String transactionAccountNo, Double beforeAccountBalance,
			Double afterAccountBalance, Double transactionBalance, String transferRelateAccountNo,
			String transactionType, String transactionDesc, String transactionTime) {
		super();
		this.transactionId = transactionId;
		this.transactionAccountNo = transactionAccountNo;
		this.beforeAccountBalance = beforeAccountBalance;
		this.afterAccountBalance = afterAccountBalance;
		this.transactionBalance = transactionBalance;
		this.transferRelateAccountNo = transferRelateAccountNo;
		this.transactionType = transactionType;
		this.transactionDesc = transactionDesc;
		this.transactionTime = transactionTime;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionAccountNo() {
		return transactionAccountNo;
	}

	public void setTransactionAccountNo(String transactionAccountNo) {
		this.transactionAccountNo = transactionAccountNo;
	}

	public Double getBeforeAccountBalance() {
		return beforeAccountBalance;
	}

	public void setBeforeAccountBalance(Double beforeAccountBalance) {
		this.beforeAccountBalance = beforeAccountBalance;
	}

	public Double getAfterAccountBalance() {
		return afterAccountBalance;
	}

	public void setAfterAccountBalance(Double afterAccountBalance) {
		this.afterAccountBalance = afterAccountBalance;
	}

	public Double getTransactionBalance() {
		return transactionBalance;
	}

	public void setTransactionBalance(Double transactionBalance) {
		this.transactionBalance = transactionBalance;
	}

	public String getTransferRelateAccountNo() {
		return transferRelateAccountNo;
	}

	public void setTransferRelateAccountNo(String transferRelateAccountNo) {
		this.transferRelateAccountNo = transferRelateAccountNo;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionDesc() {
		return transactionDesc;
	}

	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

}
