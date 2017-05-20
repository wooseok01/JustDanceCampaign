package com.justdance.campaign.model;

import java.io.Serializable;

public class GalleryInfo implements Serializable {
	private int gId;
	private String gName;
	private String gBackgroundUrl;
	private String gFontUrl;
	
	public GalleryInfo(){}

	public GalleryInfo(int gId, String gName, String gBackgroundUrl, String gFontUrl) {
		super();
		this.gId = gId;
		this.gName = gName;
		this.gBackgroundUrl = gBackgroundUrl;
		this.gFontUrl = gFontUrl;
	}

	public int getgId() {
		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgBackgroundUrl() {
		return gBackgroundUrl;
	}

	public void setgBackgroundUrl(String gBackgroundUrl) {
		this.gBackgroundUrl = gBackgroundUrl;
	}

	public String getgFontUrl() {
		return gFontUrl;
	}

	public void setgFontUrl(String gFontUrl) {
		this.gFontUrl = gFontUrl;
	}

	@Override
	public String toString() {
		return "GalleryInfo [gId=" + gId + ", gName=" + gName + ", gBackgroundUrl=" + gBackgroundUrl + ", gFontUrl="
				+ gFontUrl + "]\n";
	}
	
	
	
}
