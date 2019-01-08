/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jepesoft.axis2.service;

import javax.xml.stream.XMLStreamException;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;

/**
 *
 * @author jp
 */
public class SampleService {

//   public OMElement sayHello(OMElement element) throws XMLStreamException {
//      element.build();
//      element.detach();
//
//      String rootName = element.getLocalName();
//      System.out.println("Reading " + rootName + " element");
//
//      OMElement childElement = element.getFirstElement();
//      String personToGreet = childElement.getText();
//
//      OMFactory fac = OMAbstractFactory.getOMFactory();
//      OMNamespace omNs = fac.createOMNamespace("http://example1.org/example1", "example1");
//      OMElement method = fac.createOMElement("sayHelloResponse", omNs);
//      OMElement value = fac.createOMElement("greeting", omNs);
//      value.addChild(fac.createOMText(value, "Hello, " + personToGreet));
//      method.addChild(value);
//
//      return method;
//   }
//
//   private void ping() {
//   }
   public void doInOnly() {
      return;
   }

   public String noParameters() {
      return "Hello";
   }

   public String twoWayOneParameterEcho(String toEcho) {
      return toEcho;
   }

   public boolean multipleParametersAdd(float price, int itemId, String description, String itemName) {
      //Code to handle the logic
      return true;
   }

}
