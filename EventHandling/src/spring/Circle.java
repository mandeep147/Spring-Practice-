package spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shapes, ApplicationEventPublisherAware{

	private Point center;
	private ApplicationEventPublisher publish;
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw(){
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Greeting!", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Point!", null));
		System.out.println("Inside Circle: " + this.messageSource.getMessage("greeting", null, "Default Greeting!", null));
		
		//to publish custom events
		DrawEvent draw = new DrawEvent(this);
		publish.publishEvent(draw);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publish = publisher;
	}
}