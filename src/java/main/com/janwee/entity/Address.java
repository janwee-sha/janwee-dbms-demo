package com.janwee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

@Entity
@Table(name = "JDD_ADDRESS")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@GenericGenerator(name="JDD_ID_GENERATOR",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
		@Parameter(name= SequenceStyleGenerator.SEQUENCE_PARAM,value ="SEQ_JDD")
})
public class Address extends AbstractEntity<Long> {
	private static final long serialVersionUID = 6445736888279260756L;
	@Column(name = "NAME", nullable = false)
	private String name;

	public Address(Long id) {
		super(id);
	}
}
