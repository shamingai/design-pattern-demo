package ChainOfResponsibilities;

import java.util.List;
import java.util.ArrayList;
/**
 * 实现Filter非常重要，FilterChain也可直接调用doFilter方法
 * 
 * @author zhaotong
 *
 */
public class FilterChain implements Filter {
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
