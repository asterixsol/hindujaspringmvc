package com.asterix;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PalindromeController
{
	
	@RequestMapping(value="/checkPalindrome",method=RequestMethod.GET)
	public ModelAndView checkPalindrome(@RequestParam String text)
	{
		StringBuffer sb=new StringBuffer(text);
		sb=sb.reverse();
		String reverse=sb.toString();
		
		ModelAndView mv=new ModelAndView("palindrome");
		
		if(text.equalsIgnoreCase(reverse))
		{
			mv.addObject("result","It is a Palindrome");
		}
		else
		{
			mv.addObject("result","It is not a Palindrome");
		}
		
		return mv;
	}

}
