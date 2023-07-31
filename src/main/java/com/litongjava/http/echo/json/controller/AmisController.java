package com.litongjava.http.echo.json.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

/**
 * @author litongjava@qq.com on 2023/4/8 7:39
 */
@Path("amins")
public class AmisController extends Controller {
  public void index() {
    renderText("index");
  }
}
