package info.fzhen.wstx.test.services;

import javax.jws.WebService;

@WebService(name = "HelloService", targetNamespace = "http://www.fzhen.info/wstx")
public interface HelloService {
	public String sayHello();
}
