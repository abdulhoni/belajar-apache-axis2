/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jepesoft.axis2.service;

/**
 *
 * @author jp
 * http://axis.apache.org/axis2/java/core/docs/userguide-buildingservices.html#buildservices
 * Deploying Plain Old Java Objects (POJOs)
 */
public class SampleService {
   
   public void doInOnly() {
      return;
   }

   public String noParameters() {
      return "Hello";
   }

   public String twoWayOneParameterEcho(String toEcho) {
      return toEcho;
   }

   public boolean multipleParametersAdd(
      float price,
      int itemId,
      String description,
      String itemName
   ) {
      //Code to handle the logic
      return true;
   }

}
