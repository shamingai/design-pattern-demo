package ChainOfResponsibilities;

public class MsgProcessor {

//	Filter[] filters = {new HTMLFilter(), new SesitiveFilter(), new FaceFilter()};
	
	public String process() {
		return filterChain.doFilter(msg);
	}
	
	
	String msg;

	FilterChain filterChain;

	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}

}
