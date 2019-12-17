package com.asterix;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController 
{
	
	@RequestMapping(value="/addNumbers",method=RequestMethod.GET)
	public ModelAndView add(@RequestParam int num1,@RequestParam int num2)
	{
		int num3=num1+num2;
		
		ModelAndView mv=new ModelAndView("addition");
		mv.addObject("addition", num3);
		
		return mv;
		
	}

}
