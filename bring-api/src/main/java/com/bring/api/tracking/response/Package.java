package com.bring.api.tracking.response;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "statusDescription",
    "productName",
    "productCode",
    "brand",
    "weight",
    "length",
    "width",
    "height",
    "volume",
    "pickupCode",
    "lastRetrievalDate",
    "deliveryDate",
    "estimatedDeliveryDate",
    "senderName",
    "recipientName",
    "recipientAddress",
    "eventSet",
    "additionalServicesSet"
})
public class Package {

    @XmlElement(name = "StatusDescription", required = true)
    protected String statusDescription;
    @XmlElement(name = "ProductName", required = true)
    protected String productName;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "Brand", required = true)
    protected String brand;
    @XmlElement(name = "Weight", required = true)
    protected Weight weight;
    @XmlElement(name = "Length", required = true)
    protected Length length;
    @XmlElement(name = "Width", required = true)
    protected Length width;
    @XmlElement(name = "Height", required = true)
    protected Length height;
    @XmlElement(name = "Volume", required = true)
    protected Volume volume;
    @XmlElement(name = "PickupCode", required = true)
    protected String pickupCode;
    @XmlElement(name = "LastRetrievalDate", required = true)
    protected String lastRetrievalDate;
    @XmlElement(name = "DeliveryDate", required = true)
    protected String deliveryDate;
    @XmlElement(name = "EstimatedDeliveryDate", required = true)
    protected String estimatedDeliveryDate;
    @XmlElement(name = "SenderName", required = true)
    protected String senderName;
    @XmlElement(name = "RecipientName", required = true)
    protected String recipientName;
    @XmlElement(name = "RecipientAddress", required = true)
    protected Address recipientAddress;
    @XmlElement(name = "EventSet")
    protected EventSet eventSet;
    @XmlElement(name = "AdditionalServicesSet")
    protected AdditionalServicesSet additionalServicesSet;
    @XmlAttribute
    protected String packageId;

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String value) {
        this.productName = value;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String value) {
        this.productCode = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String value) {
        this.brand = value;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight value) {
        this.weight = value;
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length value) {
        this.length = value;
    }

    public Length getWidth() {
        return width;
    }

    public void setWidth(Length value) {
        this.width = value;
    }

    public Length getHeight() {
        return height;
    }

    public void setHeight(Length value) {
        this.height = value;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume value) {
        this.volume = value;
    }

    public EventSet getEventSet() {
        return eventSet;
    }

    public void setEventSet(EventSet value) {
        this.eventSet = value;
    }

    public AdditionalServicesSet getAdditionalServicesSet() {
        return additionalServicesSet;
    }

    public void setAdditionalServicesSet(AdditionalServicesSet value) {
        this.additionalServicesSet = value;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String value) {
        this.packageId = value;
    }

    public Event getEvent(int i) {
        return eventSet.getEvent(i);
    }

    public String getPickupCode() {
        return pickupCode;
    }

    public void setPickupCode(String pickupCode) {
        this.pickupCode = pickupCode;
    }

    public String getLastRetrievalDate() {
        return lastRetrievalDate;
    }

    public void setLastRetrievalDate(String lastRetrievalDate) {
        this.lastRetrievalDate = lastRetrievalDate;
    }

    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public Address getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(Address recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
