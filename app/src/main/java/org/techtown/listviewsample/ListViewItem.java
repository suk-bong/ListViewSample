package org.techtown.listviewsample;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable iconDrawable;
    private String titleStr;
    private String descStr;


    //SET 세팅
    public void setIcon(Drawable icon){
        iconDrawable = icon;
    }
    public void setTitle(String title){
        titleStr = title;
    }
    public void setDesc(String desc){
        descStr = desc;
    }

    //GET 세팅
    public Drawable getIcon(){
        return this.iconDrawable;
    }
    public String getTitle(){
        return this.titleStr;
    }
    public String getDesc(){
        return this.descStr;
    }

}
