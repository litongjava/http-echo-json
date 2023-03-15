package com.litongjava.http.echo.json.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.litongjava.http.echo.json.model.Flickr;
import com.litongjava.http.echo.json.model.Photo;
import com.litongjava.http.echo.json.utils.PhotosJsonUtils;

public class FlickrService {

  
  public HashMap<String,Map<String,List<Photo>>> index(Flickr flickr) {
    if(Flickr.FLICKR_PHOTOS_GETRECENT.equals(flickr.getMethod())) {
      return getRecent(flickr);
    }else if(Flickr.FLICKR_PHOTOS_SEARCH.equals(flickr.getMethod())) {
      return searh(flickr);
    }
    return null;
  }

  public HashMap<String, Map<String, List<Photo>>> searh(Flickr flickr) {
    return PhotosJsonUtils.buildSearch(flickr.getText());
  }

  public HashMap<String, Map<String, List<Photo>>> getRecent(Flickr flickr) {
    return PhotosJsonUtils.build();
  }

}
