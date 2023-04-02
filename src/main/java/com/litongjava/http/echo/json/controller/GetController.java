package com.litongjava.http.echo.json.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.ext.cors.EnableCORS;

@Path("get")
@EnableCORS
public class GetController extends Controller {

  public void index() {
    renderText("this is get");
  }
}
