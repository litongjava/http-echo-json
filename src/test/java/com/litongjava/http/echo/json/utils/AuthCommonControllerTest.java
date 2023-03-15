package com.litongjava.http.echo.json.utils;

import org.junit.Test;

public class AuthCommonControllerTest {

  @Test
  public void isDev() {
    System.out.println(isDev("localhost:8771", "localhost"));
  }

  private boolean isDev(String host, String active) {
    return ("127.0.0.1".equals(host) || "localhost".equals(host) || "localhost:8771".equals(host))
        && "localhost".equals(active);
  }
}