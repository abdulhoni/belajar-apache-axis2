package com.jepesoft.axis2.domain;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author jp
 */
@AllArgsConstructor
@Data
public class Users implements Serializable {

   private String id;
   private String username;
   private String password;
   private boolean enabled;
   private List<Authority> authorities;
   
}
