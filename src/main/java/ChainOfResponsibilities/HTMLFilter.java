package ChainOfResponsibilities;

/**
 * 格式化特殊字符-示例
 * 
 * @author zhaotong
 *
 */
public class HTMLFilter implements Filter {

	public String doFilter(String str) {

		String r = str.replace("|", "")
				.replace("<", "[")
				.replaceAll(">", "]");
		return r;
	}

}
