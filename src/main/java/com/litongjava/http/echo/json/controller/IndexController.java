package com.litongjava.http.echo.json.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/")
public class IndexController extends Controller {
  public void index() {
    renderText("this is index");
  }
}
