package com.litongjava.http.echo.json.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassPathUtils {

  public static byte[] getClasspathBytes(String resourcePath) throws URISyntaxException, IOException {
    URL url = ClassPathUtils.class.getClassLoader().getResource(resourcePath);
    java.nio.file.Path path = Paths.get(url.toURI());
    byte[] bytes = Files.readAllBytes(path);
    return bytes;
  }
}
