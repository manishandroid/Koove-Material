package com.koove.koovematerial.Model;

/**
 * Created by Manish on 10/19/2015.
 */
import com.google.gson.annotations.SerializedName;

public class Seller {

    @SerializedName("ID")
    private String ID;
    @SerializedName("user_login")
    private String userLogin;
    @SerializedName("user_pass")
    private String userPass;
    @SerializedName("user_nicename")
    private String userNicename;
    @SerializedName("user_email")
    private String userEmail;
    @SerializedName("user_url")
    private String userUrl;
    @SerializedName("user_registered")
    private String userRegistered;
    @SerializedName("user_activation_key")
    private String userActivationKey;
    @SerializedName("user_status")
    private String userStatus;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("spam")
    private String spam;
    @SerializedName("deleted")
    private String deleted;

    /**
     *
     * @return
     * The ID
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @param ID
     * The ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     * The userLogin
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     *
     * @param userLogin
     * The user_login
     */
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    /**
     *
     * @return
     * The userPass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     *
     * @param userPass
     * The user_pass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     *
     * @return
     * The userNicename
     */
    public String getUserNicename() {
        return userNicename;
    }

    /**
     *
     * @param userNicename
     * The user_nicename
     */
    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    /**
     *
     * @return
     * The userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     *
     * @param userEmail
     * The user_email
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     *
     * @return
     * The userUrl
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     *
     * @param userUrl
     * The user_url
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    /**
     *
     * @return
     * The userRegistered
     */
    public String getUserRegistered() {
        return userRegistered;
    }

    /**
     *
     * @param userRegistered
     * The user_registered
     */
    public void setUserRegistered(String userRegistered) {
        this.userRegistered = userRegistered;
    }

    /**
     *
     * @return
     * The userActivationKey
     */
    public String getUserActivationKey() {
        return userActivationKey;
    }

    /**
     *
     * @param userActivationKey
     * The user_activation_key
     */
    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    /**
     *
     * @return
     * The userStatus
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     *
     * @param userStatus
     * The user_status
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     *
     * @return
     * The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     *
     * @param displayName
     * The display_name
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     *
     * @return
     * The spam
     */
    public String getSpam() {
        return spam;
    }

    /**
     *
     * @param spam
     * The spam
     */
    public void setSpam(String spam) {
        this.spam = spam;
    }

    /**
     *
     * @return
     * The deleted
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     *
     * @param deleted
     * The deleted
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

}
