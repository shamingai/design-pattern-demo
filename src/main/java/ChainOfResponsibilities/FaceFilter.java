package ChainOfResponsibilities;

/**
 * 表情转换-示例
 * @author zhaotong
 *
 */
public class FaceFilter implements Filter {

	public String doFilter(String str) {
		String r = str.replace(":)", "^v^");
		return r;
	}

}
