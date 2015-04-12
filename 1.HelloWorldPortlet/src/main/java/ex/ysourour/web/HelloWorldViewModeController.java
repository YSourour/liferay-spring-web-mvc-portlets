package ex.ysourour.web;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@RequestMapping("view")
@Controller
public class HelloWorldViewModeController {
	@RenderMapping
	public String defaultRender(Model model,RenderRequest request,RenderResponse response){
		return "index";
	}

}
