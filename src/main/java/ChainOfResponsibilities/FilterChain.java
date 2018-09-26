package ChainOfResponsibilities;

import java.util.List;
import java.util.ArrayList;

public class FilterChain {
	List<Filter> filters = new ArrayList<Filter>();
	
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}

	public String doFilter(String str) {
		String r = str;
		for(Filter f: filters) {
			r = f.doFilter(r);
		}
		return r;
	}

}
