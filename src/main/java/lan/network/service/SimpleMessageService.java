package lan.network.service;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class SimpleMessageService implements  MessageService{

  @Override
  public String getMessage() {
    return "Hello. This message is deliverd by CDI.";
  }
  
}
