package com.ppdai.das.core.status;

import java.util.Calendar;
import java.util.Date;

public class DatabaseSetStatus extends BaseStatus implements DatabaseSetStatusMBean {
    private volatile String appId;
	private volatile String name;
	private volatile boolean markdown;
	private volatile Date markdownTime;
	
	public DatabaseSetStatus(String appId, String name) {
	    this.appId = appId;
		this.name = name;
	}
	
	public String getAppId() {
        return appId;
    }

    @Override
    public boolean isMarkdown() {
		return markdown;
	}
	@Override
    public void setMarkdown(boolean markdown) {
		this.markdown = markdown;
		markdownTime = Calendar.getInstance().getTime();
		changed();
	}
	
	@Override
    public String getName() {
		return name;
	}
	@Override
    public Date getMarkdownTime() {
		return markdownTime;
	}
}
