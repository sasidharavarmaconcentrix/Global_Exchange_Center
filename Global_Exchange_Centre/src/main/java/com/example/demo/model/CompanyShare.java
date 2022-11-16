package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CompanyShare")
public class CompanyShare {
	@Id
	@Column(name="company_id")
	private Long companyId;
	@Column(name="company_name")
	private String companyName;
	@Column(name="share_price")
	private Double sharePrice;
	@Override
	public String toString() {
		return "CompanyShare [companyId=" + companyId + ", companyName=" + companyName + ", sharePrice=" + sharePrice
				+ "]";
	}
	public CompanyShare(Long companyId, String companyName, Double sharePrice) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.sharePrice = sharePrice;
	}
	public CompanyShare() {
		// TODO Auto-generated constructor stub
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}

}
