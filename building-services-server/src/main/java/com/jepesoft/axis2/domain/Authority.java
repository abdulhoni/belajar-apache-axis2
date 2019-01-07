package com.jepesoft.axis2.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author jp
 */
@AllArgsConstructor
@Data
public class Authority implements Serializable {

   private String id;
   private String authority;
}
