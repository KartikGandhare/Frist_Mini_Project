package com.kartik.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;
	
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name = "ACTIVE_SWITCHL")
   private	Character activeSwitch;

	@Column(name = "CONTACT_EMAIL")
   private	LocalDate createdDate;
	
	@Column(name = "CREATED_DATE")
   private	LocalDate  updateDate;


}
