package com.gontuseries.hellocontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {

		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello "+name+ " You are from "+country);

		return model;
	}
        @RequestMapping(value = "/", method = RequestMethod.GET)
        public String viewIterate(Model model){
//           ModelAndView model = new ModelAndView();
            List<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");

        model.addAttribute("greeting", "Hello, World"); //greeting is key, value hello world
        //the jsp page will reference back to 'greeting' as above.
        model.addAttribute("stringList", stringList);
        model.addAttribute("stringlist2", "stringlist2");
            return "view";
        }
}