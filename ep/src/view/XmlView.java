package view;

import java.io.ByteArrayOutputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

public class XmlView extends AbstractView {

	public XmlView() {
		setContentType("application/xml");
	}
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ByteArrayOutputStream myBaos = new ByteArrayOutputStream();

		myBaos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?><hello><world/></hello>".getBytes());
		
		writeToResponse(response,  myBaos);
	}

}
