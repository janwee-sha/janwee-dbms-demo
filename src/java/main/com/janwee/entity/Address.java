package com.janwee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JDD_ADDRESS")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Address extends AbstractEntity<Long> {
	private static final long serialVersionUID = 6445736888279260756L;
	@Column(name = "NAME", nullable = false)
	private String name;

	public Address(Long id) {
		super(id);
	}
}
