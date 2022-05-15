/**
 * 
 */
package com.eximfiles.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ranjit P 
 * 
 * @date 14th May 2022
 *
 */
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Products {
	@Id
	@Column
	private int productId;
	
	@Column
	private String productName;
	
	@Column
	private String productDescription;
	
	@Column
	private boolean availabilityFlag;
	
	@Column
	private String productType;
	
	@Column
	private String productCode;
	
	@Column
	private String hsCode;
	
	@Column
	private String countryOfOrigin;
	
	@Column
	private String unitOfMeasurement;
	
	@Column
	private String typeOfPackage;
	
	@Column
	private float netWeight;
	
	@Column
	private float grossWeight;

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the availabilityFlag
	 */
	public boolean isAvailabilityFlag() {
		return availabilityFlag;
	}

	/**
	 * @param availabilityFlag the availabilityFlag to set
	 */
	public void setAvailabilityFlag(boolean availabilityFlag) {
		this.availabilityFlag = availabilityFlag;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return the hsCode
	 */
	public String getHsCode() {
		return hsCode;
	}

	/**
	 * @param hsCode the hsCode to set
	 */
	public void setHsCode(String hsCode) {
		this.hsCode = hsCode;
	}

	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	/**
	 * @return the unitOfMeasurement
	 */
	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	/**
	 * @param unitOfMeasurement the unitOfMeasurement to set
	 */
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	/**
	 * @return the typeOfPackage
	 */
	public String getTypeOfPackage() {
		return typeOfPackage;
	}

	/**
	 * @param typeOfPackage the typeOfPackage to set
	 */
	public void setTypeOfPackage(String typeOfPackage) {
		this.typeOfPackage = typeOfPackage;
	}

	/**
	 * @return the netWeight
	 */
	public float getNetWeight() {
		return netWeight;
	}

	/**
	 * @param netWeight the netWeight to set
	 */
	public void setNetWeight(float netWeight) {
		this.netWeight = netWeight;
	}

	/**
	 * @return the grossWeight
	 */
	public float getGrossWeight() {
		return grossWeight;
	}

	/**
	 * @param grossWeight the grossWeight to set
	 */
	public void setGrossWeight(float grossWeight) {
		this.grossWeight = grossWeight;
	}

	/**
	 * 
	 */
	public Products() {
		super();
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (availabilityFlag ? 1231 : 1237);
		result = prime * result + ((countryOfOrigin == null) ? 0 : countryOfOrigin.hashCode());
		result = prime * result + Float.floatToIntBits(grossWeight);
		result = prime * result + ((hsCode == null) ? 0 : hsCode.hashCode());
		result = prime * result + Float.floatToIntBits(netWeight);
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		result = prime * result + ((typeOfPackage == null) ? 0 : typeOfPackage.hashCode());
		result = prime * result + ((unitOfMeasurement == null) ? 0 : unitOfMeasurement.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		if (availabilityFlag != other.availabilityFlag)
			return false;
		if (countryOfOrigin == null) {
			if (other.countryOfOrigin != null)
				return false;
		} else if (!countryOfOrigin.equals(other.countryOfOrigin))
			return false;
		if (Float.floatToIntBits(grossWeight) != Float.floatToIntBits(other.grossWeight))
			return false;
		if (hsCode == null) {
			if (other.hsCode != null)
				return false;
		} else if (!hsCode.equals(other.hsCode))
			return false;
		if (Float.floatToIntBits(netWeight) != Float.floatToIntBits(other.netWeight))
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productType == null) {
			if (other.productType != null)
				return false;
		} else if (!productType.equals(other.productType))
			return false;
		if (typeOfPackage == null) {
			if (other.typeOfPackage != null)
				return false;
		} else if (!typeOfPackage.equals(other.typeOfPackage))
			return false;
		if (unitOfMeasurement == null) {
			if (other.unitOfMeasurement != null)
				return false;
		} else if (!unitOfMeasurement.equals(other.unitOfMeasurement))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", availabilityFlag=" + availabilityFlag + ", productType=" + productType
				+ ", productCode=" + productCode + ", hsCode=" + hsCode + ", countryOfOrigin=" + countryOfOrigin
				+ ", unitOfMeasurement=" + unitOfMeasurement + ", typeOfPackage=" + typeOfPackage + ", netWeight="
				+ netWeight + ", grossWeight=" + grossWeight + "]";
	}
	
	
}
