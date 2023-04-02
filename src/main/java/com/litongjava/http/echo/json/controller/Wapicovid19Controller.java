package com.litongjava.http.echo.json.controller;

import java.io.IOException;
import java.net.URISyntaxException;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.ext.cors.EnableCORS;
import com.litongjava.http.echo.json.utils.ClassPathUtils;

@Path("wapicovid19")
@EnableCORS
public class Wapicovid19Controller extends Controller {

  public void ncov() throws URISyntaxException, IOException {
    String resourcePath = "\\data\\wapicovid19\\ncov.json";
    byte[] bytes = ClassPathUtils.getClasspathBytes(resourcePath);
    JSONObject jsonObject = JSON.parseObject(bytes);
    renderJson(jsonObject);
  }

  public void all() throws URISyntaxException, IOException {
    renderJson(JSON.parseObject(ClassPathUtils.getClasspathBytes("\\data\\wapicovid19\\all.json")));
  }
}
