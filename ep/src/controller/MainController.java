package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import beans.MyBean;

@Controller
@RequestMapping("/demo")
public class MainController {

	@RequestMapping
	public String simple(){
		return "simple";
	}
	
	@RequestMapping("/b2")
	public String beispielMitModel(Model model){
		
		model.addAttribute("text","Das ist ein Text");
		return "modelExample";
	}
	
	@RequestMapping("/b3")
	public String beispielMitParameter(Model model,@RequestParam(value = "zahl", required = false, defaultValue = "3") int zahl){
		model.addAttribute("text", zahl);
		return "modelExample";
	}
	
	@RequestMapping("/b4/{id}")
	public String beispielMitPfadVar(Model model,@PathVariable int id){
		model.addAttribute("text", id);
		return "modelExample";
	}
	
	@RequestMapping("/b5")
	@ResponseBody
	public MyBean returnJson(){
		MyBean myBean = new MyBean();
		myBean.setI(5);
		
		return myBean;
	}
	
	@RequestMapping("/b6")
	public String cNExample(){
		return "simple";
	}
	
}
