package com.litongjava.http.echo.json.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;
import com.jfinal.upload.UploadFile;

@Path("api/file")
public class ApiFileController extends Controller{

  public void upload() {
    UploadFile uploadFile = getFile();
    String uploadPath = uploadFile.getUploadPath();
    String fileName = uploadFile.getFileName();
    String contentType = uploadFile.getContentType();
    String originalFileName = uploadFile.getOriginalFileName();
    String parameterName = uploadFile.getParameterName();
    Kv kv = Kv.create();
    kv.set("uploadPath", uploadPath);
    kv.set("fileName", fileName);
    kv.set("contentType", contentType);
    kv.set("originalFileName", originalFileName);
    kv.set("parameterName", parameterName);
    renderJson(kv);
    
  }
  
  public void download() {
    
  }
}
