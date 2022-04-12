package com.nathit.newsapp;

import com.nathit.newsapp.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewApiResponse>{

    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);


}
