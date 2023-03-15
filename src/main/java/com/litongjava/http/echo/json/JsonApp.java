package com.litongjava.http.echo.json;

import com.jfinal.server.undertow.UndertowServer;
import com.litongjava.http.echo.json.config.AppConfig;

/**
 * @author create by ping-e-lee on Aug 22, 2021 8:41:20 PM
 * @version 1.0
 * @desc
 */
public class JsonApp {
  public static void main(String[] args) {
    UndertowServer.start(AppConfig.class);
  }
}