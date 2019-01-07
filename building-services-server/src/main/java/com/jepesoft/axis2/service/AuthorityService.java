/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jepesoft.axis2.service;

import com.jepesoft.axis2.domain.Authority;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jp
 */
public class AuthorityService {

   public Authority findById(String id) {
      return new Authority("A01", "MANAGER");
   }
   
   public List<Authority> findAll() {
      List<Authority> list = new ArrayList<Authority>();
      list.add(new Authority("A01", "MANAGER"));
      list.add(new Authority("A02", "ADMIN"));
      list.add(new Authority("A03", "KASIR"));
      return list;
   }
   
   
   public Authority save() {
      return new Authority("A01", "MANAGER");
   }
   
   public Authority update() {
      return new Authority("A01", "MANAGER");
   }
   
   public void delete() {
      
   }
}
