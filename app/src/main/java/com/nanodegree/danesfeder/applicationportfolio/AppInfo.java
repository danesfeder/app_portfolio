package com.nanodegree.danesfeder.applicationportfolio;

/**
 * Created by plk5227 on 10/22/16.
 */
public class AppInfo {

    private String mainText;
    private String subText;

    public AppInfo(String mainText, String subText) {
        this.mainText = mainText;
        this.subText = subText;
    }

    public String getMainText() {
        return mainText;
    }

    public String getSubText() {
        return subText;
    }
}
