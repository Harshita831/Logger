package com.harshita.cs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.harshita.cs.utils.Constants;
/**
 * 
 * 
 *
 * @description Class for Event
 */
@Entity
public class Event {

	@Id
	private String id;

	@Column
	private long duration;

	@Column
	private String type;

	@Column
	private String host;

	@Column
	private boolean alert;

	public Event() {
	}

	// This constructor is used to set the alert value based on the duration of an event
	public Event(Log log, long duration) {
		this.id = log.getId();
		this.duration = duration;
		this.alert = duration > 4;

		if (log.getType() != null && log.getType().equals(Constants.APPLICATION_LOG)) {
			this.type = log.getType();
			this.host = log.getHost();
		}
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", duration=" + duration + ", type=" + type + ", host=" + host + ", alert=" + alert
				+ "]";
	}

}
