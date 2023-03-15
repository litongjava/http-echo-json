package com.litongjava.http.echo.json.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.litongjava.http.echo.json.model.Photo;

public class PhotosJsonUtils {
  public static final String urlTemplate = "http://192.168.104.101/photos/%s.jpg";
  
  

  /**
   * 返回的json格式如下
   * @formatter:off 
{
  "photos": {
    "photo": [
      {
        "id": "123487091",
        "title": "pic_1",
        "url_s": "http://192.168.0.100:81/photos/1.jpg"
      },
      {
        "id": "123487092",
        "title": "pic_2",
        "url_s": "http://192.168.0.100:81/photos/2.jpg"
      },
      {
        "id": "123487098",
        "title": "pic_8",
        "url_s": "http://192.168.0.100:81/photos/8.jpg"
      },
      {
        "id": "123487099",
        "title": "pic_9",
        "url_s": "http://192.168.0.100:81/photos/9.jpg"
      }
    ]
  }
} 
   *@formatter:off
   */
  public static HashMap<String,Map<String,List<Photo>>> build() {
    List<Photo> photoList = new ArrayList<>();
    for(int i=0;i<10;i++) {
      photoList.add(new Photo(1+"","pic"+i,String.format(urlTemplate, i)));
    }
    Map<String, List<Photo>> photoMap = new HashMap<String,List<Photo>>(1);
    photoMap.put("photo", photoList);
    HashMap<String, Map<String, List<Photo>>> photosMap = new HashMap<String ,Map<String, List<Photo>>>();
    photosMap.put("photos", photoMap);
    return photosMap;
  }



  public static HashMap<String, Map<String, List<Photo>>> buildSearch(String text) {
    List<Photo> photoList = new ArrayList<>();
    for(int i=0;i<6;i++) {
      photoList.add(new Photo(i+"","pic"+i,String.format(urlTemplate, "cat"+i)));
    }
    Map<String, List<Photo>> photoMap = new HashMap<String,List<Photo>>(1);
    photoMap.put("photo", photoList);
    HashMap<String, Map<String, List<Photo>>> photosMap = new HashMap<String ,Map<String, List<Photo>>>();
    photosMap.put("photos", photoMap);
    return photosMap;
  }
}
