package com.litongjava.http.echo.json.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author create by ping-e-lee on Aug 22, 2021 8:44:41 PM 
 * @version 1.0 
 * @desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private String name, address;
}
