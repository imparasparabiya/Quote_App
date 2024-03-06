package com.example.quoteapp.QuoteModal;

public class QouteModalClass {

    public Integer quoteimg;
    public String quotename;

    public QouteModalClass(Integer quoteimg, String quotename){
        this.quoteimg = quoteimg;
        this.quotename = quotename;
    }
    public int getImg(){
        return quoteimg;
    }
    public String getQuotename(){
        return quotename;
    }
}
