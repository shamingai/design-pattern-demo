package ChainOfResponsibilities;

/**
 * 特殊处理部分文字-示例
 * @author zhaotong
 *
 */
public class SesitiveFilter implements Filter {

	public String doFilter(String str) {

		String r = str.replace("收益", "")
				.replace("敏感", "**");
		return r;
	}

}
