package org.cendra.ex.crud;

public class DeleteForeingObjectConflictException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2318806615342064874L;

	private String humanMsg = "Borrado no permitido. No está permitido que usted borre el ${object}, éste está siendo usado por otros componentes del sistema.";

	public DeleteForeingObjectConflictException() {
		super(
				"Se intento borrar un objeto que tiene referencias a otros objetos en la base de datos.");
	}

	public DeleteForeingObjectConflictException(Object condition) {
		super(
				"Se intento borrar un objeto que tiene referencias a otros objetos en la base de datos.. Condición de borrado: "
						+ condition);
	}
	
	public String getHumanMsg(String object) {
		return humanMsg.replace("${object}", object);
	}

	public String getHumanMsg() {
		return humanMsg.replace("${object}", "objeto");
	}

	public void setHumanMsg(String humanMsg) {
		this.humanMsg = humanMsg;
	}

}
