package basica;

public class Processo {
	
	private int pid;
	private Object o;
	
	public Processo(int pid, Object o) {
		super();
		this.pid = pid;
		this.o = o;
	}
	
	public Processo() {
		super();
	}

	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public Object getO() {
		return o;
	}
	
	public void setO(Object o) {
		this.o = o;
	}
	
}
