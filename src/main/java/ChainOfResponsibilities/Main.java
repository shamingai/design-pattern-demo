package ChainOfResponsibilities;

import java.awt.MenuComponent;

import VirtualRequestResponse.Request;
import VirtualRequestResponse.Response;


/**
 * Hello world!
 *
 */
public class Main 
{
//	@Override
//	Request request;
	
    public static void main( String[] args )
    {	    	
	    	
	    	FilterChain fc = new FilterChain();
	    fc.addFilter(new HTMLFilter());
	    fc.addFilter(new FaceFilter());
	    
	    	Request request = new Request();
	    	request.setRequestStr("个别词汇:)敏感、稳稳的收益、test；去重复：    、*******、77777777、敏感；特殊字符：|||<Script></Script>");
	    	Response response = new Response();
	    	
	    	MsgProcessor mp = new MsgProcessor();
	    	mp.setMsg(request.getRequestStr());
	    	mp.setFilterChain(fc);
	    	String result = 	mp.process();
	    	System.out.println(result);
	    	
	    	
	    	
////	    	//---------old-----------
//	    	String msg = "个别词汇:)敏感、稳稳的收益、test；去重复：    、*******、77777777、敏感；特殊字符：|||<Script></Script>";
//	    	
//	    	MsgProcessor mp = new MsgProcessor();
//	    	mp.setMsg(msg);
//	    	
//	    	FilterChain fc = new FilterChain();
//	    	fc.addFilter(new HTMLFilter())
//		    	.addFilter(new SesitiveFilter())
//		    	.addFilter(new FaceFilter());
//	    	
//	    	FilterChain fc2 = new FilterChain();
//	    	fc2.addFilter(new HTMLFilter())
//		    	.addFilter(new SesitiveFilter());
//	    	
//	    	fc.addFilter(fc2);
//	    	
//	    	mp.setFilterChain(fc);
//	    	String result = mp.process();
//	    System.out.println(result);
	    
    }
}
