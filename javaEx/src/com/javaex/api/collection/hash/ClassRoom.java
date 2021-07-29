package com.javaex.api.collection.hash;

public class ClassRoom {
	
	private String subject;
	private String roomName;
	
	
	
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
	}

	
	
	@Override
	public String toString() {
		return "ClassRoom[subject=" + subject + ", roomName=" + roomName + "]";
	}

	@Override
	public int hashCode() {
		return subject.hashCode();
//		return super.hashCode(); // 메모리 주소기반
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			return obj.hashCode() == hashCode();
		}
		return super.equals(obj);
	}
	
	
	
	
	
	
	
	
	

}
