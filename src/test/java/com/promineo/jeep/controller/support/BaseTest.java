
package com.promineo.jeep.controller.support;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import lombok.Getter;


public class BaseTest {
  @LocalServerPort
  private int serverPort;
  
  @Autowired
  @Getter
  private TestRestTemplate restTemplate;
  
  protected String getBaseUri() {
    return String.format("http://localhost:%d/jeeps", serverPort);
  }
  
  // I had to write the getRestTemplate() method manually because 
  //@Getter lombok annotation didn't work
  public TestRestTemplate getRestTemplate() {
    return restTemplate;
  }
}
