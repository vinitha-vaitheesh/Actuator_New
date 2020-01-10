package com.example.SpringActuatorExp.main;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
@Component
public class healthCheck implements HealthIndicator {

	@Override
	public Health health() {
		int errorcode = check();
		if(errorcode!=0) {
			return Health.down().withDetail("with errorCode", errorcode).build();
		}
		return Health.up().withDetail("I am UP", errorcode).build();
	}
	public int check() {
		return 0;
	}

}
