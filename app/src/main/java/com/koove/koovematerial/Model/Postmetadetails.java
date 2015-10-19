package com.koove.koovematerial.Model;

/**
 * Created by Manish on 10/19/2015.
 */
import com.google.gson.annotations.SerializedName;

public class Postmetadetails {

    @SerializedName("link")
    private String link;
    @SerializedName("post_is")
    private String postIs;
    @SerializedName("fb_post_id")
    private String fbPostId;
    @SerializedName("item_category")
    private String itemCategory;
    @SerializedName("item_condition")
    private String itemCondition;
    @SerializedName("item_formatted_address")
    private String itemFormattedAddress;
    @SerializedName("item_lat")
    private String itemLat;
    @SerializedName("item_lng")
    private String itemLng;
    @SerializedName("item_price")
    private String itemPrice;
    @SerializedName("post_format")
    private String postFormat;

    /**
     * @return The link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return The postIs
     */
    public String getPostIs() {
        return postIs;
    }

    /**
     * @param postIs The post_is
     */
    public void setPostIs(String postIs) {
        this.postIs = postIs;
    }

    /**
     * @return The fbPostId
     */
    public String getFbPostId() {
        return fbPostId;
    }

    /**
     * @param fbPostId The fb_post_id
     */
    public void setFbPostId(String fbPostId) {
        this.fbPostId = fbPostId;
    }

    /**
     * @return The itemCategory
     */
    public String getItemCategory() {
        return itemCategory;
    }

    /**
     * @param itemCategory The item_category
     */
    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    /**
     * @return The itemCondition
     */
    public String getItemCondition() {
        return itemCondition;
    }

    /**
     * @param itemCondition The item_condition
     */
    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    /**
     * @return The itemFormattedAddress
     */
    public String getItemFormattedAddress() {
        return itemFormattedAddress;
    }

    /**
     * @param itemFormattedAddress The item_formatted_address
     */
    public void setItemFormattedAddress(String itemFormattedAddress) {
        this.itemFormattedAddress = itemFormattedAddress;
    }

    /**
     * @return The itemLat
     */
    public String getItemLat() {
        return itemLat;
    }

    /**
     * @param itemLat The item_lat
     */
    public void setItemLat(String itemLat) {
        this.itemLat = itemLat;
    }

    /**
     * @return The itemLng
     */
    public String getItemLng() {
        return itemLng;
    }

    /**
     * @param itemLng The item_lng
     */
    public void setItemLng(String itemLng) {
        this.itemLng = itemLng;
    }

    /**
     * @return The itemPrice
     */
    public String getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice The item_price
     */
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return The postFormat
     */
    public String getPostFormat() {
        return postFormat;
    }

    /**
     * @param postFormat The post_format
     */
    public void setPostFormat(String postFormat) {
        this.postFormat = postFormat;
    }
}