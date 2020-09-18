package siva.ms.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClientBean {
	@Value("${test.msg}")
	  private String msg1;

	  @Value("${test.msg}")
	  private String msg2;

	  @PostConstruct
	  public void postConstruct() {
	      System.out.println(msg1);
	      System.out.println(msg2);
	  }
}
