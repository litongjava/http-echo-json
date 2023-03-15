package com.litongjava.http.echo.json.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;
import com.litongjava.http.echo.json.utils.PropKitUtils;

public class AppConfig extends JFinalConfig {

  public void configConstant(Constants me) {
    me.setDevMode(PropKitUtils.getBoolean("undertow.devMode"));
    // 开启对 jfinal web 项目组件 Controller、Interceptor、Validator 的注入
    me.setInjectDependency(true);
    
    // 开启对超类的注入。不开启时可以在超类中通过 Aop.get(...) 进行注入
    me.setInjectSuperClass(true);
  }

  public void configRoute(Routes me) {
    String basePackage = "com.litongjava.http.echo.json";
    me.scan(basePackage + ".controller.");

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