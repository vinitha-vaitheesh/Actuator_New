package com.example.SpringActuatorExp.main;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
@Component
@Endpoint(id="custom")
public class CustomEndpoint{
	
	private Map<String,Feature> fea = new ConcurrentHashMap<>();
	
	@ReadOperation
	public Map<String, Feature> getFea() {
		return fea;
	}


	@ReadOperation
	public Feature getFeature(@Selector String arg0) {
		Feature f = new Feature();
		f.setEnabled(true);
		fea.put("get", f);
		return fea.get(arg0);
	}
	@WriteOperation
	
	public void postFeature(@Selector String arg0,Feature feature) {
		 fea.put(arg0,feature);
	}

	@DeleteOperation
	public void deleteFeture(@Selector String arg0) {
		fea.remove(arg0);
	}
	public static class Feature{
		private boolean enabled;

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		
	}

}
