package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import repository.IRepository;
import repository.impl.TxtRepository;
import service.MessageService;
import service.impl.MessageServiceImpl;


@ComponentScan(basePackages = {
		"repository",
		"main"
})
public class MyBeanConfig {
	
	@Bean (name = "messageServiceTxt")
	public MessageService getmessageServiceTxt (@Qualifier("txtRepository")IRepository iRepository) {
		return new MessageServiceImpl(iRepository);
	}
	
	@Bean (name = "messageServiceXml")
	public MessageService getmessageServiceXml (@Qualifier("xmlRepository")IRepository iRepository) {
		return new MessageServiceImpl(iRepository);
	}
	
	
}
