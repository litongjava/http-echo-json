package com.litongjava.http.echo.json.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;

public class AppConfig extends JFinalConfig {


  public void configConstant(Constants me) {
    //me.setDevMode(true);
  }

  public void configRoute(Routes me) {
    String basePackage="com.litongjava.http.echo.json";
    me.scan(basePackage+".controller.");
  }

  public void configEngine(Engine me) {
  }

  public void configPlugin(Plugins me) {
  }

  public void configInterceptor(Interceptors me) {
  }

  public void configHandler(Handlers me) {
  }
}