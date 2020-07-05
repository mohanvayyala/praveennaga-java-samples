package com.praveennaga.others;

public final class CustomImmutable {
	private final String sName;
	private final StringBuffer sbName;

	public CustomImmutable(String sName, StringBuffer sbName) {
		this.sName = sName;
		this.sbName = sbName;
	}

	public String getSName() {
		return sName;
	}

	public StringBuffer getsbName() { // return copy of mutable instance variable rather than returning original object.
										
		return new StringBuffer(sbName.toString());
	}

}
