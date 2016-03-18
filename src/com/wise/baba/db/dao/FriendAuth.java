package com.wise.baba.db.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table FRIEND_AUTH.
 */
public class FriendAuth {

    private String id;
    private String friendId;
    private Integer authCode;

    public FriendAuth() {
    }

    public FriendAuth(String id, String friendId, Integer authCode) {
        this.id = id;
        this.friendId = friendId;
        this.authCode = authCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public Integer getAuthCode() {
        return authCode;
    }

    public void setAuthCode(Integer authCode) {
        this.authCode = authCode;
    }

}
