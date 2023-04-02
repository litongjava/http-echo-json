package com.litongjava.http.echo.json.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.core.paragetter.Para;
import com.jfinal.ext.cors.EnableCORS;
import com.litongjava.http.echo.json.model.Flickr;
import com.litongjava.http.echo.json.model.Photo;
import com.litongjava.http.echo.json.services.FlickrService;

import lombok.extern.slf4j.Slf4j;

@Path("services/rest")
@Slf4j
@EnableCORS
public class FlickrServiceController extends Controller {
  
  @Inject
  private FlickrService flickrService;
  /**
   * http://127.0.0.1/services/rest?method=flickr.photos.getRecent&api_key=1111&format=json&nojsonCallback=1
   * 
   * @param method
   * @param api_key
   * @param format
   * @param nojsonCallback
   */
  public void index(@Para("") Flickr flickr) {
    log.info("flicker:{}",flickr);
    HashMap<String, Map<String, List<Photo>>> result = flickrService.index(flickr);
    if(result!=null) {
      renderJson(result);
    }else {
      renderText("Error,pleass see log");
    }
  }
}
