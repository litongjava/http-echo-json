package com.litongjava.http.echo.json.controller;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.ext.cors.EnableCORS;

import lombok.extern.slf4j.Slf4j;

@Path("echo")
@Slf4j
@EnableCORS
public class EchoController extends Controller {

  public void index() {
    StringBuffer requestURL = getRequest().getRequestURL();

    Map<String, Object> result = new HashMap<>();

    Map<String, String> header = new HashMap<>();
    Map<String, String> body = new HashMap<>();
    // 获取头部
    Enumeration<String> headerNames = getRequest().getHeaderNames();
    if (headerNames.hasMoreElements()) {
      String name = headerNames.nextElement();
      String value = getRequest().getHeader(name);
      header.put(name, value);
    }

    // 获取body
    Map<String, String[]> parameterMap = getRequest().getParameterMap();
    for (Map.Entry<String, String[]> e : parameterMap.entrySet()) {
      String value = Arrays.toString(e.getValue());
      body.put(e.getKey(), value);
    }

    // rawData
    String rawData = getRawData();
    // 获取seesion
    String id = getSession().getId();
    // 获取cookie
    Map<String, String> cookies = new HashMap<>();
    Cookie[] cookieObjects = getCookieObjects();
    for (Cookie cookie : cookieObjects) {
      cookies.put(cookie.getName(), cookie.getValue());
    }
    String method = getRequest().getMethod();
    result.put("requestURL", requestURL.toString());
    result.put("method", method);
    result.put("header", header);
    result.put("body", body);
    result.put("raw", rawData);
    result.put("session", id);
    result.put("cookie", cookies);

    log.info("requestURL", requestURL.toString());
    log.info("method:{}", method);
    log.info("header:{}", header);
    log.info("body:{}", body);
    log.info("raw:{}", rawData);
    log.info("session:{}", id);
    log.info("cookie:{}", cookies);

    renderJson(result);
  }
}
