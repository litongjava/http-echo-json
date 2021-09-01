package com.litongjava.http.echo.json.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.litongjava.http.echo.json.model.User;

/**
 * @author create by ping-e-lee on Aug 22, 2021 8:43:00 PM
 * @version 1.0
 * @desc
 */
@Path("json")
public class JsonController extends Controller {

  public void getUser() {
    renderJson(new User("ping", "California"));
  }

  public void loadUser(String name) {
    System.out.println("name:"+name);
    renderJson(new User("ping", "California"));
  }
}