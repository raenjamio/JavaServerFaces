package ar.planificador.menu;

public class DropDownMenuBean {
	 private String action;
	 private String doNew;
	 private String doSave;
	 private String doOpen;
	 private String doSaveAll;
	 private String doClose;
	 private String doExit;
	 
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getDoNew() {
		System.out.println("DropDownMenuBean.doNew()");
		return doNew;
	}
	public void setDoNew(String doNew) {
		this.doNew = doNew;
	}
	public String getDoSave() {
		return doSave;
	}
	public void setDoSave(String doSave) {
		this.doSave = doSave;
	}
	public String getDoOpen() {
		return doOpen;
	}
	public void setDoOpen(String doOpen) {
		this.doOpen = doOpen;
	}
	public String getDoSaveAll() {
		return doSaveAll;
	}
	public void setDoSaveAll(String doSaveAll) {
		this.doSaveAll = doSaveAll;
	}
	public String getDoClose() {
		return doClose;
	}
	public void setDoClose(String doClose) {
		this.doClose = doClose;
	}
	public String getDoExit() {
		return doExit;
	}
	public void setDoExit(String doExit) {
		this.doExit = doExit;
	}

}
