/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jepesoft.axis2.service;

import org.apache.axiom.om.OMElement;

/**
 *
 * @author jp
 */
public class UsersService {

   public String ping(String text) {
    if (text == null) {
      return "Service is up and available";
    }
    return "Service is up and available, message: " + text;
  }
}
