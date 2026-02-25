package MiniProject;

public class LoggerSIngleton {
	private static final LoggerSIngleton instance=new LoggerSIngleton();
	private LoggerSIngleton() {}
	public static LoggerSIngleton getInstance() {
		return instance;
	}
	public void log(String msg) {
		System.out.println("[LOG] "+msg);
	}
}
