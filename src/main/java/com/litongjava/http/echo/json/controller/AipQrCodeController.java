package com.litongjava.http.echo.json.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("api/qrcode")
public class AipQrCodeController extends Controller {

  public void index() {
    // 二维码携带的数据
    String data = "weixin://wxpay/bizpayurl?appid=xx&mch_id=xx......";
    // 渲染二维码图片，长度与宽度为 200 像素
    renderQrCode(data, 200, 200);
  }
}
