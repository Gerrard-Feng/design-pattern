package com.gerrard.design_pattern.u04_prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Policy2 implements Serializable {

	private static final long serialVersionUID = 6091226403022425983L;

	private String code;
	private int applicantAge;
	private Liability liability;
	private List<String> specialDescriptions;

	public Policy2 deepClone() throws ClassNotFoundException, IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (Policy2) ois.readObject();
	}

}
