package com.litongjava.http.echo.json.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.litongjava.http.echo.json.model.Photo;

public class PhotosJsonUtilsTest {

  @Test
  public void testBuild() {
    HashMap<String, Map<String, List<Photo>>> buildResult = PhotosJsonUtils.build();
    String jsonString = JSON.toJSONString(buildResult);
    System.out.println(jsonString);
  }
  
  @Test
  public void stringTemplateFormat() {
    String stringTemplate=PhotosJsonUtils.urlTemplate;
    String formatResult = String.format(stringTemplate, 10);
    System.out.println(formatResult);
  }

}
