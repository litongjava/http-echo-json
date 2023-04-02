package com.litongjava.http.echo.json.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.ext.cors.EnableCORS;

@Path("/")
@EnableCORS
public class IndexController extends Controller {
  public void index() {
    renderText("this is index");
  }
}
