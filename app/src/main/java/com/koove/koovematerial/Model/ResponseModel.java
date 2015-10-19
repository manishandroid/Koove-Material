package com.koove.koovematerial.Model;

/**
 * Created by Manish on 10/19/2015.
 */
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseModel {

    @SerializedName("ID")
    private Integer ID;
    @SerializedName("post_author")
    private String postAuthor;
    @SerializedName("post_date")
    private String postDate;
    @SerializedName("post_date_gmt")
    private String postDateGmt;
    @SerializedName("post_content")
    private String postContent;
    @SerializedName("post_title")
    private String postTitle;
    @SerializedName("post_excerpt")
    private String postExcerpt;
    @SerializedName("post_status")
    private String postStatus;
    @SerializedName("comment_status")
    private String commentStatus;
    @SerializedName("ping_status")
    private String pingStatus;
    @SerializedName("post_password")
    private String postPassword;
    @SerializedName("post_name")
    private String postName;
    @SerializedName("to_ping")
    private String toPing;
    @SerializedName("pinged")
    private String pinged;
    @SerializedName("post_modified")
    private String postModified;
    @SerializedName("post_modified_gmt")
    private String postModifiedGmt;
    @SerializedName("post_content_filtered")
    private String postContentFiltered;
    @SerializedName("post_parent")
    private Integer postParent;
    @SerializedName("guid")
    private String guid;
    @SerializedName("menu_order")
    private Integer menuOrder;
    @SerializedName("post_type")
    private String postType;
    @SerializedName("post_mime_type")
    private String postMimeType;
    @SerializedName("comment_count")
    private String commentCount;
    @SerializedName("filter")
    private String filter;
    @SerializedName("likes_count")
    private String likesCount;
    @SerializedName("max_offer_price")
    private String maxOfferPrice;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;
    @SerializedName("distance")
    private String distance;
    @SerializedName("medium_image")
    private String mediumImage;
    @SerializedName("full_image")
    private String fullImage;
    @SerializedName("large_image")
    private String largeImage;
    @SerializedName("thumbnail_image")
    private String thumbnailImage;
    @SerializedName("community_url")
    private String communityUrl;
    @SerializedName("community_id")
    private Integer communityId;
    @SerializedName("attachments")
    private List<Attachment> attachments = new ArrayList<Attachment>();
    @SerializedName("postmetadetails")
    private Postmetadetails postmetadetails;
    @SerializedName("time_ago")
    private String timeAgo;
    @SerializedName("seller")
    private Seller seller;
    @SerializedName("tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     *
     * @return
     * The ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     *
     * @param ID
     * The ID
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     * The postAuthor
     */
    public String getPostAuthor() {
        return postAuthor;
    }

    /**
     *
     * @param postAuthor
     * The post_author
     */
    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    /**
     *
     * @return
     * The postDate
     */
    public String getPostDate() {
        return postDate;
    }

    /**
     *
     * @param postDate
     * The post_date
     */
    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    /**
     *
     * @return
     * The postDateGmt
     */
    public String getPostDateGmt() {
        return postDateGmt;
    }

    /**
     *
     * @param postDateGmt
     * The post_date_gmt
     */
    public void setPostDateGmt(String postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    /**
     *
     * @return
     * The postContent
     */
    public String getPostContent() {
        return postContent;
    }

    /**
     *
     * @param postContent
     * The post_content
     */
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    /**
     *
     * @return
     * The postTitle
     */
    public String getPostTitle() {
        return postTitle;
    }

    /**
     *
     * @param postTitle
     * The post_title
     */
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    /**
     *
     * @return
     * The postExcerpt
     */
    public String getPostExcerpt() {
        return postExcerpt;
    }

    /**
     *
     * @param postExcerpt
     * The post_excerpt
     */
    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    /**
     *
     * @return
     * The postStatus
     */
    public String getPostStatus() {
        return postStatus;
    }

    /**
     *
     * @param postStatus
     * The post_status
     */
    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    /**
     *
     * @return
     * The commentStatus
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     *
     * @param commentStatus
     * The comment_status
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     *
     * @return
     * The pingStatus
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     *
     * @param pingStatus
     * The ping_status
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    /**
     *
     * @return
     * The postPassword
     */
    public String getPostPassword() {
        return postPassword;
    }

    /**
     *
     * @param postPassword
     * The post_password
     */
    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    /**
     *
     * @return
     * The postName
     */
    public String getPostName() {
        return postName;
    }

    /**
     *
     * @param postName
     * The post_name
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     *
     * @return
     * The toPing
     */
    public String getToPing() {
        return toPing;
    }

    /**
     *
     * @param toPing
     * The to_ping
     */
    public void setToPing(String toPing) {
        this.toPing = toPing;
    }

    /**
     *
     * @return
     * The pinged
     */
    public String getPinged() {
        return pinged;
    }

    /**
     *
     * @param pinged
     * The pinged
     */
    public void setPinged(String pinged) {
        this.pinged = pinged;
    }

    /**
     *
     * @return
     * The postModified
     */
    public String getPostModified() {
        return postModified;
    }

    /**
     *
     * @param postModified
     * The post_modified
     */
    public void setPostModified(String postModified) {
        this.postModified = postModified;
    }

    /**
     *
     * @return
     * The postModifiedGmt
     */
    public String getPostModifiedGmt() {
        return postModifiedGmt;
    }

    /**
     *
     * @param postModifiedGmt
     * The post_modified_gmt
     */
    public void setPostModifiedGmt(String postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    /**
     *
     * @return
     * The postContentFiltered
     */
    public String getPostContentFiltered() {
        return postContentFiltered;
    }

    /**
     *
     * @param postContentFiltered
     * The post_content_filtered
     */
    public void setPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
    }

    /**
     *
     * @return
     * The postParent
     */
    public Integer getPostParent() {
        return postParent;
    }

    /**
     *
     * @param postParent
     * The post_parent
     */
    public void setPostParent(Integer postParent) {
        this.postParent = postParent;
    }

    /**
     *
     * @return
     * The guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     *
     * @param guid
     * The guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     *
     * @return
     * The menuOrder
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     *
     * @param menuOrder
     * The menu_order
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     *
     * @return
     * The postType
     */
    public String getPostType() {
        return postType;
    }

    /**
     *
     * @param postType
     * The post_type
     */
    public void setPostType(String postType) {
        this.postType = postType;
    }

    /**
     *
     * @return
     * The postMimeType
     */
    public String getPostMimeType() {
        return postMimeType;
    }

    /**
     *
     * @param postMimeType
     * The post_mime_type
     */
    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType;
    }

    /**
     *
     * @return
     * The commentCount
     */
    public String getCommentCount() {
        return commentCount;
    }

    /**
     *
     * @param commentCount
     * The comment_count
     */
    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    /**
     *
     * @return
     * The filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     *
     * @param filter
     * The filter
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     *
     * @return
     * The likesCount
     */
    public String getLikesCount() {
        return likesCount;
    }

    /**
     *
     * @param likesCount
     * The likes_count
     */
    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    /**
     *
     * @return
     * The maxOfferPrice
     */
    public String getMaxOfferPrice() {
        return maxOfferPrice;
    }

    /**
     *
     * @param maxOfferPrice
     * The max_offer_price
     */
    public void setMaxOfferPrice(String maxOfferPrice) {
        this.maxOfferPrice = maxOfferPrice;
    }

    /**
     *
     * @return
     * The lat
     */
    public String getLat() {
        return lat;
    }

    /**
     *
     * @param lat
     * The lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     *
     * @return
     * The lng
     */
    public String getLng() {
        return lng;
    }

    /**
     *
     * @param lng
     * The lng
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     *
     * @return
     * The distance
     */
    public String getDistance() {
        return distance;
    }

    /**
     *
     * @param distance
     * The distance
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /**
     *
     * @return
     * The mediumImage
     */
    public String getMediumImage() {
        return mediumImage;
    }

    /**
     *
     * @param mediumImage
     * The medium_image
     */
    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    /**
     *
     * @return
     * The fullImage
     */
    public String getFullImage() {
        return fullImage;
    }

    /**
     *
     * @param fullImage
     * The full_image
     */
    public void setFullImage(String fullImage) {
        this.fullImage = fullImage;
    }

    /**
     *
     * @return
     * The largeImage
     */
    public String getLargeImage() {
        return largeImage;
    }

    /**
     *
     * @param largeImage
     * The large_image
     */
    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    /**
     *
     * @return
     * The thumbnailImage
     */
    public String getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     *
     * @param thumbnailImage
     * The thumbnail_image
     */
    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    /**
     *
     * @return
     * The communityUrl
     */
    public String getCommunityUrl() {
        return communityUrl;
    }

    /**
     *
     * @param communityUrl
     * The community_url
     */
    public void setCommunityUrl(String communityUrl) {
        this.communityUrl = communityUrl;
    }

    /**
     *
     * @return
     * The communityId
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     *
     * @param communityId
     * The community_id
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**
     *
     * @return
     * The attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     *
     * @param attachments
     * The attachments
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     *
     * @return
     * The postmetadetails
     */
    public Postmetadetails getPostmetadetails() {
        return postmetadetails;
    }

    /**
     *
     * @param postmetadetails
     * The postmetadetails
     */
    public void setPostmetadetails(Postmetadetails postmetadetails) {
        this.postmetadetails = postmetadetails;
    }

    /**
     *
     * @return
     * The timeAgo
     */
    public String getTimeAgo() {
        return timeAgo;
    }

    /**
     *
     * @param timeAgo
     * The time_ago
     */
    public void setTimeAgo(String timeAgo) {
        this.timeAgo = timeAgo;
    }

    /**
     *
     * @return
     * The seller
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     *
     * @param seller
     * The seller
     */
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    /**
     *
     * @return
     * The tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}
