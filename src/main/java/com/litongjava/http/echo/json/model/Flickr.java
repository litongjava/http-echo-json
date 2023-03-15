package com.litongjava.http.echo.json.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flickr {
  public static final String FLICKR_PHOTOS_GETRECENT="flickr.photos.getRecent";
  public static final String FLICKR_PHOTOS_SEARCH="flickr.photos.search";
  private String method, api_key, format, text;
  private Integer nojsonCallback;
}
